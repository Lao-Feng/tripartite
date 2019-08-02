package com.teamax.alleyoop.service.runnable;

import com.teamax.alleyoop.dao.RelAccountCommodityFollowingMapper;
import com.teamax.alleyoop.entity.BusCommondity;
import com.teamax.alleyoop.entity.RelAccountCommodityFollowing;
import com.teamax.alleyoop.entity.RelAccountCommodityFollowingExample;
import com.teamax.alleyoop.service.NotificationService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FollowingNotificationRunnable implements Runnable{
    private String type;
    private Integer sizeCode;
    private NotificationService notificationService; // 这个就是注解注入
    private RelAccountCommodityFollowingMapper followingMapper;

    public FollowingNotificationRunnable(String type,Integer sizeCode,NotificationService notificationService,RelAccountCommodityFollowingMapper followingMapper) {
        this.type = type;
        this.sizeCode = sizeCode;
        this.notificationService = notificationService;
        this.followingMapper = followingMapper;
    }

    @Override
    public void run() {
        RelAccountCommodityFollowingExample example = new RelAccountCommodityFollowingExample();
        RelAccountCommodityFollowingExample.Criteria criteria = example.createCriteria();
        criteria.andSizeCodeEqualTo(sizeCode);
        criteria.andFollowingNewLowestAskIn(Arrays.asList("1","3"));
        List<RelAccountCommodityFollowing>  followings = followingMapper.selectByExample(example);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        for(RelAccountCommodityFollowing flw: followings){
            String email = flw.getAccount().getEmailAddress();
            BusCommondity commodity = flw.getCommoditySize().getCommodity();
            notificationService.sendNotificationToEmail(email,type,commodity);
        }
    }
}
