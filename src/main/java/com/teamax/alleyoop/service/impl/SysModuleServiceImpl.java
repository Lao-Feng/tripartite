package com.teamax.alleyoop.service.impl;

import com.teamax.alleyoop.common.util.R;
import com.teamax.alleyoop.common.ztree.ZTreeNode;
import com.teamax.alleyoop.dao.RelRoleModuleMapper;
import com.teamax.alleyoop.dao.SysModuleMapper;
import com.teamax.alleyoop.entity.RelRoleModule;
import com.teamax.alleyoop.entity.RelRoleModuleExample;
import com.teamax.alleyoop.entity.SysModule;
import com.teamax.alleyoop.service.SysModuleService;
import com.teamax.alleyoop.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("sysModuleService")
public class SysModuleServiceImpl implements SysModuleService {

    @Autowired
    SysModuleMapper sysModuleMapper;
    @Autowired
    RelRoleModuleMapper relRoleModuleMapper;

    @Override
    @Transactional
    public List<ZTreeNode> getZTreeByRoleId(Integer roleId) {
        List<ZTreeNode> result = new ArrayList<>();
        result.add(new ZTreeNode("0","0","所有菜单",true));
        List<SysModule> modules = sysModuleMapper.selectByExample(null);
        for(SysModule module: modules){
            RelRoleModuleExample example = new RelRoleModuleExample();
            RelRoleModuleExample.Criteria criteria = example.createCriteria();
            criteria.andRoleIdEqualTo(roleId);
            criteria.andModuleIdEqualTo(module.getModuleId());
            ZTreeNode node = new ZTreeNode();
            node.setId(module.getModuleId()+"");
            node.setPid(module.getParentId()+"");
            node.setName(module.getModuleName());
            List<RelRoleModule> temp = relRoleModuleMapper.selectByExample(example);
            if(temp!=null && temp.size()>0){
                node.setChecked(true);
            }
            result.add(node);
        }
        return result;
    }
}
