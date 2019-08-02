package com.teamax.alleyoop.service.runnable;

import com.teamax.alleyoop.entity.BusAsk;
import com.teamax.alleyoop.entity.BusBid;
import com.teamax.alleyoop.entity.BusCommondity;
import com.teamax.alleyoop.service.NotificationService;

public class AskExpiredNotificationRunnable implements Runnable{
    private String type;
    private BusAsk ask;
    private NotificationService notificationService; // 这个就是注解注入

    public AskExpiredNotificationRunnable(String type, BusAsk ask, NotificationService notificationService) {
        this.type = type;
        this.ask = ask;
        this.notificationService = notificationService;
    }

    @Override
    public void run() {
        String email = ask.getAccount().getEmailAddress();
        BusCommondity commodity = ask.getCommodity();
        notificationService.sendNotificationToEmail(email,type,commodity);
    }
}
