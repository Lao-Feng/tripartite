package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.BusCommonditySize;
import com.teamax.alleyoop.entity.BusCommonditySizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BusCommonditySizeMapper {
    long countByExample(BusCommonditySizeExample example);

    int deleteByExample(BusCommonditySizeExample example);

    int deleteByPrimaryKey(Integer sizeCode);

    int insert(BusCommonditySize record);

    int insertSelective(BusCommonditySize record);

    List<BusCommonditySize> selectByExample(BusCommonditySizeExample example);

    BusCommonditySize selectByPrimaryKey(Integer sizeCode);

    int updateByExampleSelective(@Param("record") BusCommonditySize record, @Param("example") BusCommonditySizeExample example);

    int updateByExample(@Param("record") BusCommonditySize record, @Param("example") BusCommonditySizeExample example);

    int updateByPrimaryKeySelective(BusCommonditySize record);

    int updateByPrimaryKey(BusCommonditySize record);

    int updateLastSale(BusCommonditySize record);

    @Select("select * from bus_commondity_size where CommondityCode = #{commodityCode} and SizeName = #{sizeName}")
    BusCommonditySize getObjectByCommodityCodeAndSizeName(@Param("commodityCode")Integer commodityCode,@Param("sizeName")String sizeName);

    @Update("update bus_commondity_size set LowestAsk=NULL where CommondityCode = #{commodityCode} and SizeName = #{sizeName}")
    int setNoLowestAsk(@Param("commodityCode") Integer commodityCode,@Param("sizeName")String sizeName);

    @Update("update bus_commondity_size set HighestBid=NULL where CommondityCode = #{commodityCode} and SizeName = #{sizeName}")
    int setNoHighestBid(@Param("commodityCode") Integer commodityCode,@Param("sizeName")String sizeName);

    @Select("select distinct(CommondityCode) from bus_commondity_size where SizeName = #{sizeName}")
    List<Integer> getCommodityBySize(@Param("sizeName")String sizeName);

    @Select("select distinct(CommondityCode) from bus_commondity_size where ${condition}")
    List<Integer> getCommodityByPrice(@Param("condition")String condition);
}