package com.teamax.alleyoop.service;


import java.util.List;

public interface SysRoleService {

    /**
     * 角色授权
     * @param moduleList
     * @param roleId
     * @return
     */
    int warrant(List<Integer> moduleList, Integer roleId);
}