package com.teamax.alleyoop.web;

import com.teamax.alleyoop.common.json.JSON;
import com.teamax.alleyoop.common.util.R1Result;
import com.teamax.alleyoop.common.util.Result1Util;
import com.teamax.alleyoop.dao.SysNewsMapper;
import com.teamax.alleyoop.entity.SysNews;
import com.teamax.alleyoop.entity.SysNewsExample;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * 平台相关接口服务
 */
@Controller
@RequestMapping("web")
@Api(tags={"System API"},description="平台信息相关接口")
public class SystemWebController {
    @Resource
    SysNewsMapper sysNewsMapper;

    @ApiOperation(value = "平台相关信息",notes = "获取平台相关信息", response = SysNews.class)
    @ApiImplicitParams({@ApiImplicitParam(paramType="query", name = "type", value = "信息类型：1-用户条款；2-隐私政策；3-常见问题；", required = true, dataType = "String")})
    @RequestMapping(path = "system/info.shtm", method = RequestMethod.GET)
    @JSON(type = SysNews.class, include="title,introduction,status,contentStr")
    public R1Result listPage(@Param(value="type") String type) {
        SysNewsExample example = new SysNewsExample();
        SysNewsExample.Criteria criteria = example.createCriteria();
        criteria.andTypeEqualTo(new Byte(type));
        List<SysNews> list = sysNewsMapper.selectByExampleWithBLOBs(example);
        if(list!=null&&list.size()>0){
            return Result1Util.success(list.get(0));
        }
        return Result1Util.error(400,"获取数据失败!");
    }
}