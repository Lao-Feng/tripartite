package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.BusAccountNotification;
import com.teamax.alleyoop.entity.BusAccountNotificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BusAccountNotificationMapper {
    long countByExample(BusAccountNotificationExample example);

    int deleteByExample(BusAccountNotificationExample example);

    int deleteByPrimaryKey(Integer accountCode);

    int insert(BusAccountNotification record);

    int insertSelective(BusAccountNotification record);

    List<BusAccountNotification> selectByExample(BusAccountNotificationExample example);

    BusAccountNotification selectByPrimaryKey(Integer accountCode);

    int updateByExampleSelective(@Param("record") BusAccountNotification record, @Param("example") BusAccountNotificationExample example);

    int updateByExample(@Param("record") BusAccountNotification record, @Param("example") BusAccountNotificationExample example);

    int updateByPrimaryKeySelective(BusAccountNotification record);

    int updateByPrimaryKey(BusAccountNotification record);
}