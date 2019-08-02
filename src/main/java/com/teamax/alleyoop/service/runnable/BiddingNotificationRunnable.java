package com.teamax.alleyoop.service.runnable;

import com.teamax.alleyoop.dao.BusBidMapper;
import com.teamax.alleyoop.entity.BusAsk;
import com.teamax.alleyoop.entity.BusBid;
import com.teamax.alleyoop.entity.BusCommondity;
import com.teamax.alleyoop.service.NotificationService;

import java.util.ArrayList;
import java.util.List;

public class BiddingNotificationRunnable implements Runnable{
    private String type;
    private BusAsk ask;
    private BusBid bid;
    private NotificationService notificationService; // 这个就是注解注入
    private BusBidMapper bidMapper;

    public BiddingNotificationRunnable(String type,NotificationService notificationService, BusBidMapper bidMapper ) {
        this.type = type;
        this.notificationService = notificationService;
        this.bidMapper = bidMapper;
    }

    public BiddingNotificationRunnable(String type, BusAsk ask, NotificationService notificationService, BusBidMapper bidMapper ) {
        this.type = type;
        this.ask = ask;
        this.notificationService = notificationService;
        this.bidMapper = bidMapper;
    }

    public BiddingNotificationRunnable(String type, BusBid bid, NotificationService notificationService, BusBidMapper bidMapper ) {
        this.type = type;
        this.bid = bid;
        this.notificationService = notificationService;
        this.bidMapper = bidMapper;
    }

    @Override
    public void run() {
        List<BusBid> bids = new ArrayList<>();
        //Sent when a new Lowest Ask is placed on an item you’re bidding on.
        if("BiddingNewLowestAsk".equals(type)){
            bids = bidMapper.getBiddingNewLowestAsk(ask.getCommondityCode(),ask.getSizeName());
        }
        //Sent when a new highest Bid is placed on an item you have an active Bid on.
        else if("BiddingNewHighestBid".equals(type)){
            bids = bidMapper.getBiddingNewHighestBid(bid.getCommondityCode(),bid.getSizeName());
        }
        //Sent 24 hours before your active Bid expires.
        else if("BidExpiring".equals(type)){
            bids = bidMapper.getBidExpiring();
        }
        //Sent when your Bid has expired.
        else if("BidExpired".equals(type)){
            bids = bidMapper.getBidExpired();
        }
        //Sent if a seller lists a new Ask that matches one of your expired bids.
        else if("AskMatchesExpiredBid".equals(type)){
            bids = bidMapper.getAskMatchesExpiredBid(ask.getCommondityCode(),ask.getSizeName(),ask.getAskPrice());
        }
        //Sent if a seller lists an Ask at the same price, or lower, within 1/2 size of your existing Bid.
        else if("BuyerNearbyMatch".equals(type)){
            bids = bidMapper.getBuyerNearbyMatch(ask.getCommondityCode(),ask.getSizeName(),ask.getAskPrice());
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        for(BusBid bid: bids){
            String email = bid.getAccount().getEmailAddress();
            BusCommondity commodity = bid.getCommodity();
            notificationService.sendNotificationToEmail(email,type,commodity);
        }
    }
}
