package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.BusSearchHistory;
import com.teamax.alleyoop.entity.BusSearchHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BusSearchHistoryMapper {
    long countByExample(BusSearchHistoryExample example);

    int deleteByExample(BusSearchHistoryExample example);

    int deleteByPrimaryKey(Integer searchCode);

    int insert(BusSearchHistory record);

    int insertSelective(BusSearchHistory record);

    List<BusSearchHistory> selectByExample(BusSearchHistoryExample example);

    BusSearchHistory selectByPrimaryKey(Integer searchCode);

    int updateByExampleSelective(@Param("record") BusSearchHistory record, @Param("example") BusSearchHistoryExample example);

    int updateByExample(@Param("record") BusSearchHistory record, @Param("example") BusSearchHistoryExample example);

    int updateByPrimaryKeySelective(BusSearchHistory record);

    int updateByPrimaryKey(BusSearchHistory record);
}