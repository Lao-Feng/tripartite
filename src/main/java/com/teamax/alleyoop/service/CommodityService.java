package com.teamax.alleyoop.service;

import com.teamax.alleyoop.common.util.R;
import com.teamax.alleyoop.entity.BusAccountAddress;
import com.teamax.alleyoop.entity.BusAsk;
import com.teamax.alleyoop.entity.BusBid;
import com.teamax.alleyoop.entity.BusCommondity;

import java.util.Date;
import java.util.List;

public interface CommodityService {

    /**
     * 新增/修改商品信息
     * @param commodity
     * @param sizeList
     * @return
     */
    BusCommondity addOrUpdateCommodity(BusCommondity commodity, List<String> sizeList);

    /**
     * 卖方报价
     * @param ask
     * @return
     */
    R newAsk(BusAsk ask);

    /**
     * 买方出价
     * @param bid
     * @return
     */
     R newBid(BusBid bid);


    /**
     * 新增地址
     * @param address
     * @return
     */
     R newAddress(BusAccountAddress address);

    /**
     * 根据bus_ask要价表及bus_bid出价表实时更新商品价格
     * @return
     */
    int updateExpiredPrice();

    /**
     * 根据要价表更新商品最低要价
     * @param commodityCode
     * @param sizeName
     * @return
     */
    int updateLowestAskAccordingToBusAsk(Integer commodityCode, String sizeName);

    /**
     * 根据出价表更新商品最高出价
     * @param commodityCode
     * @param sizeName
     * @return
     */
    int updateHighestBidAccordingToBusBid(Integer commodityCode, String sizeName);

    /**
     *
     * @param commodityCode
     * @param sizeName
     * @param saleTime
     * @param orderId
     * @param price
     * @return
     */
    int updateLastSale(Integer commodityCode, String sizeName, double price,Date saleTime, Integer orderId);
}