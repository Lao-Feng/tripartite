package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.BusBid;
import com.teamax.alleyoop.entity.BusBidExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BusBidMapper {
    long countByExample(BusBidExample example);

    int deleteByExample(BusBidExample example);

    int deleteByPrimaryKey(Integer code);

    int insert(BusBid record);

    int insertSelective(BusBid record);
    int insertSelectiveIntoHistory(BusBid record);

    List<BusBid> selectByExample(BusBidExample example);

    BusBid selectByPrimaryKey(Integer code);

    BusBid selectByPrimaryKeyHistory(Integer code);

    int updateByExampleSelective(@Param("record") BusBid record, @Param("example") BusBidExample example);

    int updateByExample(@Param("record") BusBid record, @Param("example") BusBidExample example);

    int updateByPrimaryKeySelective(BusBid record);

    int updateByPrimaryKeySelectiveHistory(BusBid record);

    int updateByPrimaryKey(BusBid record);

    @Select("select * from bus_bid where CommondityCode = #{commodityCode} and Status = 0 and date_add(BidTime, interval BidExpiration day) >= now() order by BidPrice DESC limit 0,1")
    BusBid getCommodityHighestBidPrice(@Param("commodityCode") Integer commodityCode);

    @Select("select * from bus_bid where CommondityCode = #{commodityCode} and Status = 0 and SizeName = #{sizeName} and date_add(BidTime, interval BidExpiration day) >= now() order by BidPrice DESC limit 0,1")
    BusBid getCommoditySizeHighestBidPrice(@Param("commodityCode") Integer commodityCode,@Param("sizeName") String sizeName);

    /**
     * get list , Sent when a new Lowest Ask is placed on an item you’re bidding on.
     * @param commodityCode
     * @param sizeName
     * @return
     */
    List<BusBid> getBiddingNewLowestAsk(@Param("commodityCode") Integer commodityCode,@Param("sizeName") String sizeName);

    /**
     * get list, Sent when a new highest Bid is placed on an item you have an active Bid on.
     * @param commodityCode
     * @param sizeName
     * @return
     */
    List<BusBid> getBiddingNewHighestBid(@Param("commodityCode") Integer commodityCode,@Param("sizeName") String sizeName);

    /**
     * Sent 24 hours before your active Bid expires.
     * @return
     */
    //@Select("select * from bus_bid where date_add(BidTime, interval BidExpiration-1 day) <= now()")
    List<BusBid> getBidExpiring();

    /**
     * Sent when your Bid has expired.
     * @return
     */
    //@Select("select * from bus_bid where date_add(BidTime, interval BidExpiration day) < now()")
    List<BusBid> getBidExpired();

    /**
     * a seller lists a new Ask that matches one of your expired bids.
     * @param commodityCode
     * @param sizeName
     * @param askPrice
     * @return
     */
    List<BusBid> getAskMatchesExpiredBid(@Param("commodityCode") Integer commodityCode,@Param("sizeName") String sizeName,@Param("askPrice")double askPrice);

    /**
     * a seller lists an Ask at the same price, or lower, within 1/2 size of your existing Bid.
     * @param commodityCode
     * @param sizeName
     * @param askPrice
     * @return
     */
    List<BusBid> getBuyerNearbyMatch(@Param("commodityCode") Integer commodityCode,@Param("sizeName") String sizeName,@Param("askPrice")double askPrice);
}