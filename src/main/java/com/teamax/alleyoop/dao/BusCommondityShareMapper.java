package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.BusCommondityShare;
import com.teamax.alleyoop.entity.BusCommondityShareExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BusCommondityShareMapper {
    long countByExample(BusCommondityShareExample example);

    int deleteByExample(BusCommondityShareExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusCommondityShare record);

    int insertSelective(BusCommondityShare record);

    List<BusCommondityShare> selectByExample(BusCommondityShareExample example);

    BusCommondityShare selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusCommondityShare record, @Param("example") BusCommondityShareExample example);

    int updateByExample(@Param("record") BusCommondityShare record, @Param("example") BusCommondityShareExample example);

    int updateByPrimaryKeySelective(BusCommondityShare record);

    int updateByPrimaryKey(BusCommondityShare record);

    BusCommondityShare getShareInfoByCommodity(@Param("commodityCode") Integer commodityCode);
}