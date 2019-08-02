package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.BusCommondity;
import com.teamax.alleyoop.entity.BusCommondityExample;
import java.util.List;

import com.teamax.alleyoop.entity.BusOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BusCommondityMapper {
    long countByExample(BusCommondityExample example);

    int deleteByExample(BusCommondityExample example);

    int deleteByPrimaryKey(Integer commondityCode);

    int insert(BusCommondity record);

    int insertSelective(BusCommondity record);

    List<BusCommondity> selectByExample(BusCommondityExample example);

    List<BusCommondity> selectByFilter(BusCommondityExample example);

    BusCommondity selectByPrimaryKey(Integer commondityCode);

    int updateByExampleSelective(@Param("record") BusCommondity record, @Param("example") BusCommondityExample example);

    int updateByExample(@Param("record") BusCommondity record, @Param("example") BusCommondityExample example);

    int updateByPrimaryKeySelective(BusCommondity record);

    int updateByPrimaryKey(BusCommondity record);

    @Update("UPDATE `bus_commondity` SET `picture` = REPLACE (`picture`,#{picture}, '') WHERE CommondityCode = #{commondityCode}")
    int deletePic(@Param("commondityCode") Integer commondityCode,@Param("picture") String picture);

    @Update("UPDATE `bus_commondity` SET `picture` = CONCAT(ifNull(`picture`,''),#{pictures}) WHERE CommondityCode = #{commondityCode}")
    int updatePic(@Param("commondityCode") Integer commondityCode,@Param("pictures") String pictures);

    List<BusCommondity> getMostPopularCommodity(Integer category);

    List<BusCommondity> getNewLowestAsks(Integer category);

    List<BusCommondity> getNewHighestBids(Integer category);

    @Update("update bus_commondity set LowestAsk=NULL,LowestAskSize=NULL,LowestAskTime=NULL where CommondityCode = #{commodityCode}")
    int setNoLowestAsk(@Param("commodityCode") Integer commodityCode);

    @Update("update bus_commondity set HighestBid=NULL,HighestBidSize=NULL,HighestBidTime=NULL where CommondityCode = #{commodityCode}")
    int setNoHighestBid(@Param("commodityCode") Integer commodityCode);

    List<BusOrder> getSaleList(@Param("CommondityCode") Integer CommondityCode);
}