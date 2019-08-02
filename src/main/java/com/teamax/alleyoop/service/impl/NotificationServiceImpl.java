package com.teamax.alleyoop.service.impl;

import com.teamax.alleyoop.common.util.MailUtil;
import com.teamax.alleyoop.common.util.R;
import com.teamax.alleyoop.dao.BusAccountMapper;
import com.teamax.alleyoop.entity.BusCommondity;
import com.teamax.alleyoop.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service("notificationService")
public class NotificationServiceImpl implements NotificationService {
    @Value("#{prop.fileHttp}")
    public String http;
    @Autowired
    TemplateEngine mailTemplateEngine;
    @Autowired
    BusAccountMapper accountMapper;

    @Override
    @Transactional
    public R sendNotificationToEmail(String email,String type,BusCommondity commodity) {
        Context context = new Context();
        context.setVariable("CommodityName",commodity.getCommodityName());
        context.setVariable("LowestAsk",commodity.getLowestAsk());
        context.setVariable("LowestAskSize",commodity.getLowestAskSize());
        context.setVariable("HighestBid",commodity.getHighestBid());
        context.setVariable("Picture",http + commodity.getPicture().split(";")[0]);
        String content= mailTemplateEngine.process("notification/"+type, context); //获取thymeleaf的html模板
        //Sent when a new Lowest Ask is placed on an item you’re bidding on.
        if("BiddingNewLowestAsk".equals(type)){
            new Thread(new MailUtil(email,"最低要价更新通知",content)).start();
        }
        //Sent when a new highest Bid is placed on an item you have an active Bid on.
        else if("BiddingNewHighestBid ".equals(type)){
            new Thread(new MailUtil(email,"最高出价更新通知",content)).start();
        }
        //Sent 24 hours before your active Bid expires.
        else if("BidExpiring ".equals(type)){
            new Thread(new MailUtil(email,"出价到期通知",content)).start();
        }
        //Sent when a new highest Bid is placed on an item you have an active Bid on.
        else if("BidExpired ".equals(type)){
            new Thread(new MailUtil(email,"出价过期通知",content)).start();
        }
        //Sent if a seller lists a new Ask that matches one of your expired bids.
        else if("AskMatchesExpiredBid ".equals(type)){
            new Thread(new MailUtil(email,"过期出价匹配通知",content)).start();
        }
        //Sent if a seller lists an Ask at the same price, or lower, within 1/2 size of your existing Bid.
        else if("BuyerNearbyMatch ".equals(type)){
            new Thread(new MailUtil(email,"要价匹配通知",content)).start();
        }
        //Sent when a new Lowest Ask is placed on an item you’re following.
        else if("FollowingNewLowestAsk ".equals(type)){
            new Thread(new MailUtil(email,"关注商品要价更新通知",content)).start();
        }
        //Sent when a new Highest Bid is placed on an item that is at least X percent of your Ask.
        else if("AskingNewHighestBid ".equals(type)){
            new Thread(new MailUtil(email,"出价更新通知",content)).start();
        }
        //Sent when a new Lowest Ask is placed for an item you have an active Ask for.
        else if("AskingNewLowestAsk ".equals(type)){
            new Thread(new MailUtil(email,"要价更新通知",content)).start();
        }
        //Sent 24 hours before your active Ask expires.
        else if("AskExpiring ".equals(type)){
            new Thread(new MailUtil(email,"要价到期通知",content)).start();
        }
        //Sent when your Ask has expired.
        else if("AskExpired ".equals(type)){
            new Thread(new MailUtil(email,"要价过期通知",content)).start();
        }
        return R.ok();
    }

    @Override
    @Transactional
    public R sendNotificationToApp(Integer accountCode,String type) {
        return null;
    }
}
