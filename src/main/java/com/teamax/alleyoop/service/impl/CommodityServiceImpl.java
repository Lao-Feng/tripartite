package com.teamax.alleyoop.service.impl;

import com.teamax.alleyoop.common.shiro.ShiroUser;
import com.teamax.alleyoop.common.util.R;
import com.teamax.alleyoop.dao.*;
import com.teamax.alleyoop.entity.*;
import com.teamax.alleyoop.service.CommodityService;
import com.teamax.alleyoop.service.NotificationService;
import com.teamax.alleyoop.service.runnable.*;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service("commodityService")
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private BusCommondityMapper commodityMapper;
    @Autowired
    private BusAskMapper busAskMapper;
    @Autowired
    private BusBidMapper busBidMapper;
    @Autowired
    private BusAccountAddressMapper addressMapper;
    @Autowired
    BusCommonditySizeMapper busCommonditySizeMapper;
    @Autowired
    NotificationService notificationService;
    @Autowired
    RelAccountCommodityFollowingMapper followingMapper;
    @Autowired
    BusCommonditySortingMapper sortingMapper;
    @Autowired
    ToolNextNumMapper numMapper;

    @Override
    @Transactional
    public BusCommondity addOrUpdateCommodity(BusCommondity commodity, List<String> sizeList) {
        ShiroUser user = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
        commodity.setModifyMan(user.getUser().getUserId());
        commodity.setModifyTime(new Date());
        if(commodity.getCommondityCode()==null){
            commodityMapper.insertSelective(commodity);
            //////////////////////更新商品排序//////////////////////////////////////////////////////////////////////////
            BusCommonditySorting temp = sortingMapper.selectSortingByCommodityCode(commodity.getCommondityCode());
            if(temp!=null){
                temp.setFeatured(numMapper.getNextNum("Featured"));
                sortingMapper.updateByPrimaryKeySelective(temp);
            }else{
                BusCommonditySorting sorting = new BusCommonditySorting();
                sorting.setFeatured(numMapper.getNextNum("Featured"));
                sortingMapper.insertSelective(sorting);
            }
        }else{
            commodityMapper.updateByPrimaryKeySelective(commodity);
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        BusCommonditySizeExample example = new BusCommonditySizeExample();
        BusCommonditySizeExample.Criteria criteria = example.createCriteria();
        criteria.andCommondityCodeEqualTo(commodity.getCommondityCode());
        criteria.andSizeNameNotIn(sizeList);
        busCommonditySizeMapper.deleteByExample(example);//先删除
        for(String sizeName : sizeList){
            Integer commodityCode = commodity.getCommondityCode();
            BusCommonditySize commonditySize = new BusCommonditySize();
            commonditySize.setCommondityCode(commodityCode);
            commonditySize.setSizeName(sizeName);
            if(busCommonditySizeMapper.getObjectByCommodityCodeAndSizeName(commodityCode,sizeName)==null){
                busCommonditySizeMapper.insertSelective(commonditySize);
            }
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        return commodity;
    }

    @Override
    @Transactional
    public R newAsk(BusAsk ask) {
        Date now = new Date();
        if(ask.getPaymentCode()==null){
            return R.error(400,"请先绑定收款账户!");
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Integer commondityCode = ask.getCommondityCode();//商品编号
        BusCommondity commodity = commodityMapper.selectByPrimaryKey(commondityCode);
        if(commodity==null){
            return  R.error(400,commondityCode+"商品编号不存在!");
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        BusCommonditySizeExample example = new BusCommonditySizeExample();
        BusCommonditySizeExample.Criteria criteria = example.createCriteria();
        criteria.andCommondityCodeEqualTo(commondityCode);
        criteria.andSizeNameEqualTo(ask.getSizeName());
        List<BusCommonditySize> list = busCommonditySizeMapper.selectByExample(example);
        if(list==null||list.size()==0){
            return  R.error(400,"不存在"+ask.getSizeName()+"尺寸商品!");
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        commodity.setNewestAsk(ask.getAskPrice());commodity.setNewestAskSize(ask.getSizeName()); commodity.setNewestAskTime(now);//更新最新报价信息
        if((commodity.getLowestAsk()==null||commodity.getLowestAsk()==0)||(ask.getAskPrice() <= commodity.getLowestAsk())){
            commodity.setLowestAsk(ask.getAskPrice());commodity.setLowestAskSize(ask.getSizeName());commodity.setLowestAskTime(now);//更新最低报价信息
            /////////////////////////////////////////更新排序表/////////////////////////////////////////////////////////
            BusCommonditySorting temp = sortingMapper.selectSortingByCommodityCode(commondityCode);
            if(temp!=null){
                temp.setNewLowestAskPrice(ask.getAskPrice());
                temp.setNewLowestAskTime(now);
                sortingMapper.updateByPrimaryKeySelective(temp);
            }else{
                BusCommonditySorting sorting = new BusCommonditySorting();
                sorting.setNewLowestAskPrice(ask.getAskPrice());
                sorting.setNewLowestAskTime(now);
                sortingMapper.insertSelective(sorting);
            }
        }
        commodityMapper.updateByPrimaryKeySelective(commodity);//更新商品记录表bus_commondity
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        BusCommonditySize commonditySize = list.get(0);
        if((commonditySize.getLowestAsk()==null||commonditySize.getLowestAsk()==0)||(ask.getAskPrice() <= commonditySize.getLowestAsk())){
            commonditySize.setLowestAsk(ask.getAskPrice());
            busCommonditySizeMapper.updateByPrimaryKeySelective(commonditySize);//更新商品尺寸表记录bus_commondity_size
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //Sent when a new Lowest Ask is placed on an item you’re bidding on.
            new Thread(new BiddingNotificationRunnable("BiddingNewLowestAsk",ask,notificationService,busBidMapper)).start();
            //Sent when a new Lowest Ask is placed on an item you’re following.
            new Thread(new FollowingNotificationRunnable("FollowingNewLowestAsk",commonditySize.getSizeCode(),notificationService,followingMapper)).start();
            //Sent when a new Lowest Ask is placed for an item you have an active Ask for.
            new Thread(new AskingNotificationRunnable("AskingNewLowestAsk",ask,notificationService,busAskMapper)).start();
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ask.setAskTime(now);
        addOnlyOneSamePriceAsk(ask);//保证出售方相同价格的出价只有一条记录
        //busAskMapper.insertSelective(ask);//新增报价记录bus_ask
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Sent if a seller lists a new Ask that matches one of your expired bids.
        new Thread(new BiddingNotificationRunnable("AskMatchesExpiredBid",ask,notificationService,busBidMapper)).start();
        //Sent if a seller lists an Ask at the same price, or lower, within 1/2 size of your existing Bid.
        new Thread(new BiddingNotificationRunnable("BuyerNearbyMatch",ask,notificationService,busBidMapper)).start();
        return R.ok("报价提交成功!");
    }

    public int addOnlyOneSamePriceAsk(BusAsk ask){
        BusAskExample example = new BusAskExample();
        BusAskExample.Criteria criteria = example.createCriteria();
        criteria.andCommondityCodeEqualTo(ask.getCommondityCode());
        criteria.andSizeNameEqualTo(ask.getSizeName());
        criteria.andAskPriceEqualTo(ask.getAskPrice());
        criteria.andAccountCodeEqualTo(ask.getAccountCode());
        criteria.andStatusEqualTo(0);
        List<BusAsk> asks = busAskMapper.selectByExample(example);//
        if(asks!=null&&asks.size() > 0){
            ask.setCode(asks.get(0).getCode());
            busAskMapper.updateByPrimaryKeySelective(ask);
        }else{
            busAskMapper.insertSelective(ask);
        }
        return 1;
    }

    @Override
    @Transactional
    public R newBid(BusBid bid) {
        Date now = new Date();
        if(bid.getPaymentCode()==null){
            return R.error(400,"请先绑定支付账户!");
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Integer commondityCode = bid.getCommondityCode();//商品编号
        BusCommondity commodity = commodityMapper.selectByPrimaryKey(commondityCode);
        if(commodity==null){
            return  R.error(400,"商品编号："+commondityCode+"不存在!");
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        BusCommonditySizeExample example = new BusCommonditySizeExample();
        BusCommonditySizeExample.Criteria criteria = example.createCriteria();
        criteria.andCommondityCodeEqualTo(commondityCode);
        criteria.andSizeNameEqualTo(bid.getSizeName());
        List<BusCommonditySize> list = busCommonditySizeMapper.selectByExample(example);
        if(list==null||list.size()==0){
            return  R.error(400,"不存在"+bid.getSizeName()+"尺寸商品!");
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        commodity.setNewestBid(bid.getBidPrice());commodity.setNewestBidSize(bid.getSizeName()); commodity.setNewestBidTime(now);//更新最新出价信息
        if((commodity.getHighestBid()==null||commodity.getHighestBid()==0)||(bid.getBidPrice() >= commodity.getHighestBid())){
            commodity.setHighestBid(bid.getBidPrice());commodity.setHighestBidSize(bid.getSizeName());commodity.setHighestBidTime(now);//更新最高出价信息
            /////////////////////////////////////////更新排序表/////////////////////////////////////////////////////////
            BusCommonditySorting temp = sortingMapper.selectSortingByCommodityCode(commondityCode);
            if(temp!=null){
                temp.setNewHighestBidPrice(bid.getBidPrice());
                temp.setNewHighestBidTime(now);
                sortingMapper.updateByPrimaryKeySelective(temp);
            }else{
                BusCommonditySorting sorting = new BusCommonditySorting();
                sorting.setNewHighestBidPrice(bid.getBidPrice());
                sorting.setNewHighestBidTime(now);
                sortingMapper.insertSelective(sorting);
            }
        }
        commodityMapper.updateByPrimaryKeySelective(commodity);//更新商品记录表bus_commondity
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        BusCommonditySize commonditySize = list.get(0);
        if((commonditySize.getHighestBid()==null||commonditySize.getHighestBid()==0)||(bid.getBidPrice() >= commonditySize.getHighestBid())){
            commonditySize.setHighestBid(bid.getBidPrice());
            busCommonditySizeMapper.updateByPrimaryKeySelective(commonditySize);//更新商品尺寸表记录bus_commondity_size
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //Sent when a new highest Bid is placed on an item you have an active Bid on.
            new Thread(new BiddingNotificationRunnable("BiddingNewHighestBid",bid,notificationService,busBidMapper)).start();
            //Sent when a new Highest Bid is placed on an item that is at least X percent of your Ask.
            new Thread(new AskingNotificationRunnable("AskingNewHighestBid",bid,notificationService,busAskMapper)).start();
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        bid.setBidTime(now);
        //busBidMapper.insertSelective(bid);//新增出价记录bus_bid
        addOnlyOneSamePriceBid(bid);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        return  R.ok("出价提交成功!");
    }


    public int addOnlyOneSamePriceBid(BusBid bid){
        BusBidExample example = new BusBidExample();
        BusBidExample.Criteria criteria = example.createCriteria();
        criteria.andCommondityCodeEqualTo(bid.getCommondityCode());
        criteria.andSizeNameEqualTo(bid.getSizeName());
        criteria.andBidPriceEqualTo(bid.getBidPrice());
        criteria.andAccountCodeEqualTo(bid.getAccountCode());
        criteria.andStatusEqualTo(0);
        List<BusBid> bids = busBidMapper.selectByExample(example);//
        if(bids!=null&&bids.size() > 0){
            bid.setCode(bids.get(0).getCode());
            busBidMapper.updateByPrimaryKeySelective(bid);
        }else{
            busBidMapper.insertSelective(bid);
        }
        return 1;
    }

    @Override
    @Transactional
    public R newAddress(BusAccountAddress address) {
        addressMapper.insertSelective(address);
        return R.ok("地址新增成功!").put("addressCode",address.getAccountCode());
    }

    /**
     * 更新过期要价 过期出价信息
     * @return
     */
    @Override
    @Transactional
    public int updateExpiredPrice() {
        int rows = 0;
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //List<BusAsk> askList = busAskMapper.selectByExample(null);
        List<BusAsk> askList = busAskMapper.getAskExpired();//获取已过期要价列表
        for(BusAsk ask: askList){
            ask.setStatus(-1);//设置过期状态
            busAskMapper.updateByPrimaryKeySelective(ask);//先更改bus_ask表中状态
            busAskMapper.insertSelectiveIntoHistory(ask);//转入历史表中
            updateLowestAskAccordingToBusAsk(ask.getCommondityCode(),ask.getSizeName());//更新最低要价
            busAskMapper.deleteByPrimaryKey(ask.getCode());//最后从bus_ask表中移除
            rows ++ ;
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if("1".equals(ask.getAccountNotification().getAskExpired())||"3".equals(ask.getAccountNotification().getAskExpired())){
                //Sent when your Ask has expired.
                new Thread(new AskExpiredNotificationRunnable("AskExpired",ask,notificationService)).start();
            }
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        List<BusBid> bidList = busBidMapper.getBidExpired();//获取已过期出价列表
        //List<BusBid> bidList = busBidMapper.selectByExample(null);
        for(BusBid bid: bidList){
            bid.setStatus(-1);//设置过期状态
            busBidMapper.updateByPrimaryKeySelective(bid);///先更改bus_bid表中状态
            busBidMapper.insertSelectiveIntoHistory(bid);//转入历史表
            updateHighestBidAccordingToBusBid(bid.getCommondityCode(),bid.getSizeName());//更新最高出价
            busBidMapper.deleteByPrimaryKey(bid.getCode());//最后从bus_bid表中删除
            rows ++ ;
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if("1".equals(bid.getAccountNotification().getAskExpired())||"3".equals(bid.getAccountNotification().getAskExpired())){
                //Sent when your Bid has expired.
                new Thread(new BidExpiredNotificationRunnable("BidExpired",bid,notificationService)).start();
            }
        }
        return rows;
    }

    /**
     * 根据要价表更新商品最低要价
     * @param commodityCode
     * @param sizeName
     * @return
     */
    @Override
    @Transactional
    public int updateLowestAskAccordingToBusAsk(Integer commodityCode, String sizeName) {
        BusAsk lowestAsk1 = busAskMapper.getCommodityLowestAskPrice(commodityCode);
        BusAsk lowestAsk2 = busAskMapper.getCommoditySizeLowestAskPrice(commodityCode,sizeName);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        BusCommondity commodity = new BusCommondity();
        commodity.setCommondityCode(commodityCode);
        if(lowestAsk1 != null){
            commodity.setLowestAsk(lowestAsk1.getAskPrice());
            commodity.setLowestAskSize(lowestAsk1.getSizeName());
            commodity.setLowestAskTime(lowestAsk1.getAskTime());
            commodityMapper.updateByPrimaryKeySelective(commodity);//更新商品最低要价
        }else{
            commodityMapper.setNoLowestAsk(commodityCode);
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        BusCommonditySize commoditySize = busCommonditySizeMapper.getObjectByCommodityCodeAndSizeName(commodityCode,sizeName);
        if(lowestAsk2 != null){
            commoditySize.setLowestAsk(lowestAsk2.getAskPrice());
            busCommonditySizeMapper.updateByPrimaryKeySelective(commoditySize);
        }else{
            busCommonditySizeMapper.setNoLowestAsk(commodityCode,sizeName);
        }
        return 1;
    }

    /**
     * 根据出价表更新商品最高出价
     * @param commodityCode
     * @param sizeName
     * @return
     */
    @Override
    @Transactional
    public int updateHighestBidAccordingToBusBid(Integer commodityCode, String sizeName) {
        BusBid highestBid1 = busBidMapper.getCommodityHighestBidPrice(commodityCode);
        BusBid highestBid2 = busBidMapper.getCommoditySizeHighestBidPrice(commodityCode,sizeName);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        BusCommondity commodity = new BusCommondity();
        commodity.setCommondityCode(commodityCode);
        if(highestBid1 != null){
            commodity.setHighestBid(highestBid1.getBidPrice());
            commodity.setHighestBidSize(highestBid1.getSizeName());
            commodity.setHighestBidTime(highestBid1.getBidTime());
            commodityMapper.updateByPrimaryKeySelective(commodity);
        }else{
            commodityMapper.setNoHighestBid(commodityCode);
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        BusCommonditySize commoditySize = busCommonditySizeMapper.getObjectByCommodityCodeAndSizeName(commodityCode,sizeName);
        if(highestBid2!=null){
            commoditySize.setHighestBid(highestBid2.getBidPrice());
            busCommonditySizeMapper.updateByPrimaryKeySelective(commoditySize);
        }else{
            busCommonditySizeMapper.setNoHighestBid(commodityCode,sizeName);
        }
        return 1;
    }

    @Override
    @Transactional
    public int updateLastSale(Integer commodityCode, String sizeName, double price,Date saleTime, Integer orderId) {
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        BusCommondity commodity = new BusCommondity();
        commodity.setCommondityCode(commodityCode);
        commodity.setLastSaleTime(saleTime);
        commodity.setLastOrderCode(orderId);
        commodity.setLastSale(price);
        commodityMapper.updateByPrimaryKeySelective(commodity);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        BusCommonditySize commoditySize = new BusCommonditySize();
        commoditySize.setCommondityCode(commodityCode);
        commoditySize.setSizeName(sizeName);
        commoditySize.setLastSaleTime(saleTime);
        commoditySize.setLastOrderCode(orderId);
        commoditySize.setLastSale(price);
        busCommonditySizeMapper.updateLastSale(commoditySize);
        return 1;
    }
}