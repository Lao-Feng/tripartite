package com.teamax.alleyoop.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teamax.alleyoop.common.annotation.SysLogAnnotation;
import com.teamax.alleyoop.common.shiro.PasswordHash;
import com.teamax.alleyoop.common.shiro.ShiroUser;
import com.teamax.alleyoop.common.util.R;
import com.teamax.alleyoop.common.util.StringUtils;
import com.teamax.alleyoop.dao.SysLogMapper;
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
import java.util.List;
import java.util.Map;

/**
 * 系统日志相关控制器
 */
@ApiIgnore
@Controller
@RequestMapping("sys")
public class SysLogController {
    @Resource
    SysLogMapper sysLogMapper;

    /**
     * 分页获取平台日志
     * @param pageNum
     * @param pageSize
     * @param log
     * @return
     */
    @RequestMapping("log/list.shtm")
    @ResponseBody
    public R list(@RequestParam(value = "pageNum", required = true) int pageNum,
                           @RequestParam(value = "pageSize", required = true) int pageSize,
                           SysLog log){
        SysLogExample example = new SysLogExample();
        SysLogExample.Criteria criteria = example.createCriteria();
        if(log.getOperation() != null&&!"".equals(log.getOperation() )){
            criteria.andOperationLike("%"+log.getOperation() +"%");
        }
        if(log.getType() != null&&!"".equals(log.getType())){
            criteria.andTypeEqualTo(new Byte(log.getType()));
        }
        example.setOrderByClause("create_time desc");
        PageHelper.startPage(pageNum,pageSize);
        List<SysLog> result = sysLogMapper.selectByExample(example);
        PageInfo<SysLog> pageInfo = new PageInfo<>(result);
        return R.ok().put("msg","查询成功").put("data",pageInfo);
    }

    /**
     * 批量删除日志信息
     * @param params
     * @return
     */
    @ResponseBody
    @RequestMapping(path = "log/batchDelete.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @SysLogAnnotation(value="删除日志信息")
    public R batchDelete(@RequestBody Map<String, Object> params){
        List<Long> list = new ArrayList<>();
        String ids = (String)params.get("ids");
        String [] strs = ids.split(",");
        for(String id : strs){
            list.add(new Long(id));
        }
        SysLogExample example = new SysLogExample();
        SysLogExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(list);
        sysLogMapper.deleteByExample(example);
        return R.ok().put("msg","删除成功!");
    }



}