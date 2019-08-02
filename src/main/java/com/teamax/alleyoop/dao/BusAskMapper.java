package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.BusAsk;
import com.teamax.alleyoop.entity.BusAskExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BusAskMapper {
    long countByExample(BusAskExample example);

    int deleteByExample(BusAskExample example);

    int deleteByPrimaryKey(Integer code);

    int insert(BusAsk record);

    int insertSelective(BusAsk record);

    int insertSelectiveIntoHistory(BusAsk record);

    List<BusAsk> selectByExample(BusAskExample example);

    BusAsk selectByPrimaryKey(Integer code);

    BusAsk selectByPrimaryKeyHistory(Integer code);

    int updateByExampleSelective(@Param("record") BusAsk record, @Param("example") BusAskExample example);

    int updateByExample(@Param("record") BusAsk record, @Param("example") BusAskExample example);

    int updateByPrimaryKeySelective(BusAsk record);

    int updateByPrimaryKeySelectiveHistory(BusAsk record);

    int updateByPrimaryKey(BusAsk record);

    @Select("select * from bus_ask where CommondityCode = #{commodityCode} and Status = 0 and date_add(Asktime, interval AskExpiration day) >= now() order by AskPrice limit 0,1")
    BusAsk getCommodityLowestAskPrice(@Param("commodityCode") Integer commodityCode);

    @Select("select * from bus_ask where CommondityCode = #{commodityCode} and SizeName = #{sizeName} and Status = 0 and date_add(Asktime, interval AskExpiration day) >= now() order by AskPrice limit 0,1")
    BusAsk getCommoditySizeLowestAskPrice(@Param("commodityCode") Integer commodityCode,@Param("sizeName") String sizeName);

    /**
     * list when a new Highest Bid is placed on an item that is at least X percent of your Ask.
     * @param commodityCode
     * @param sizeName
     * @return
     */
    List<BusAsk> getAskingNewHighestBid(@Param("commodityCode") Integer commodityCode,@Param("sizeName") String sizeName);

    /**
     * list when a new Lowest Ask is placed for an item you have an active Ask for.
     * @param commodityCode
     * @param sizeName
     * @return
     */
    List<BusAsk> getAskingNewLowestAsk(@Param("commodityCode") Integer commodityCode,@Param("sizeName") String sizeName);

    /**
     * list 24 hours before your active Ask expires.
     * @return
     */
    List<BusAsk> getAskExpiring();

    /**
     * list when your Ask has expired.
     * @return
     */
    //@Select("select * from bus_ask where date_add(Asktime, interval AskExpiration day) < now()")
    List<BusAsk> getAskExpired();
}