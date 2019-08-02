package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.BusOrderFlow;
import com.teamax.alleyoop.entity.BusOrderFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BusOrderFlowMapper {
    long countByExample(BusOrderFlowExample example);

    int deleteByExample(BusOrderFlowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusOrderFlow record);

    int insertSelective(BusOrderFlow record);

    List<BusOrderFlow> selectByExample(BusOrderFlowExample example);

    BusOrderFlow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusOrderFlow record, @Param("example") BusOrderFlowExample example);

    int updateByExample(@Param("record") BusOrderFlow record, @Param("example") BusOrderFlowExample example);

    int updateByPrimaryKeySelective(BusOrderFlow record);

    int updateByPrimaryKey(BusOrderFlow record);
}