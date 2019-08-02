package com.teamax.alleyoop.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class A1 {
    private Integer orderCode;
    private String name;
    private String color;
    private String size;
    private String progress;
    private String status;
    private Integer askCode;
    private Integer bidCode;

    public A1(Integer orderCode,String name, String color, String size, String progress) {
        this.orderCode = orderCode;
        this.name = name;
        this.color = color;
        this.size = size;
        this.progress = progress;
        if ("0".equals(progress))this.status="订单生成";
        else if("1".equals(progress))this.status="订单生效";
        else if("2".equals(progress))this.status="卖家备货中";
        else if("3".equals(progress))this.status="卖家物流到平台";
        else if("4".equals(progress))this.status="平台收货";
        else if("5".equals(progress))this.status="平台验货";
        else if("6".equals(progress))this.status="平台物流给买家";
        else if("7".equals(progress))this.status="买家收货";
        else if("8".equals(progress))this.status="订单完成";
        else if("11".equals(progress))this.status="订单已支付";
        else if("-1".equals(progress))this.status="买家退货给平台";
        else if("-2".equals(progress))this.status="平台退货给卖家";

    }

    public Integer getAskCode() {
        return askCode;
    }

    public void setAskCode(Integer askCode) {
        this.askCode = askCode;
    }

    public Integer getBidCode() {
        return bidCode;
    }

    public void setBidCode(Integer bidCode) {
        this.bidCode = bidCode;
    }

    public Integer getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(Integer orderCode) {
        this.orderCode = orderCode;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
