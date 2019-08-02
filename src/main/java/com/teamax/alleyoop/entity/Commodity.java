package com.teamax.alleyoop.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
@ApiModel(value="商品对象模型")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Commodity implements Serializable {
    private static final long serialVersionUID = 1L;

    public String http;
    /**
    * 商品编号
    **/
    @ApiModelProperty(value="商品编号")
    private Integer commondityCode;

    /**
    * 商品名称
    **/
    @ApiModelProperty(value="商品名称")
    private String commodityName;

    /**
    * 图片路径，多个以分号;分开
    **/
    private String picture;
    private String[] picArray;
    @ApiModelProperty(value="图片路径数组")
    private String[] picUrlArray;

    /**
    * 最低要价
    **/
    @ApiModelProperty(value="最低要价")
    private Double lowestAsk;

    /**
    * 最低要价规格
    **/
    @ApiModelProperty(value="最低要价规格")
    private String lowestAskSize;

    /**
    * 最低要价时间
    **/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lowestAskTime;

    /**
    * 最高出价
    **/
    @ApiModelProperty(value="最高出价")
    private Double highestBid;

    /**
    * 最高出价规格
    **/
    @ApiModelProperty(value="最高出价规格")
    private String highestBidSize;

    /**
    * 最高出价时间
    **/
    @ApiModelProperty(value="最高出价时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date highestBidTime;

    /**
    * 最近要价
    **/
    @ApiModelProperty(value="商品编号")
    private Double newestAsk;

    /**
    * 最近要价规格
    **/
    @ApiModelProperty(value="最近要价规格")
    private String newestAskSize;

    /**
    * 最近要价时间
    **/
    @ApiModelProperty(value="最近要价时间")
    private Date newestAskTime;

    /**
    * 最近出价
    **/
    @ApiModelProperty(value="最近出价")
    private Double newestBid;

    /**
    * 最近出价规格
    **/
    @ApiModelProperty(value="最近出价规格")
    private String newestBidSize;

    /**
    * 最近出价时间
    **/
    @ApiModelProperty(value="最近出价时间")
    private Date newestBidTime;

    /**
    * 最近售价
    **/
    @ApiModelProperty(value="最近售价")
    private Double lastSale;

    /**
    * 最近售价规格
    **/
    @ApiModelProperty(value="最近售价规格")
    private String lastSaleSize;

    /**
    * 最近售价时间
    **/
    @ApiModelProperty(value="最近售价时间")
    private Date lastSaleTime;

    /**
    * 销售量
    **/
    @ApiModelProperty(value="销售量")
    private Integer sales;

    public String getHttp() {
        return http;
    }

    public void setHttp(String http) {
        this.http = http;
        if(this.picArray!=null){
            this.picUrlArray = new String[this.picArray.length];
            for(int i=0;i<this.picArray.length;i++){
                this.picUrlArray[i] = this.http + this.picArray[i];
            }
        }
    }

    public Integer getCommondityCode() {
        return commondityCode;
    }

    public void setCommondityCode(Integer commondityCode) {
        this.commondityCode = commondityCode;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        if(picture!=null&&!"".equals(picture)){
            this.picArray = picture.split(";");
        }
        this.picture = picture;
    }

    public String[] getPicArray() {
        return picArray;
    }

    public void setPicArray(String[] picArray) {
        this.picArray = picArray;
    }

    public String[] getPicUrlArray() {
        return picUrlArray;
    }

    public void setPicUrlArray(String[] picUrlArray) {
        this.picUrlArray = picUrlArray;
    }

    public Double getLowestAsk() {
        return lowestAsk;
    }

    public void setLowestAsk(Double lowestAsk) {
        this.lowestAsk = lowestAsk;
    }

    public String getLowestAskSize() {
        return lowestAskSize;
    }

    public void setLowestAskSize(String lowestAskSize) {
        this.lowestAskSize = lowestAskSize;
    }

    public Date getLowestAskTime() {
        return lowestAskTime;
    }

    public void setLowestAskTime(Date lowestAskTime) {
        this.lowestAskTime = lowestAskTime;
    }

    public Double getHighestBid() {
        return highestBid;
    }

    public void setHighestBid(Double highestBid) {
        this.highestBid = highestBid;
    }

    public String getHighestBidSize() {
        return highestBidSize;
    }

    public void setHighestBidSize(String highestBidSize) {
        this.highestBidSize = highestBidSize;
    }

    public Date getHighestBidTime() {
        return highestBidTime;
    }

    public void setHighestBidTime(Date highestBidTime) {
        this.highestBidTime = highestBidTime;
    }

    public Double getNewestAsk() {
        return newestAsk;
    }

    public void setNewestAsk(Double newestAsk) {
        this.newestAsk = newestAsk;
    }

    public String getNewestAskSize() {
        return newestAskSize;
    }

    public void setNewestAskSize(String newestAskSize) {
        this.newestAskSize = newestAskSize;
    }

    public Date getNewestAskTime() {
        return newestAskTime;
    }

    public void setNewestAskTime(Date newestAskTime) {
        this.newestAskTime = newestAskTime;
    }

    public Double getNewestBid() {
        return newestBid;
    }

    public void setNewestBid(Double newestBid) {
        this.newestBid = newestBid;
    }

    public String getNewestBidSize() {
        return newestBidSize;
    }

    public void setNewestBidSize(String newestBidSize) {
        this.newestBidSize = newestBidSize;
    }

    public Date getNewestBidTime() {
        return newestBidTime;
    }

    public void setNewestBidTime(Date newestBidTime) {
        this.newestBidTime = newestBidTime;
    }

    public Double getLastSale() {
        return lastSale;
    }

    public void setLastSale(Double lastSale) {
        this.lastSale = lastSale;
    }

    public String getLastSaleSize() {
        return lastSaleSize;
    }

    public void setLastSaleSize(String lastSaleSize) {
        this.lastSaleSize = lastSaleSize;
    }

    public Date getLastSaleTime() {
        return lastSaleTime;
    }

    public void setLastSaleTime(Date lastSaleTime) {
        this.lastSaleTime = lastSaleTime;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }
}