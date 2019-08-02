package com.teamax.alleyoop.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teamax.alleyoop.common.annotation.SysLogAnnotation;
import com.teamax.alleyoop.common.util.FileUtils;
import com.teamax.alleyoop.common.util.R;
import com.teamax.alleyoop.common.util.RegexUtils;
import com.teamax.alleyoop.common.util.StringUtils;
import com.teamax.alleyoop.dao.AdvRotatorMapper;
import com.teamax.alleyoop.dao.BusAdvertisementRollMapper;
import com.teamax.alleyoop.dao.BusCommondityMapper;
import com.teamax.alleyoop.dao.DicBrandMapper;
import com.teamax.alleyoop.entity.*;
import com.teamax.alleyoop.service.CommodityService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 广告相关控制器
 */
@ApiIgnore
@Controller
@RequestMapping("adv")
public class AdvertisementController {
    @Value("#{prop.fileHttp}")
    public String http;
    @Value("#{prop.fileSaveLocalPath}")
    public String fileSaveLocalPath;
    @Resource
    AdvRotatorMapper advRotatorMapper;
    @Resource
    BusAdvertisementRollMapper rollMapper;
    /**
     * 分页获取图片广告列表
     * @param pageNum
     * @param pageSize
     * @param rotator
     * @return
     */
    @ResponseBody
    @RequestMapping("image/list.shtm")
    public R imageList(@RequestParam(value = "pageNum", required = true) int pageNum,
                       @RequestParam(value = "pageSize", required = true) int pageSize,
                       AdvRotator rotator){
        AdvRotatorExample example = new AdvRotatorExample();
        AdvRotatorExample.Criteria criteria = example.createCriteria();
        if(rotator.getType()!=null&&!"".equals(rotator.getType())){
            criteria.andTypeEqualTo(rotator.getType());
        }
        PageHelper.startPage(pageNum,pageSize);
        List<AdvRotator> list = advRotatorMapper.selectByExample(example);
        for(AdvRotator bean:list){
            bean.setHttp(http);
        }
        PageInfo<AdvRotator> pageInfo = new PageInfo<>(list);
        return R.ok().put("msg","查询成功").put("data",pageInfo);
    }

