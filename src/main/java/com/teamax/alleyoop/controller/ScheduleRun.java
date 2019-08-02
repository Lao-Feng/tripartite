package com.teamax.alleyoop.controller;

import com.teamax.alleyoop.common.util.DateUtils;
import com.teamax.alleyoop.dao.*;
import com.teamax.alleyoop.service.CommodityService;
import com.teamax.alleyoop.service.NotificationService;
import com.teamax.alleyoop.service.OrderService;
import com.teamax.alleyoop.service.runnable.AskingNotificationRunnable;
import com.teamax.alleyoop.service.runnable.BiddingNotificationRunnable;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Controller
public class ScheduleRun {
    @Resource
    CommodityService commodityService;
    @Resource
    BusBidMapper busBidMapper;
    @Resource
    BusAskMapper busAskMapper;
    @Resource
    NotificationService notificationService;
    @Resource
    OrderService orderService;

    /**
     * 自动更新商品过期要价 出价信息
     */
    public void updateExpiredPrice(){
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleWithFixedDelay(() -> commodityService.updateExpiredPrice(), 1*60*1000, 1*10*1000, TimeUnit.MILLISECONDS);//10秒执行一次
    }


    /**
     * 自动统计商品销售量
     */
    public void updateCommoditySoldInfo(){
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.scheduleWithFixedDelay(() -> orderService.statisticsCommoditySoldInfo(), 1*60*1000, 60 * 60 * 1000, TimeUnit.MILLISECONDS);//1小时更新一次
    }

    /**
     * Sent 24 hours before your active Bid/Ask expires.
     */
    public void expiringNotification(){
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        long oneDay = 24 * 60 * 60 * 1000;
        long initDelay  = DateUtils.getTimeMillis("00:00:00") - System.currentTimeMillis();//每天凌晨执行
        initDelay = initDelay > 0 ? initDelay : oneDay + initDelay;
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        executor.scheduleAtFixedRate(
                //Sent 24 hours before your active Bid expires.
                new BiddingNotificationRunnable("BidExpiring",notificationService,busBidMapper),
                initDelay,
                oneDay,
                TimeUnit.MILLISECONDS);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        executor.scheduleAtFixedRate(
                //Sent 24 hours before your active Ask expires.
                new AskingNotificationRunnable("AskExpiring",notificationService, busAskMapper),
                initDelay,
                oneDay,
                TimeUnit.MILLISECONDS);
    }
}

