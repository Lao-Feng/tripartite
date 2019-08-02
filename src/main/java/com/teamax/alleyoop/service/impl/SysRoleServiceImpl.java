package com.teamax.alleyoop.service.impl;

import com.teamax.alleyoop.dao.RelRoleModuleMapper;
import com.teamax.alleyoop.entity.RelRoleModule;
import com.teamax.alleyoop.entity.RelRoleModuleExample;
import com.teamax.alleyoop.service.SysRoleService;
import com.teamax.alleyoop.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    RelRoleModuleMapper relRoleModuleMapper;

    @Override
    @Transactional
    public int warrant(List<Integer> moduleList, Integer roleId) {
        RelRoleModuleExample example = new RelRoleModuleExample();
        RelRoleModuleExample.Criteria criteria = example.createCriteria();
        criteria.andRoleIdEqualTo(roleId);
        relRoleModuleMapper.deleteByExample(example);
        for(Integer mId: moduleList){
            RelRoleModule module = new RelRoleModule();
            module.setModuleId(mId);module.setRoleId(roleId);
            relRoleModuleMapper.insertSelective(module);
        }
        return 1;
    }
}
