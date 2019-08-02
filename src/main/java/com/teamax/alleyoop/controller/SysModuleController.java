package com.teamax.alleyoop.controller;

import com.teamax.alleyoop.common.annotation.SysLogAnnotation;
import com.teamax.alleyoop.common.util.R;
import com.teamax.alleyoop.common.ztree.ZTreeNode;
import com.teamax.alleyoop.dao.SysModuleMapper;
import com.teamax.alleyoop.entity.SysModuleExample;
import com.teamax.alleyoop.service.SysModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 功能菜单相关控制器
 */
@ApiIgnore
@Controller
@RequestMapping("sys")
public class SysModuleController {
    @Resource
    SysModuleMapper sysModuleMapper;
    @Autowired
    SysModuleService sysModuleService;

    @ResponseBody
    @RequestMapping(value = "role/getZTreeByRoleId.shtm",method = RequestMethod.POST)
    public R getZTreeByRoleId(Integer roleId) {
        List<ZTreeNode> nodes = sysModuleService.getZTreeByRoleId(roleId);
        return R.ok().put("msg","查询成功").put("nodes",nodes);
    }

}