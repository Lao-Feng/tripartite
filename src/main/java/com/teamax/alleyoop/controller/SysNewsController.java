package com.teamax.alleyoop.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teamax.alleyoop.common.annotation.SysLogAnnotation;
import com.teamax.alleyoop.common.shiro.PasswordHash;
import com.teamax.alleyoop.common.shiro.ShiroUser;
import com.teamax.alleyoop.common.util.R;
import com.teamax.alleyoop.common.util.StringUtils;
import com.teamax.alleyoop.dao.SysNewsMapper;
import com.teamax.alleyoop.dao.SysUserMapper;
import com.teamax.alleyoop.entity.*;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 系统用户相关控制器
 */
@ApiIgnore
@Controller
@RequestMapping("sys")
public class SysNewsController {
    @Resource
    SysNewsMapper sysNewsMapper;

    @ResponseBody
    @RequestMapping(path = "news/addOrUpdate.shtm")
    public R addOrUpdate(SysNews record) {
        record.setContent(record.getXxxx().getBytes());
        if(record.getId() ==null){
            sysNewsMapper.insertSelective(record);
        }else {
            sysNewsMapper.updateByPrimaryKeySelective(record);
        }
        return R.ok().put("msg","操作成功!");
    }

    @ResponseBody
    @RequestMapping(path = "news/list.shtm", method = RequestMethod.POST)
    public R listPage(@RequestParam Map<String, Object> params) {
        SysNewsExample example = new SysNewsExample();
        SysNewsExample.Criteria criteria = example.createCriteria();
        Integer pageNum = Integer.parseInt(params.get("pageNum").toString());
        Integer pageSize = Integer.parseInt(params.get("pageSize").toString());
        if( params.get("type") != null && !(params.get("type").toString()).equals("")){
            criteria.andTypeEqualTo(new Byte(params.get("type").toString()));
        }
        if( params.get("title") != null && !(params.get("title").toString()).equals("")){
            String title = params.get("title").toString();
            criteria.andTitleLike("%"+title+"%");
        }
        if( params.get("author") != null &&  !(params.get("author").toString()).equals("")){
            String author = params.get("author").toString();
            criteria.andAuthorLike("%"+author+"%");
        }
        PageHelper.startPage(pageNum,pageSize);
        List<SysNews>  list = sysNewsMapper.selectByExample(example);
        PageInfo<SysNews> pageInfo = new PageInfo<>(list);
        return R.ok().put("data",pageInfo);
    }

    @ResponseBody
    @RequestMapping(path = "news/batchDelete.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @SysLogAnnotation(value="删除帮助信息")
    public R batchDelete(@RequestBody Map<String, Object> params){
        List<Integer> list = new ArrayList<>();
        String ids = (String)params.get("ids");
        String [] strs = ids.split(",");
        for(String id : strs){
            list.add(new Integer(id));
        }
        SysNewsExample example = new SysNewsExample();
        SysNewsExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(list);
        sysNewsMapper.deleteByExample(example);
        return R.ok().put("msg","删除成功!");
    }

}