package com.teamax.alleyoop.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teamax.alleyoop.common.annotation.SysLogAnnotation;
import com.teamax.alleyoop.common.util.R;
import com.teamax.alleyoop.common.util.StringUtils;
import com.teamax.alleyoop.dao.SysRoleMapper;
import com.teamax.alleyoop.entity.SysRole;
import com.teamax.alleyoop.entity.SysRoleExample;
import com.teamax.alleyoop.entity.SysUser;
import com.teamax.alleyoop.entity.SysUserExample;
import com.teamax.alleyoop.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 系统角色相关控制器
 */
@ApiIgnore
@Controller
@RequestMapping("sys")
public class SysRoleController {
    @Resource
    SysRoleMapper sysRoleMapper;
    @Autowired
    SysRoleService sysRoleService;

    /**
     * 获取所有系统角色列表
     * @return
     */
    @RequestMapping("role/getRoleList.shtm")
    @ResponseBody
    public List<SysRole> getRoleList(){
        return sysRoleMapper.selectByExample(null);
    }

    /**
     * 分页获取角色列表
     * @param pageNum
     * @param pageSize
     * @param role
     * @return
     */
    @RequestMapping("role/list.shtm")
    @ResponseBody
    public R list(@RequestParam(value = "pageNum", required = true) int pageNum,
                           @RequestParam(value = "pageSize", required = true) int pageSize,
                           SysRole role){
        SysRoleExample example = new SysRoleExample();
        SysRoleExample.Criteria criteria = example.createCriteria();
        if(role.getRoleName() != null&&!"".equals(role.getRoleName())){
            criteria.andRoleNameLike("%"+role.getRoleName()+"%");
        }
        PageHelper.startPage(pageNum,pageSize);
        List<SysRole> result = sysRoleMapper.selectByExample(example);
        PageInfo<SysRole> pageInfo = new PageInfo<>(result);
        return R.ok().put("msg","查询成功").put("data",pageInfo);
    }


    @ResponseBody
    @RequestMapping(path = "role/addOrUpdate.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @SysLogAnnotation(value="新增/修改系统角色")
    public R addOrUpdate(SysRole role) {
        if(role.getRoleId()==null){//新增角色
            sysRoleMapper.insertSelective(role);
            return R.ok().put("msg","新增成功!").put("role",role);
        }else{
            sysRoleMapper.updateByPrimaryKeySelective(role);
            return R.ok().put("msg","修改成功!").put("role",role);
        }
    }

    @ResponseBody
    @RequestMapping(path = "role/batchDelete.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @SysLogAnnotation(value="删除角色信息")
    public R batchDelete(@RequestBody Map<String, Object> params){
        List<Integer> list = new ArrayList<>();
        String ids = (String)params.get("ids");
        String [] strs = ids.split(",");
        for(String id : strs){
            list.add(new Integer(id));
        }
        SysRoleExample example = new SysRoleExample();
        SysRoleExample.Criteria criteria = example.createCriteria();
        criteria.andRoleIdIn(list);
        sysRoleMapper.deleteByExample(example);
        return R.ok().put("msg","删除成功!");
    }

    @ResponseBody
    @RequestMapping(path = "role/warrant.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @SysLogAnnotation(value="角色授权")
    public R warrant(@RequestBody Map<String, Object> params){
        Integer roleId = Integer.parseInt(params.get("roleId").toString());//角色id
        String mIds = (String)params.get("mIds");//资源列表
        List<Integer> mlist = new ArrayList<>();
        if(!"".equals(mIds)){
            String [] strs = mIds.split(",");
            for(String id : strs){
                mlist.add(new Integer(id));
            }
        }
        sysRoleService.warrant(mlist,roleId);
        return R.ok().put("msg","授权成功!");
    }


}