    @ResponseBody
    @RequestMapping(path = "image/addOrUpdate.shtm", method = RequestMethod.POST)
    @SysLogAnnotation(value="新增/修改图片广告")
    public R addOrUpdate_category(@RequestParam(value = "imgs", required = false)List<MultipartFile> images,
                                  AdvRotator rotator) {
        boolean ok = RegexUtils.checkURL(rotator.getUrl());
        if(!ok){
            return R.error().put("msg","链接地址格式错误");
        }
        rotator.setModifyTime(new Date());
        if(rotator.getId()==null){
            advRotatorMapper.insertSelective(rotator);
        }else{
            advRotatorMapper.updateByPrimaryKeySelective(rotator);
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Integer id = rotator.getId();
        String path = fileSaveLocalPath + "adv//"+ id + "//";
        String pictures = "";
        for(MultipartFile img :images){
            File file = FileUtils.saveFile(img,path);
            String picture = "/adv/"+id+"/"+file.getName();
            pictures = pictures + picture + ";";
        }
        advRotatorMapper.updatePic(id,pictures);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        AdvRotator adv = advRotatorMapper.selectByPrimaryKey(id);
        return R.ok().put("msg","操作成功!").put("adv",adv).put("http",http);
    }

    @ResponseBody
    @RequestMapping(path = "image/batchDelete.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @SysLogAnnotation(value="删除图片广告")
    public R batchDelete(@RequestBody Map<String, Object> params){
        List<Integer> plist = new ArrayList<>();
        String ids = (String)params.get("ids");
        String [] strs = ids.split(",");
        for(String id : strs){
            plist.add(new Integer(id));
        }
        AdvRotatorExample example = new AdvRotatorExample();
        AdvRotatorExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(plist);
        advRotatorMapper.deleteByExample(example);
        return R.ok().put("msg","删除成功!");
    }

    @ResponseBody
    @RequestMapping(value = "picture/upload.shtm", method = RequestMethod.POST)
    @SysLogAnnotation(value = "上传广告图片")
    public R pictureUpload(@RequestParam(value = "imgs", required = false)List<MultipartFile> images,
                           Integer id) {
        String path = fileSaveLocalPath + "adv//"+ id + "//";
        String pictures = "";
        for(MultipartFile img :images){
            File file = FileUtils.saveFile(img,path);
            String picture = "/adv/"+id+"/"+file.getName();
            pictures = pictures + picture + ";";
        }
        advRotatorMapper.updatePic(id,pictures);
        AdvRotator adv = advRotatorMapper.selectByPrimaryKey(id);
        return R.ok().put("msg","上传成功!").put("adv",adv).put("http",http);
    }

    @ResponseBody
    @RequestMapping(value = "picture/delete.shtm",method = RequestMethod.POST)
    @SysLogAnnotation(value = "删除广告图片")
    public R pictureDelete(String picture,Integer id) {
        advRotatorMapper.deletePic(id,picture+";");
        File file = new File(fileSaveLocalPath + picture);
        file.delete();
        return R.ok("删除成功");
    }


    /**
     * 分页获取商品推广列表
     * @param pageNum
     * @param pageSize
     * @param adv
     * @return
     */
    @ResponseBody
    @RequestMapping("commodity/list.shtm")
    public R commodityList(@RequestParam(value = "pageNum", required = true) int pageNum,
                       @RequestParam(value = "pageSize", required = true) int pageSize,
                       BusAdvertisementRoll adv){
        BusAdvertisementRollExample example = new BusAdvertisementRollExample();
        BusAdvertisementRollExample.Criteria criteria = example.createCriteria();
        if(adv.getCommondityName()!=null&&!"".equals(adv.getCommondityName())){
            criteria.andCommondityNameLike("%"+adv.getCommondityName()+"%");
        }
        PageHelper.startPage(pageNum,pageSize);
        List<BusAdvertisementRoll> list = rollMapper.selectByExample(example);
        for(BusAdvertisementRoll roll: list){
            roll.getCommodity().setHttp(http);
        }
        PageInfo<BusAdvertisementRoll> pageInfo = new PageInfo<>(list);
        return R.ok().put("msg","查询成功").put("data",pageInfo);
    }

    @ResponseBody
    @RequestMapping(path = "commodity/add.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @SysLogAnnotation(value="新增商品推广广告")
    public R advCommodityAdd(BusAdvertisementRoll roll) {
        rollMapper.insertSelective(roll);
        return R.ok().put("msg","推广成功!");
    }

    @ResponseBody
    @RequestMapping(path = "commodity/batchDelete.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @SysLogAnnotation(value="删除商品推广")
    public R advCommodityBatchDelete(@RequestBody Map<String, Object> params){
        List<Integer> plist = new ArrayList<>();
        String ids = (String)params.get("ids");
        String [] strs = ids.split(",");
        for(String id : strs){
            plist.add(new Integer(id));
        }
        BusAdvertisementRollExample example = new BusAdvertisementRollExample();
        BusAdvertisementRollExample.Criteria criteria = example.createCriteria();
        criteria.andADCodeIn(plist);
        rollMapper.deleteByExample(example);
        return R.ok().put("msg","删除成功!");
    }

    @ResponseBody
    @RequestMapping(path = "commodity/{opt}.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @SysLogAnnotation(value="启动/停止商品推广")
    public R advStartOrStop(@PathVariable(value="opt") String opt,Integer ADCode){
        BusAdvertisementRoll adv = new BusAdvertisementRoll();
        adv.setADCode(ADCode);
        if("start".equals(opt)){//启动
            adv.setStatus(1);
        }else if("stop".equals(opt)){
            adv.setStatus(2);
        }
        rollMapper.updateByPrimaryKeySelective(adv);
        return R.ok().put("msg","操作成功!");
    }



}