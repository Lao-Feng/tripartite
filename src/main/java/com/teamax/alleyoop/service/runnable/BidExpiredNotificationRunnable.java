package com.teamax.alleyoop.service.runnable;

import com.teamax.alleyoop.entity.BusBid;
import com.teamax.alleyoop.entity.BusCommondity;
import com.teamax.alleyoop.service.NotificationService;

public class BidExpiredNotificationRunnable implements Runnable{
    private String type;
    private BusBid bid;
    private NotificationService notificationService; // 这个就是注解注入

    public BidExpiredNotificationRunnable(String type, BusBid bid, NotificationService notificationService) {
        this.type = type;
        this.bid = bid;
        this.notificationService = notificationService;
    }

    @Override
    public void run() {
        String email = bid.getAccount().getEmailAddress();
        BusCommondity commodity = bid.getCommodity();
        notificationService.sendNotificationToEmail(email,type,commodity);
    }
}
