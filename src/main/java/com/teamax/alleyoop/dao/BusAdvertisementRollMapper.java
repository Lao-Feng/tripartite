package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.BusAdvertisementRoll;
import com.teamax.alleyoop.entity.BusAdvertisementRollExample;
import java.util.List;

import com.teamax.alleyoop.entity.BusCommondity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BusAdvertisementRollMapper {
    long countByExample(BusAdvertisementRollExample example);

    int deleteByExample(BusAdvertisementRollExample example);

    int deleteByPrimaryKey(Integer ADCode);

    int insert(BusAdvertisementRoll record);

    int insertSelective(BusAdvertisementRoll record);

    List<BusAdvertisementRoll> selectByExample(BusAdvertisementRollExample example);

    BusAdvertisementRoll selectByPrimaryKey(Integer ADCode);

    int updateByExampleSelective(@Param("record") BusAdvertisementRoll record, @Param("example") BusAdvertisementRollExample example);

    int updateByExample(@Param("record") BusAdvertisementRoll record, @Param("example") BusAdvertisementRollExample example);

    int updateByPrimaryKeySelective(BusAdvertisementRoll record);

    int updateByPrimaryKey(BusAdvertisementRoll record);

    /**
     * 获取首页商品滚动广告列表
     * @return
     */
    List<BusCommondity> getCommodityAdvList();

    @Select("select ifNull(max(SortIndex)+1,0) from bus_advertisement_roll")
    int getNextIndex();
}