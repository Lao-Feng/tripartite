package com.teamax.alleyoop.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teamax.alleyoop.common.util.R;
import com.teamax.alleyoop.dao.BusAccountMapper;
import com.teamax.alleyoop.entity.BusAccount;
import com.teamax.alleyoop.entity.BusAccountExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import java.util.List;

/**
 * 注册账户相关控制器
 */
@ApiIgnore
@Controller
@RequestMapping("account")
public class AccountController {
    @Autowired
    private TemplateEngine mailTemplateEngine;
    @Resource
    BusAccountMapper busAccountMapper;

    @ResponseBody
    @RequestMapping("test.shtm")
    public String sendTemplateMail() throws  Exception{
        //创建邮件正文
        //是导这个包import org.thymeleaf.context.Context;
        Context context = new Context();
        context.setVariable("username","Grey Wolf");
        //获取thymeleaf的html模板
        String emailContent= mailTemplateEngine.process("default", context);
        return emailContent;
    }

    /**
     * 分页获取账户信息
     * @param pageNum
     * @param pageSize
     * @param account
     * @return
     */
    @ResponseBody
    @RequestMapping("list.shtm")
    public R getPTUserList(@RequestParam(value = "pageNum", required = true) int pageNum,
                           @RequestParam(value = "pageSize", required = true) int pageSize,
                           BusAccount account){
        BusAccountExample example = new BusAccountExample();
        BusAccountExample.Criteria criteria = example.createCriteria();
        if(account.getUserName()!=null&&!"".equals(account.getUserName())){
            criteria.andUserNameLike("%"+account.getUserName()+"%");
        }
        if(account.getEmailAddress()!=null&&!"".equals(account.getEmailAddress())){
            criteria.andEmailAddressLike("%"+account.getEmailAddress()+"%");
        }
        PageHelper.startPage(pageNum,pageSize);
        List<BusAccount> result = busAccountMapper.selectByExample(example);
        PageInfo<BusAccount> pageInfo = new PageInfo<>(result);
        return R.ok().put("msg","查询成功").put("data",pageInfo);
    }



}