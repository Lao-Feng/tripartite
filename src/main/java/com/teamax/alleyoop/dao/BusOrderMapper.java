package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.BusCommonditySorting;
import com.teamax.alleyoop.entity.BusOrder;
import com.teamax.alleyoop.entity.BusOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BusOrderMapper {
    long countByExample(BusOrderExample example);

    int deleteByExample(BusOrderExample example);

    int deleteByPrimaryKey(Integer orderCode);

    int insert(BusOrder record);

    int insertSelective(BusOrder record);

    List<BusOrder> selectByExample(BusOrderExample example);

    BusOrder selectByPrimaryKey(Integer orderCode);

    int updateByExampleSelective(@Param("record") BusOrder record, @Param("example") BusOrderExample example);

    int updateByExample(@Param("record") BusOrder record, @Param("example") BusOrderExample example);

    int updateByPrimaryKeySelective(BusOrder record);

    int updateByPrimaryKey(BusOrder record);

    /**
     * 统计过去销售量
     * @param commodityCode
     * @param past
     * @return
     */
    Integer getTotalSoldPast(@Param("commodityCode") Integer commodityCode,@Param("past") String past);

    /**
     * 统计过去销售平均价
     * @param commodityCode
     * @param past
     * @return
     */
    Double getAverageSalePricePast(@Param("commodityCode") Integer commodityCode,@Param("past") String past);

    /**
     * 获取过去最高售价
     * @param commodityCode
     * @param past
     * @return
     */
    Double getHighestSoldPricePast(@Param("commodityCode") Integer commodityCode,@Param("past") String past);
}