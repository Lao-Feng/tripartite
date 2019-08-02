package com.teamax.alleyoop.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teamax.alleyoop.common.annotation.SysLogAnnotation;
import com.teamax.alleyoop.common.shiro.ShiroUser;
import com.teamax.alleyoop.common.util.FileUtils;
import com.teamax.alleyoop.common.util.R;
import com.teamax.alleyoop.dao.BusCommondityMapper;
import com.teamax.alleyoop.dao.BusCommonditySizeMapper;
import com.teamax.alleyoop.dao.DicBrandMapper;
import com.teamax.alleyoop.entity.BusCommondity;
import com.teamax.alleyoop.entity.BusCommondityExample;
import com.teamax.alleyoop.entity.BusCommonditySize;
import com.teamax.alleyoop.entity.DicBrand;
import com.teamax.alleyoop.service.CommodityService;
import org.apache.shiro.SecurityUtils;
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
 * 商品相关控制器
 */
@ApiIgnore
@Controller
@RequestMapping("commodity")
public class CommodityController {

    @Value("#{prop.fileHttp}")
    public String http;

    @Value("#{prop.fileSaveLocalPath}")
    public String fileSaveLocalPath;

    @Resource
    BusCommondityMapper commodityMapper;

    @Resource
    DicBrandMapper dicBrandMapper;

    @Resource
    CommodityService commodityService;
    /**
     * 分页获取商品列表
     * @param pageNum
     * @param pageSize
     * @param commodity
     * @return
     */
    @ResponseBody
    @RequestMapping("list.shtm")
    public R list(@RequestParam(value = "pageNum", required = true) int pageNum,
                           @RequestParam(value = "pageSize", required = true) int pageSize,
                           BusCommondity commodity){
        BusCommondityExample example = new BusCommondityExample();
        BusCommondityExample.Criteria criteria = example.createCriteria();
        if(commodity.getCategoryCode()!=null&&!"".equals(commodity.getCategoryCode())){
            criteria.andCategoryCodeEqualTo(commodity.getCategoryCode());
        }
        if(commodity.getCommodityName()!=null&&!"".equals(commodity.getCommodityName())){
            criteria.andCommodityNameLike("%"+commodity.getCommodityName()+"%");
        }
        PageHelper.startPage(pageNum,pageSize);
        List<BusCommondity> list = commodityMapper.selectByExample(example);
        for(BusCommondity bean:list){
            bean.setHttp(http);
        }
        PageInfo<BusCommondity> pageInfo = new PageInfo<>(list);
        return R.ok().put("msg","查询成功").put("data",pageInfo);
    }

    @ResponseBody
    @RequestMapping(path = "addOrUpdate.shtm", method = RequestMethod.POST)
    @SysLogAnnotation(value="新增/修改商品")
    public R addOrUpdate(@RequestParam(value = "imgs", required = false)List<MultipartFile> images,
                         BusCommondity commodity,
                         String commoditySizes) {
        List<String> sizeList = new ArrayList<>();
        String [] sizeArray = commoditySizes.split(",");
        for(String name : sizeArray){
            sizeList.add(name);
        }
        BusCommondity after = commodityService.addOrUpdateCommodity(commodity,sizeList);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Integer commondityCode = after.getCommondityCode();
        String path = fileSaveLocalPath + "commodity//"+ commondityCode + "//";
        String pictures = "";
        for(MultipartFile img :images){
            File file = FileUtils.saveFile(img,path);
            String picture = "/commodity/"+commondityCode+"/"+file.getName();
            pictures = pictures + picture + ";";
        }
        commodityMapper.updatePic(commondityCode,pictures);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        BusCommondity result = commodityMapper.selectByPrimaryKey(commodity.getCommondityCode());
        return R.ok().put("msg","操作成功!").put("commodity",result).put("http",http);

    }

    /**
     * 批量删除商品信息
     * @param params
     * @return
     */
    @ResponseBody
    @RequestMapping(path = "batchDelete.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @SysLogAnnotation(value="删除商品信息")
    public R batchDelete(@RequestBody Map<String, Object> params){
        List<Integer> plist = new ArrayList<>();
        String ids = (String)params.get("ids");
        String [] strs = ids.split(",");
        for(String id : strs){
            plist.add(new Integer(id));
        }
        BusCommondityExample example = new BusCommondityExample();
        BusCommondityExample.Criteria criteria = example.createCriteria();
        criteria.andCommondityCodeIn(plist);
        commodityMapper.deleteByExample(example);
        return R.ok().put("msg","删除成功!");
    }


    @ResponseBody
    @RequestMapping(value = "picture/upload.shtm", method = RequestMethod.POST)
    @SysLogAnnotation(value = "上传商品图片")
    public R pictureUpload(@RequestParam(value = "imgs", required = false)List<MultipartFile> images,
                     Integer commondityCode) {
        String path = fileSaveLocalPath + "commodity//"+ commondityCode + "//";
        String pictures = "";
        for(MultipartFile img :images){
            File file = FileUtils.saveFile(img,path);
            String picture = "/commodity/"+commondityCode+"/"+file.getName();
            pictures = pictures + picture + ";";
        }
        commodityMapper.updatePic(commondityCode,pictures);
        BusCommondity commodity = commodityMapper.selectByPrimaryKey(commondityCode);
        return R.ok().put("msg","上传成功!").put("commodity",commodity).put("http",http);
    }

    @ResponseBody
    @RequestMapping(value = "picture/delete.shtm",method = RequestMethod.POST)
    @SysLogAnnotation(value = "删除商品图片")
    public R pictureDelete(String picture,Integer commondityCode) {
        commodityMapper.deletePic(commondityCode,picture+";");
        File file = new File(fileSaveLocalPath + picture);
        file.delete();
        return R.ok("删除成功");
    }

    @ResponseBody
    @RequestMapping(value = "brand/picture/upload.shtm", method = RequestMethod.POST)
    @SysLogAnnotation(value = "上传品牌图片")
    public R brandPictureUpload(@RequestParam(value = "imgs", required = false)List<MultipartFile> images,
                           Integer brandCode) {
        String path = fileSaveLocalPath + "brand//";
        String pictures = "";
        for(MultipartFile img :images){
            File file = FileUtils.saveFile(img,path);
            String picture = "/brand/"+file.getName();
            pictures = pictures + picture + ";";
        }
        dicBrandMapper.updatePic(brandCode,pictures);
        DicBrand brand = dicBrandMapper.selectByPrimaryKey(brandCode);
        return R.ok().put("msg","上传成功!").put("brand",brand).put("http",http);
    }

    @ResponseBody
    @RequestMapping(value = "brand/picture/delete.shtm",method = RequestMethod.POST)
    @SysLogAnnotation(value = "删除品牌图片")
    public R brandPictureDelete(String picture,Integer brandCode) {
        dicBrandMapper.deletePic(brandCode,picture+";");
        File file = new File(fileSaveLocalPath + picture);
        file.delete();
        return R.ok("删除成功");
    }


}