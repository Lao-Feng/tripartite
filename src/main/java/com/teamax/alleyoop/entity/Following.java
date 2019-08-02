package com.teamax.alleyoop.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Following {
    private Integer commodityCode;
    private String name;
    private String color;
    private String size;
    private Double lowestAsk;
    private String picture;

    public Following(Integer commodityCode,String name, String color, String size, Double lowestAsk) {
        this.commodityCode = commodityCode;
        this.name = name;
        this.color = color;
        this.size = size;
        this.lowestAsk = lowestAsk;
    }

    public Integer getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(Integer commodityCode) {
        this.commodityCode = commodityCode;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
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

    public Double getLowestAsk() {
        return lowestAsk;
    }

    public void setLowestAsk(Double lowestAsk) {
        this.lowestAsk = lowestAsk;
    }
}
