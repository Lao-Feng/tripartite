package com.teamax.alleyoop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class BusCommonditySorting implements Serializable {
    private Integer id;

    /**
    * 商品编码
    **/
    private Integer commondityCode;

    /**
    * The 'Featured' picks are chosen specifically for you by the StockX team.
    **/
    private Integer featured;

    /**
    * The 'Most Popular' are the products with the most sales over the past 72 hours.
    **/
    private Integer mostPopular;

    /**
    * The 'New Highest Bids' are the products with the most recently listed Highest Bids. These are the products that people are ready to buy.
    **/
    private Double newHighestBidPrice;

    /**
    * 出价时间
    **/
    private Date newHighestBidTime;

    /**
    * The 'New Lowest Asks' are the products with the most recently listed Lowest Asks. These are the products that people are ready to sell.
    **/
    private Double newLowestAskPrice;

    /**
    * 要价时间
    **/
    private Date newLowestAskTime;

    /**
    * The average sales price over the past twelve months. We've removed fakes, outliers and auctions with multiple listings.
    **/
    private Double averageSalePrice;

    /**
    * The total number of items sold over the past 12 months. We've removed fakes, outliers and auctions with multiple listings.
    **/
    private Integer totalSold;

    /**
    * A measure of how much price fluctuates. It is calculated as standard deviation divided by average price. A $200 product with 40% volatility results in an average price range of $120 to $280.
    **/
    private Double volatility;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public BusCommonditySorting withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommondityCode() {
        return commondityCode;
    }

    public BusCommonditySorting withCommondityCode(Integer commondityCode) {
        this.setCommondityCode(commondityCode);
        return this;
    }

    public void setCommondityCode(Integer commondityCode) {
        this.commondityCode = commondityCode;
    }

    public Integer getFeatured() {
        return featured;
    }

    public BusCommonditySorting withFeatured(Integer featured) {
        this.setFeatured(featured);
        return this;
    }

    public void setFeatured(Integer featured) {
        this.featured = featured;
    }

    public Integer getMostPopular() {
        return mostPopular;
    }

    public BusCommonditySorting withMostPopular(Integer mostPopular) {
        this.setMostPopular(mostPopular);
        return this;
    }

    public void setMostPopular(Integer mostPopular) {
        this.mostPopular = mostPopular;
    }

    public Double getNewHighestBidPrice() {
        return newHighestBidPrice;
    }

    public BusCommonditySorting withNewHighestBidPrice(Double newHighestBidPrice) {
        this.setNewHighestBidPrice(newHighestBidPrice);
        return this;
    }

    public void setNewHighestBidPrice(Double newHighestBidPrice) {
        this.newHighestBidPrice = newHighestBidPrice;
    }

    public Date getNewHighestBidTime() {
        return newHighestBidTime;
    }

    public BusCommonditySorting withNewHighestBidTime(Date newHighestBidTime) {
        this.setNewHighestBidTime(newHighestBidTime);
        return this;
    }

    public void setNewHighestBidTime(Date newHighestBidTime) {
        this.newHighestBidTime = newHighestBidTime;
    }

    public Double getNewLowestAskPrice() {
        return newLowestAskPrice;
    }

    public BusCommonditySorting withNewLowestAskPrice(Double newLowestAskPrice) {
        this.setNewLowestAskPrice(newLowestAskPrice);
        return this;
    }

    public void setNewLowestAskPrice(Double newLowestAskPrice) {
        this.newLowestAskPrice = newLowestAskPrice;
    }

    public Date getNewLowestAskTime() {
        return newLowestAskTime;
    }

    public BusCommonditySorting withNewLowestAskTime(Date newLowestAskTime) {
        this.setNewLowestAskTime(newLowestAskTime);
        return this;
    }

    public void setNewLowestAskTime(Date newLowestAskTime) {
        this.newLowestAskTime = newLowestAskTime;
    }

    public Double getAverageSalePrice() {
        return averageSalePrice;
    }

    public BusCommonditySorting withAverageSalePrice(Double averageSalePrice) {
        this.setAverageSalePrice(averageSalePrice);
        return this;
    }

    public void setAverageSalePrice(Double averageSalePrice) {
        this.averageSalePrice = averageSalePrice;
    }

    public Integer getTotalSold() {
        return totalSold;
    }

    public BusCommonditySorting withTotalSold(Integer totalSold) {
        this.setTotalSold(totalSold);
        return this;
    }

    public void setTotalSold(Integer totalSold) {
        this.totalSold = totalSold;
    }

    public Double getVolatility() {
        return volatility;
    }

    public BusCommonditySorting withVolatility(Double volatility) {
        this.setVolatility(volatility);
        return this;
    }

    public void setVolatility(Double volatility) {
        this.volatility = volatility;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", commondityCode=").append(commondityCode);
        sb.append(", featured=").append(featured);
        sb.append(", mostPopular=").append(mostPopular);
        sb.append(", newHighestBidPrice=").append(newHighestBidPrice);
        sb.append(", newHighestBidTime=").append(newHighestBidTime);
        sb.append(", newLowestAskPrice=").append(newLowestAskPrice);
        sb.append(", newLowestAskTime=").append(newLowestAskTime);
        sb.append(", averageSalePrice=").append(averageSalePrice);
        sb.append(", totalSold=").append(totalSold);
        sb.append(", volatility=").append(volatility);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BusCommonditySorting other = (BusCommonditySorting) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCommondityCode() == null ? other.getCommondityCode() == null : this.getCommondityCode().equals(other.getCommondityCode()))
            && (this.getFeatured() == null ? other.getFeatured() == null : this.getFeatured().equals(other.getFeatured()))
            && (this.getMostPopular() == null ? other.getMostPopular() == null : this.getMostPopular().equals(other.getMostPopular()))
            && (this.getNewHighestBidPrice() == null ? other.getNewHighestBidPrice() == null : this.getNewHighestBidPrice().equals(other.getNewHighestBidPrice()))
            && (this.getNewHighestBidTime() == null ? other.getNewHighestBidTime() == null : this.getNewHighestBidTime().equals(other.getNewHighestBidTime()))
            && (this.getNewLowestAskPrice() == null ? other.getNewLowestAskPrice() == null : this.getNewLowestAskPrice().equals(other.getNewLowestAskPrice()))
            && (this.getNewLowestAskTime() == null ? other.getNewLowestAskTime() == null : this.getNewLowestAskTime().equals(other.getNewLowestAskTime()))
            && (this.getAverageSalePrice() == null ? other.getAverageSalePrice() == null : this.getAverageSalePrice().equals(other.getAverageSalePrice()))
            && (this.getTotalSold() == null ? other.getTotalSold() == null : this.getTotalSold().equals(other.getTotalSold()))
            && (this.getVolatility() == null ? other.getVolatility() == null : this.getVolatility().equals(other.getVolatility()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCommondityCode() == null) ? 0 : getCommondityCode().hashCode());
        result = prime * result + ((getFeatured() == null) ? 0 : getFeatured().hashCode());
        result = prime * result + ((getMostPopular() == null) ? 0 : getMostPopular().hashCode());
        result = prime * result + ((getNewHighestBidPrice() == null) ? 0 : getNewHighestBidPrice().hashCode());
        result = prime * result + ((getNewHighestBidTime() == null) ? 0 : getNewHighestBidTime().hashCode());
        result = prime * result + ((getNewLowestAskPrice() == null) ? 0 : getNewLowestAskPrice().hashCode());
        result = prime * result + ((getNewLowestAskTime() == null) ? 0 : getNewLowestAskTime().hashCode());
        result = prime * result + ((getAverageSalePrice() == null) ? 0 : getAverageSalePrice().hashCode());
        result = prime * result + ((getTotalSold() == null) ? 0 : getTotalSold().hashCode());
        result = prime * result + ((getVolatility() == null) ? 0 : getVolatility().hashCode());
        return result;
    }
}