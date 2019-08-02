package com.teamax.alleyoop.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teamax.alleyoop.common.annotation.SysLogAnnotation;
import com.teamax.alleyoop.common.shiro.ShiroUser;
import com.teamax.alleyoop.common.util.FileUtils;
import com.teamax.alleyoop.common.util.R;
import com.teamax.alleyoop.dao.BusCheckMapper;
import com.teamax.alleyoop.dao.BusOrderFlowMapper;
import com.teamax.alleyoop.dao.BusOrderMapper;
import com.teamax.alleyoop.entity.*;
import com.teamax.alleyoop.service.OrderService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 商品订单相关控制器
 */
@ApiIgnore
@Controller
@RequestMapping("order")
public class OrderController {
    @Value("#{prop.fileHttp}")
    public String http;
    @Value("#{prop.fileSaveLocalPath}")
    public String fileSaveLocalPath;
    @Resource
    BusOrderMapper busOrderMapper;
    @Resource
    BusCheckMapper busCheckMapper;
    @Resource
    OrderService orderService;
    @Resource
    BusOrderFlowMapper flowMapper;

    /**
     * 分页获取订单列表
     * @param pageNum
     * @param pageSize
     * @param order
     * @return
     */
    @ResponseBody
    @RequestMapping("list.shtm")
    public R list(@RequestParam(value = "pageNum", required = true) int pageNum,
                           @RequestParam(value = "pageSize", required = true) int pageSize,
                           BusOrder order,String progresses){
        List<String> plist = new ArrayList<>();
        String [] strs = progresses.split(",");
        for(String pro : strs){
            plist.add(pro);
        }
        BusOrderExample example = new BusOrderExample();
        BusOrderExample.Criteria criteria = example.createCriteria();
        criteria.andProgressIn(plist);
        if(order.getOrderCode()!=null&&!"".equals(order.getOrderCode())){
            criteria.andOrderCodeEqualTo(order.getOrderCode());
        }
        PageHelper.startPage(pageNum,pageSize);
        List<BusOrder> result = busOrderMapper.selectByExample(example);
        PageInfo<BusOrder> pageInfo = new PageInfo<>(result);
        return R.ok().put("msg","查询成功").put("data",pageInfo);
    }


    @ResponseBody
    @RequestMapping(path = "examine.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @SysLogAnnotation(value="验收卖家货物")
    public R examine(BusCheck check) {
        return orderService.examine(check);
    }

    @ResponseBody
    @RequestMapping(value = "examine/picture/upload.shtm", method = RequestMethod.POST)
    @SysLogAnnotation(value = "上传验货图片")
    public R examinePictureUpload(@RequestParam(value = "imgs", required = false)List<MultipartFile> images,
                                Integer checkCode) {
        String path = fileSaveLocalPath + "order//"+ checkCode + "//examine//";
        String pictures = "";
        for(MultipartFile img :images){
            File file = FileUtils.saveFile(img,path);
            String picture = "/order/"+checkCode+"/examine/"+file.getName();
            pictures = pictures + picture + ";";
        }
        busCheckMapper.updatePic(checkCode,pictures);
        BusCheck orderCheck = busCheckMapper.selectByPrimaryKey(checkCode);
        return R.ok().put("msg","上传成功!").put("orderCheck",orderCheck).put("http",http);
    }

    @ResponseBody
    @RequestMapping(value = "examine/picture/delete.shtm",method = RequestMethod.POST)
    @SysLogAnnotation(value = "删除验货图片")
    public R pictureDelete(String picture,Integer checkCode) {
        busCheckMapper.deletePic(checkCode,picture+";");
        File file = new File(fileSaveLocalPath + picture);
        file.delete();
        return R.ok();
    }

    @RequestMapping(path = "progress/change.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    @SysLogAnnotation(value="修改订单状态")
    public R changeProgress(Integer orderCode,String status) {
        ShiroUser user = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
        return orderService.changeProgress(orderCode,user.getUser().getUserId(),status);
    }

    /**
     * 获取订单流程
     * @param orderCode
     * @return
     */
    @RequestMapping(path = "getOrderFlow.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public List<BusOrderFlow> getFlowByOrderId(Integer orderCode){
        BusOrderFlowExample example = new BusOrderFlowExample();
        BusOrderFlowExample.Criteria criteria = example.createCriteria();
        criteria.andOrderCodeEqualTo(orderCode);
        example.setOrderByClause("FlowTime DESC");
        return flowMapper.selectByExample(example);
    }
}