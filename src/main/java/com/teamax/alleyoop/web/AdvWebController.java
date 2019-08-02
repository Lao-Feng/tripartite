package com.teamax.alleyoop.web;

import com.teamax.alleyoop.common.json.JSON;
import com.teamax.alleyoop.common.util.Result;
import com.teamax.alleyoop.common.util.ResultUtil;
import com.teamax.alleyoop.dao.AdvRotatorMapper;
import com.teamax.alleyoop.dao.BusAdvertisementRollMapper;
import com.teamax.alleyoop.entity.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 广告接口服务
 */
@Controller
@RequestMapping("web")
@Api(tags={"Advertisement API"},description="广告相关接口")
public class AdvWebController {
    @Value("#{prop.fileHttp}")
    public String http;
    @Autowired
    AdvRotatorMapper advRotatorMapper;
    @Autowired
    BusAdvertisementRollMapper busAdvertisementRollMapper;

    @ApiOperation(value = "首页:图片滚动广告", httpMethod = "POST", notes = "获取图片广告列表", response = AdvRotator.class)
    @RequestMapping(value = "imageAdv/list.shtm")
    @JSON(type = AdvRotator.class, include="id,picture,url")
    public Result getImageAdvList() {
        AdvRotatorExample example = new AdvRotatorExample();
        AdvRotatorExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(1);
        List<AdvRotator> list = advRotatorMapper.selectByExample(example);
        for(AdvRotator rotator: list){
            if(rotator.getPicture()!=null){
                String pic0 = rotator.getPicture().split(";")[0];//取第一张图片
                rotator.setPicture(http+pic0);
            }
        }
        return ResultUtil.success(list);
    }

    @ApiOperation(value = "首页:商品滚动广告", httpMethod = "POST", notes = "获取商品推荐广告列表", response = BusCommondity.class)
    @RequestMapping(value = "commodityAdv/list.shtm")
    @JSON(type = BusCommondity.class, include="commondityCode,commodityName,lastSale,lowestAsk")
    public Result getCommodityAdvList() {
        List<BusCommondity> list = busAdvertisementRollMapper.getCommodityAdvList();
        return ResultUtil.success(list);
    }
}