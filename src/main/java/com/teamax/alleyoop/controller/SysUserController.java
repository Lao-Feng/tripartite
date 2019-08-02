package com.teamax.alleyoop.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teamax.alleyoop.common.annotation.SysLogAnnotation;
import com.teamax.alleyoop.common.shiro.PasswordHash;
import com.teamax.alleyoop.common.shiro.ShiroUser;
import com.teamax.alleyoop.common.util.R;
import com.teamax.alleyoop.common.util.StringUtils;
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
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 系统用户相关控制器
 */
@ApiIgnore
@Controller
@RequestMapping("sys")
public class SysUserController{
    @Autowired
    private PasswordHash passwordHash;
    @Resource
    SysUserMapper sysUserMapper;

    /**
     * 系统用户登录
     * @param username
     * @param password
     * @param rememberMe
     * @return
     * @throws IOException
     */
    @ResponseBody
    @RequestMapping(value = "user/login.shtm",method = RequestMethod.POST)
    @SysLogAnnotation(value = "系统用户登录",type = "1")
    public R login(String username,String password,@RequestParam(value = "rememberMe", defaultValue = "0" ,required = false) Integer rememberMe) {
        if (StringUtils.isBlank(username)) {
            R.error().put("msg","用户名不能为空");
        }
        if (StringUtils.isBlank(password)) {
            R.error().put("msg","密码不能为空");
        }
        Subject user = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        token.setRememberMe(1 == rememberMe);// 设置记住密码
        try {
            user.login(token);
            return R.ok();
        } catch (UnknownAccountException e) {
            return R.error().put("msg","账号不存在！");
        } catch (DisabledAccountException e) {
            return R.error().put("msg","账号未启用！");
        } catch (IncorrectCredentialsException e) {
            return R.error().put("msg","密码错误！");
        } catch (Throwable e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /**
     * 系统用户退出
     * @return
     */
    @RequestMapping("user/logout.shtm")
    @ResponseBody
    @SysLogAnnotation(value="系统用户退出",type = "1")
    public R logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return R.ok();
    }

    /**
     * 获取登录用户可操作菜单
     * @return
     */
    @RequestMapping("user/getModules.shtm")
    @ResponseBody
    public List<SysModule> getModulesByLoginUser(){
        ShiroUser user = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
        return user.getUser().getModules();
    }

    /**
     * 分页获取平台用户
     * @param pageNum
     * @param pageSize
     * @param sysUser
     * @return
     */
    @RequestMapping("user/list.shtm")
    @ResponseBody
    public R getPTUserList(@RequestParam(value = "pageNum", required = true) int pageNum,
                           @RequestParam(value = "pageSize", required = true) int pageSize,
                           SysUser sysUser){
        SysUserExample example = new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria();
        if(sysUser.getUserName() != null&&!"".equals(sysUser.getUserName())){
            criteria.andUserNameLike("%"+sysUser.getUserName()+"%");
        }
        if(sysUser.getLoginName() != null&&!"".equals(sysUser.getLoginName())){
            criteria.andLoginNameLike("%"+sysUser.getLoginName()+"%");
        }
        if(sysUser.getTel() != null&&!"".equals(sysUser.getTel())){
            criteria.andTelLike("%"+sysUser.getTel()+"%");
        }
        PageHelper.startPage(pageNum,pageSize);
        List<SysUser> result = sysUserMapper.selectByExample(example);
        PageInfo<SysUser> pageInfo = new PageInfo<>(result);
        return R.ok().put("msg","查询成功").put("data",pageInfo);
    }


    @ResponseBody
    @RequestMapping(path = "user/addOrUpdate.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @SysLogAnnotation(value="新增/修改用户")
    public R addOrUpdate(SysUser user) {
        if(user.getUserId()==null){//新增用户
            SysUser exist =  sysUserMapper.getSysUserByLoginName(user.getLoginName());
            if(exist != null){
                return R.error().put("msg","用户名已存在!");
            }else{
                String salt = StringUtils.getUUId();//加盐[密钥]
                String pwd  = passwordHash.toHex("123456", salt);//默认密码123456，加盐
                user.setSalt(salt);
                user.setPassword(pwd);
                sysUserMapper.insertSelective(user);
                return R.error().put("msg","新增成功!").put("user",user);
            }
        }else{
            SysUser exist =  sysUserMapper.getSysUserByLoginNameOther(user.getLoginName(),user.getUserId());
            if(exist != null){
                return R.error().put("msg","登录名已存在!");
            }else{
                sysUserMapper.updateByPrimaryKeySelective(user);
                return R.error().put("msg","修改成功!").put("user",user);
            }
        }
    }

    @ResponseBody
    @RequestMapping(path = "user/batchDelete.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @SysLogAnnotation(value="删除用户信息")
    public R batchDelete(@RequestBody Map<String, Object> params){
        List<Integer> list = new ArrayList<>();
        String ids = (String)params.get("ids");
        String [] strs = ids.split(",");
        for(String id : strs){
            list.add(new Integer(id));
        }
        SysUserExample example = new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdIn(list);
        sysUserMapper.deleteByExample(example);
        return R.ok().put("msg","删除成功!");
    }

    @ResponseBody
    @RequestMapping(path = "user/password/{opt}.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @SysLogAnnotation(value="重置/修改系统用户密码")
    public R changePassword(Integer userId,
                           @RequestParam(value = "password", defaultValue = "123456" ,required = false) String password,
                           @PathVariable(value="opt") String opt){
        String salt = StringUtils.getUUId();//加盐[密钥]
        String pwd  = passwordHash.toHex(password, salt);//默认密码123456，加盐
        sysUserMapper.updatePassword(userId,pwd,salt);
        if(opt.equals("reset")){
            return R.ok().put("msg","密码重置成功!");
        }
        return R.ok().put("msg","密码修改成功!");
    }

}