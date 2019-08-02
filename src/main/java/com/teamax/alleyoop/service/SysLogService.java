package com.teamax.alleyoop.service;

import com.github.pagehelper.PageInfo;
import com.teamax.alleyoop.entity.SysLog;
import com.teamax.alleyoop.entity.SysLogExample;

public interface SysLogService {

    PageInfo<SysLog> getLogsPaging(int pageNum, int pageSize, SysLogExample example);

}
