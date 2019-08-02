package com.teamax.alleyoop.service;

import com.teamax.alleyoop.common.util.R;
import com.teamax.alleyoop.entity.BusCheck;
import com.teamax.alleyoop.entity.BusCommondity;
import com.teamax.alleyoop.entity.BusOrder;

public interface OrderService {

    /**
     * 买家下单购买商品 或者 卖家下单出售商品
     * @param order
     * @return
     */
    R placeAnOrder(BusOrder order);

    /**
     * 买家下单购买商品,卖家确定出售或不出售
     * @param seller
     * @param status
     * @return
     */
    String sellerConfirm(Integer orderCode,Integer seller, Integer status);

    /**
     * 卖家下单出售商品,买家确定购买或不购买
     * @param orderCode
     * @param buyer
     * @param status
     * @return
     */
    String buyerConfirm(Integer orderCode,Integer buyer, Integer status);

    /**
     * 修改订单状态
     * @param orderCode
     * @param accountCode
     * @param status
     * @return
     */
    R changeProgress(Integer orderCode,Integer accountCode,String status);

    /**
     * 验货
     * @param check
     * @return
     */
    R examine(BusCheck check);

    /**
     * 统计商品销售信息
     * @return
     */
    int statisticsCommoditySoldInfo();

    int statisticsSoldInfoByCommodity(BusCommondity commodity);
}