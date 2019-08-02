package com.teamax.alleyoop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teamax.alleyoop.dao.SysLogMapper;
import com.teamax.alleyoop.entity.SysLog;
import com.teamax.alleyoop.entity.SysLogExample;
import com.teamax.alleyoop.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sysLogService")
public class SysLogServiceImpl implements SysLogService {

    @Autowired
    private SysLogMapper sysLogMapper;

    @Override
    public PageInfo<SysLog> getLogsPaging(int pageNum, int pageSize, SysLogExample example) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum,pageSize);
        List<SysLog> result = sysLogMapper.selectByExample(example);
        PageInfo<SysLog> pageInfo = new PageInfo<>(result);
        return pageInfo;
    }
}
