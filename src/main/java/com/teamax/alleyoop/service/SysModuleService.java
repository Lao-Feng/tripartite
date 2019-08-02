package com.teamax.alleyoop.service;


import com.teamax.alleyoop.common.ztree.ZTreeNode;

import java.util.List;

public interface SysModuleService {

    /**
     * 根据角色ID获取功能菜单ZTree
     * @param roleId
     * @return
     */
    List<ZTreeNode> getZTreeByRoleId(Integer roleId);

}