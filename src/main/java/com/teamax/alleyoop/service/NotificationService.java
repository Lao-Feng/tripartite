package com.teamax.alleyoop.service;


import com.teamax.alleyoop.common.util.R;
import com.teamax.alleyoop.entity.BusCommondity;

public interface NotificationService {
    /**
     * 发送消息通知到email
     * @param email
     * @param type 消息类型
     * @param commodity 商品信息
     * @return
     */
    R sendNotificationToEmail(String email,String type,BusCommondity commodity);

    /**
     * 发送消息通知到app
     * @param accountCode 用户账号
     * @param type 消息类型
     * @return
     */
    R sendNotificationToApp(Integer accountCode,String type);
}