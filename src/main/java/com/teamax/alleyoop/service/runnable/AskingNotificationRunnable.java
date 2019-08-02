package com.teamax.alleyoop.service.runnable;

import com.teamax.alleyoop.dao.BusAskMapper;
import com.teamax.alleyoop.entity.BusAsk;
import com.teamax.alleyoop.entity.BusBid;
import com.teamax.alleyoop.entity.BusCommondity;
import com.teamax.alleyoop.service.NotificationService;

import java.util.ArrayList;
import java.util.List;

public class AskingNotificationRunnable implements Runnable{
    private String type;
    private BusAsk ask;
    private BusBid bid;
    private NotificationService notificationService; // 这个就是注解注入
    private BusAskMapper askMapper;

    public AskingNotificationRunnable(String type, NotificationService notificationService, BusAskMapper askMapper ) {
        this.type = type;
        this.notificationService = notificationService;
        this.askMapper = askMapper;
    }

    public AskingNotificationRunnable(String type, BusAsk ask, NotificationService notificationService, BusAskMapper askMapper ) {
        this.type = type;
        this.ask = ask;
        this.notificationService = notificationService;
        this.askMapper = askMapper;
    }

    public AskingNotificationRunnable(String type, BusBid bid, NotificationService notificationService, BusAskMapper askMapper ) {
        this.type = type;
        this.bid = bid;
        this.notificationService = notificationService;
        this.askMapper = askMapper;
    }

    @Override
    public void run() {
        List<BusAsk> asks = new ArrayList<>();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Sent when a new Highest Bid is placed on an item that is at least X percent of your Ask.
        if("AskingNewHighestBid".equals(type)){
            asks = askMapper.getAskingNewHighestBid(bid.getCommondityCode(),bid.getSizeName());
        }
        //Sent when a new Lowest Ask is placed for an item you have an active Ask for.
        else if("AskingNewLowestAsk".equals(type)){
            asks = askMapper.getAskingNewLowestAsk(ask.getCommondityCode(),ask.getSizeName());
        }
        //Sent 24 hours before your active Ask expires.
        else if("AskExpiring".equals(type)){
            asks = askMapper.getAskExpiring();
        }
        for(BusAsk ask: asks){
            String email = ask.getAccount().getEmailAddress();
            BusCommondity commodity = ask.getCommodity();
            notificationService.sendNotificationToEmail(email,type,commodity);
        }
    }
}
