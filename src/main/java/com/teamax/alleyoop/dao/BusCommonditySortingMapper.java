package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.BusCommonditySorting;
import com.teamax.alleyoop.entity.BusCommonditySortingExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BusCommonditySortingMapper {
    long countByExample(BusCommonditySortingExample example);

    int deleteByExample(BusCommonditySortingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusCommonditySorting record);

    int insertSelective(BusCommonditySorting record);

    List<BusCommonditySorting> selectByExample(BusCommonditySortingExample example);

    BusCommonditySorting selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusCommonditySorting record, @Param("example") BusCommonditySortingExample example);

    int updateByExample(@Param("record") BusCommonditySorting record, @Param("example") BusCommonditySortingExample example);

    int updateByPrimaryKeySelective(BusCommonditySorting record);

    int updateByPrimaryKey(BusCommonditySorting record);

    /**
     * The 'Most Popular' are the products with the most sales over the past 72 hours.
     * @return
     */
    List<BusCommonditySorting> getMostSalesOver72Hour();

    /**
     * The total number of items sold over the past 12 months. We've removed fakes, outliers and auctions with multiple listings.
     * @return
     */
    List<BusCommonditySorting> getTotalSoldOver12Month();

    BusCommonditySorting selectSortingByCommodityCode(@Param("commodityCode") Integer commodityCode);
}