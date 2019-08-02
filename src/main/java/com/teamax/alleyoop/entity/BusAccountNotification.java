package com.teamax.alleyoop.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class BusAccountNotification implements Serializable {
    /**
    * 账号
    **/
    @ApiModelProperty(value="账号")
    private Integer accountCode;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent when a new Lowest Ask is placed on an item you’re bidding on.
    **/
    @ApiModelProperty(value="0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent when a new Lowest Ask is placed on an item you’re bidding on.")
    private String biddingNewLowestAsk;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent when a new highest Bid is placed on an item you have an active Bid on.
    **/
    @ApiModelProperty(value="账号")
    private String biddingNewHighestBid;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent 24 hours before your active Bid expires.
    **/
    @ApiModelProperty(value="0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent 24 hours before your active Bid expires.")
    private String bidExpiring;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent when your Bid has expired.
    **/
    @ApiModelProperty(value="0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent when your Bid has expired.")
    private String bidExpired;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent if a seller lists a new Ask that matches one of your expired bids.
    **/
    @ApiModelProperty(value="0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent if a seller lists a new Ask that matches one of your expired bids.")
    private String askMatchesExpiredBid;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent if a seller lists an Ask at the same price, or lower, within 1/2 size of your existing Bid.
    **/
    @ApiModelProperty(value="0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent if a seller lists an Ask at the same price, or lower, within 1/2 size of your existing Bid.")
    private String buyerNearbyMatch;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Your bid has been accepted
    **/
    @ApiModelProperty(value="0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Your bid has been accepted")
    private String bidAccepted;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent when you're almost outbid to win an IPO.
    **/
    @ApiModelProperty(value="0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent when you're almost outbid to win an IPO.")
    private String IPOBidAlmost;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent if you've been outbid for an IPO and must increase your Bid to win.
    **/
    @ApiModelProperty(value="0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent if you've been outbid for an IPO and must increase your Bid to win.")
    private String IPOBidOut;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent when your IPO Bid has been accepted.
    **/
    @ApiModelProperty(value="0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent when your IPO Bid has been accepted.")
    private String IPOBidAccepted;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent when a new Lowest Ask is placed on an item you’re following.
    **/
    @ApiModelProperty(value=" 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent when a new Lowest Ask is placed on an item you’re following.")
    private String followingNewLowestAsk;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent when a new Highest Bid is placed on an item that is at least X percent of your Ask.
    **/
    @ApiModelProperty(value="0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent when a new Highest Bid is placed on an item that is at least X percent of your Ask.")
    private String askingNewHighestBid;

    /**
    * at least X percent of your Ask.
    **/
    @ApiModelProperty(value="at least X percent of your Ask.")
    private Double askingNewHighestBidPercent;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent when a new Lowest Ask is placed for an item you have an active Ask for.
    **/
    @ApiModelProperty(value="0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent when a new Lowest Ask is placed for an item you have an active Ask for.")
    private String askingNewLowestAsk;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent 24 hours before your active Ask expires.
    **/
    @ApiModelProperty(value="0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent 24 hours before your active Ask expires.")
    private String askExpiring;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent when your Ask has expired.
    **/
    @ApiModelProperty(value="0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent when your Ask has expired.")
    private String askExpired;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Your item has sold
    **/
    @ApiModelProperty(value="0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Your item has sold")
    private String itemSold;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent when a seller hasn't shipped by the deadline.
    **/
    @ApiModelProperty(value="0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent when a seller hasn't shipped by the deadline.")
    private String firstSellerHasNotShipped;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent when a seller still hasn't shipped after first notification
    **/
    @ApiModelProperty(value="0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent when a seller still hasn't shipped after first notification")
    private String secondSellerHasNotShipped;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent as a final warning when a seller hasn't shipped
    **/
    @ApiModelProperty(value="0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sent as a final warning when a seller hasn't shipped")
    private String thirdSellerHasNotShipped;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.StockX Product Features & Major Announcements
    **/
    @ApiModelProperty(value="0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.StockX Product Features & Major Announcements")
    private String productFeatures;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sneaker News & Promotions
    **/
    @ApiModelProperty(value="0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Sneaker News & Promotions")
    private String sneakerNews;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Handbag News & Promotions
    **/
    @ApiModelProperty(value="0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Handbag News & Promotions")
    private String handbagNews;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Watch News & Promotions
    **/
    @ApiModelProperty(value="0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Watch News & Promotions")
    private String watchNews;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Streetwear News & Promotions
    **/
    @ApiModelProperty(value="0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Streetwear News & Promotions")
    private String streetwearNews;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Price Drop Email
    **/
    @ApiModelProperty(value="0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Price Drop Email")
    private String priceDropEmail;

    /**
    * 0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Welcome Series
    **/
    @ApiModelProperty(value="0-都不开启;1-开启email推送;2-开启手机端推送;3-都开启.Welcome Series")
    private String welcomeSeries;

    private static final long serialVersionUID = 1L;

    public Integer getAccountCode() {
        return accountCode;
    }

    public BusAccountNotification withAccountCode(Integer accountCode) {
        this.setAccountCode(accountCode);
        return this;
    }

    public void setAccountCode(Integer accountCode) {
        this.accountCode = accountCode;
    }

    public String getBiddingNewLowestAsk() {
        return biddingNewLowestAsk;
    }

    public BusAccountNotification withBiddingNewLowestAsk(String biddingNewLowestAsk) {
        this.setBiddingNewLowestAsk(biddingNewLowestAsk);
        return this;
    }

    public void setBiddingNewLowestAsk(String biddingNewLowestAsk) {
        this.biddingNewLowestAsk = biddingNewLowestAsk == null ? null : biddingNewLowestAsk.trim();
    }

    public String getBiddingNewHighestBid() {
        return biddingNewHighestBid;
    }

    public BusAccountNotification withBiddingNewHighestBid(String biddingNewHighestBid) {
        this.setBiddingNewHighestBid(biddingNewHighestBid);
        return this;
    }

    public void setBiddingNewHighestBid(String biddingNewHighestBid) {
        this.biddingNewHighestBid = biddingNewHighestBid == null ? null : biddingNewHighestBid.trim();
    }

    public String getBidExpiring() {
        return bidExpiring;
    }

    public BusAccountNotification withBidExpiring(String bidExpiring) {
        this.setBidExpiring(bidExpiring);
        return this;
    }

    public void setBidExpiring(String bidExpiring) {
        this.bidExpiring = bidExpiring == null ? null : bidExpiring.trim();
    }

    public String getBidExpired() {
        return bidExpired;
    }

    public BusAccountNotification withBidExpired(String bidExpired) {
        this.setBidExpired(bidExpired);
        return this;
    }

    public void setBidExpired(String bidExpired) {
        this.bidExpired = bidExpired == null ? null : bidExpired.trim();
    }

    public String getAskMatchesExpiredBid() {
        return askMatchesExpiredBid;
    }

    public BusAccountNotification withAskMatchesExpiredBid(String askMatchesExpiredBid) {
        this.setAskMatchesExpiredBid(askMatchesExpiredBid);
        return this;
    }

    public void setAskMatchesExpiredBid(String askMatchesExpiredBid) {
        this.askMatchesExpiredBid = askMatchesExpiredBid == null ? null : askMatchesExpiredBid.trim();
    }

    public String getBuyerNearbyMatch() {
        return buyerNearbyMatch;
    }

    public BusAccountNotification withBuyerNearbyMatch(String buyerNearbyMatch) {
        this.setBuyerNearbyMatch(buyerNearbyMatch);
        return this;
    }

    public void setBuyerNearbyMatch(String buyerNearbyMatch) {
        this.buyerNearbyMatch = buyerNearbyMatch == null ? null : buyerNearbyMatch.trim();
    }

    public String getBidAccepted() {
        return bidAccepted;
    }

    public BusAccountNotification withBidAccepted(String bidAccepted) {
        this.setBidAccepted(bidAccepted);
        return this;
    }

    public void setBidAccepted(String bidAccepted) {
        this.bidAccepted = bidAccepted == null ? null : bidAccepted.trim();
    }

    public String getIPOBidAlmost() {
        return IPOBidAlmost;
    }

    public BusAccountNotification withIPOBidAlmost(String IPOBidAlmost) {
        this.setIPOBidAlmost(IPOBidAlmost);
        return this;
    }

    public void setIPOBidAlmost(String IPOBidAlmost) {
        this.IPOBidAlmost = IPOBidAlmost == null ? null : IPOBidAlmost.trim();
    }

    public String getIPOBidOut() {
        return IPOBidOut;
    }

    public BusAccountNotification withIPOBidOut(String IPOBidOut) {
        this.setIPOBidOut(IPOBidOut);
        return this;
    }

    public void setIPOBidOut(String IPOBidOut) {
        this.IPOBidOut = IPOBidOut == null ? null : IPOBidOut.trim();
    }

    public String getIPOBidAccepted() {
        return IPOBidAccepted;
    }

    public BusAccountNotification withIPOBidAccepted(String IPOBidAccepted) {
        this.setIPOBidAccepted(IPOBidAccepted);
        return this;
    }

    public void setIPOBidAccepted(String IPOBidAccepted) {
        this.IPOBidAccepted = IPOBidAccepted == null ? null : IPOBidAccepted.trim();
    }

    public String getFollowingNewLowestAsk() {
        return followingNewLowestAsk;
    }

    public BusAccountNotification withFollowingNewLowestAsk(String followingNewLowestAsk) {
        this.setFollowingNewLowestAsk(followingNewLowestAsk);
        return this;
    }

    public void setFollowingNewLowestAsk(String followingNewLowestAsk) {
        this.followingNewLowestAsk = followingNewLowestAsk == null ? null : followingNewLowestAsk.trim();
    }

    public String getAskingNewHighestBid() {
        return askingNewHighestBid;
    }

    public BusAccountNotification withAskingNewHighestBid(String askingNewHighestBid) {
        this.setAskingNewHighestBid(askingNewHighestBid);
        return this;
    }

    public void setAskingNewHighestBid(String askingNewHighestBid) {
        this.askingNewHighestBid = askingNewHighestBid == null ? null : askingNewHighestBid.trim();
    }

    public Double getAskingNewHighestBidPercent() {
        return askingNewHighestBidPercent;
    }

    public BusAccountNotification withAskingNewHighestBidPercent(Double askingNewHighestBidPercent) {
        this.setAskingNewHighestBidPercent(askingNewHighestBidPercent);
        return this;
    }

    public void setAskingNewHighestBidPercent(Double askingNewHighestBidPercent) {
        this.askingNewHighestBidPercent = askingNewHighestBidPercent;
    }

    public String getAskingNewLowestAsk() {
        return askingNewLowestAsk;
    }

    public BusAccountNotification withAskingNewLowestAsk(String askingNewLowestAsk) {
        this.setAskingNewLowestAsk(askingNewLowestAsk);
        return this;
    }

    public void setAskingNewLowestAsk(String askingNewLowestAsk) {
        this.askingNewLowestAsk = askingNewLowestAsk == null ? null : askingNewLowestAsk.trim();
    }

    public String getAskExpiring() {
        return askExpiring;
    }

    public BusAccountNotification withAskExpiring(String askExpiring) {
        this.setAskExpiring(askExpiring);
        return this;
    }

    public void setAskExpiring(String askExpiring) {
        this.askExpiring = askExpiring == null ? null : askExpiring.trim();
    }

    public String getAskExpired() {
        return askExpired;
    }

    public BusAccountNotification withAskExpired(String askExpired) {
        this.setAskExpired(askExpired);
        return this;
    }

    public void setAskExpired(String askExpired) {
        this.askExpired = askExpired == null ? null : askExpired.trim();
    }

    public String getItemSold() {
        return itemSold;
    }

    public BusAccountNotification withItemSold(String itemSold) {
        this.setItemSold(itemSold);
        return this;
    }

    public void setItemSold(String itemSold) {
        this.itemSold = itemSold == null ? null : itemSold.trim();
    }

    public String getFirstSellerHasNotShipped() {
        return firstSellerHasNotShipped;
    }

    public BusAccountNotification withFirstSellerHasNotShipped(String firstSellerHasNotShipped) {
        this.setFirstSellerHasNotShipped(firstSellerHasNotShipped);
        return this;
    }

    public void setFirstSellerHasNotShipped(String firstSellerHasNotShipped) {
        this.firstSellerHasNotShipped = firstSellerHasNotShipped == null ? null : firstSellerHasNotShipped.trim();
    }

    public String getSecondSellerHasNotShipped() {
        return secondSellerHasNotShipped;
    }

    public BusAccountNotification withSecondSellerHasNotShipped(String secondSellerHasNotShipped) {
        this.setSecondSellerHasNotShipped(secondSellerHasNotShipped);
        return this;
    }

    public void setSecondSellerHasNotShipped(String secondSellerHasNotShipped) {
        this.secondSellerHasNotShipped = secondSellerHasNotShipped == null ? null : secondSellerHasNotShipped.trim();
    }

    public String getThirdSellerHasNotShipped() {
        return thirdSellerHasNotShipped;
    }

    public BusAccountNotification withThirdSellerHasNotShipped(String thirdSellerHasNotShipped) {
        this.setThirdSellerHasNotShipped(thirdSellerHasNotShipped);
        return this;
    }

    public void setThirdSellerHasNotShipped(String thirdSellerHasNotShipped) {
        this.thirdSellerHasNotShipped = thirdSellerHasNotShipped == null ? null : thirdSellerHasNotShipped.trim();
    }

    public String getProductFeatures() {
        return productFeatures;
    }

    public BusAccountNotification withProductFeatures(String productFeatures) {
        this.setProductFeatures(productFeatures);
        return this;
    }

    public void setProductFeatures(String productFeatures) {
        this.productFeatures = productFeatures == null ? null : productFeatures.trim();
    }

    public String getSneakerNews() {
        return sneakerNews;
    }

    public BusAccountNotification withSneakerNews(String sneakerNews) {
        this.setSneakerNews(sneakerNews);
        return this;
    }

    public void setSneakerNews(String sneakerNews) {
        this.sneakerNews = sneakerNews == null ? null : sneakerNews.trim();
    }

    public String getHandbagNews() {
        return handbagNews;
    }

    public BusAccountNotification withHandbagNews(String handbagNews) {
        this.setHandbagNews(handbagNews);
        return this;
    }

    public void setHandbagNews(String handbagNews) {
        this.handbagNews = handbagNews == null ? null : handbagNews.trim();
    }

    public String getWatchNews() {
        return watchNews;
    }

    public BusAccountNotification withWatchNews(String watchNews) {
        this.setWatchNews(watchNews);
        return this;
    }

    public void setWatchNews(String watchNews) {
        this.watchNews = watchNews == null ? null : watchNews.trim();
    }

    public String getStreetwearNews() {
        return streetwearNews;
    }

    public BusAccountNotification withStreetwearNews(String streetwearNews) {
        this.setStreetwearNews(streetwearNews);
        return this;
    }

    public void setStreetwearNews(String streetwearNews) {
        this.streetwearNews = streetwearNews == null ? null : streetwearNews.trim();
    }

    public String getPriceDropEmail() {
        return priceDropEmail;
    }

    public BusAccountNotification withPriceDropEmail(String priceDropEmail) {
        this.setPriceDropEmail(priceDropEmail);
        return this;
    }

    public void setPriceDropEmail(String priceDropEmail) {
        this.priceDropEmail = priceDropEmail == null ? null : priceDropEmail.trim();
    }

    public String getWelcomeSeries() {
        return welcomeSeries;
    }

    public BusAccountNotification withWelcomeSeries(String welcomeSeries) {
        this.setWelcomeSeries(welcomeSeries);
        return this;
    }

    public void setWelcomeSeries(String welcomeSeries) {
        this.welcomeSeries = welcomeSeries == null ? null : welcomeSeries.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", accountCode=").append(accountCode);
        sb.append(", biddingNewLowestAsk=").append(biddingNewLowestAsk);
        sb.append(", biddingNewHighestBid=").append(biddingNewHighestBid);
        sb.append(", bidExpiring=").append(bidExpiring);
        sb.append(", bidExpired=").append(bidExpired);
        sb.append(", askMatchesExpiredBid=").append(askMatchesExpiredBid);
        sb.append(", buyerNearbyMatch=").append(buyerNearbyMatch);
        sb.append(", bidAccepted=").append(bidAccepted);
        sb.append(", IPOBidAlmost=").append(IPOBidAlmost);
        sb.append(", IPOBidOut=").append(IPOBidOut);
        sb.append(", IPOBidAccepted=").append(IPOBidAccepted);
        sb.append(", followingNewLowestAsk=").append(followingNewLowestAsk);
        sb.append(", askingNewHighestBid=").append(askingNewHighestBid);
        sb.append(", askingNewHighestBidPercent=").append(askingNewHighestBidPercent);
        sb.append(", askingNewLowestAsk=").append(askingNewLowestAsk);
        sb.append(", askExpiring=").append(askExpiring);
        sb.append(", askExpired=").append(askExpired);
        sb.append(", itemSold=").append(itemSold);
        sb.append(", firstSellerHasNotShipped=").append(firstSellerHasNotShipped);
        sb.append(", secondSellerHasNotShipped=").append(secondSellerHasNotShipped);
        sb.append(", thirdSellerHasNotShipped=").append(thirdSellerHasNotShipped);
        sb.append(", productFeatures=").append(productFeatures);
        sb.append(", sneakerNews=").append(sneakerNews);
        sb.append(", handbagNews=").append(handbagNews);
        sb.append(", watchNews=").append(watchNews);
        sb.append(", streetwearNews=").append(streetwearNews);
        sb.append(", priceDropEmail=").append(priceDropEmail);
        sb.append(", welcomeSeries=").append(welcomeSeries);
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
        BusAccountNotification other = (BusAccountNotification) that;
        return (this.getAccountCode() == null ? other.getAccountCode() == null : this.getAccountCode().equals(other.getAccountCode()))
            && (this.getBiddingNewLowestAsk() == null ? other.getBiddingNewLowestAsk() == null : this.getBiddingNewLowestAsk().equals(other.getBiddingNewLowestAsk()))
            && (this.getBiddingNewHighestBid() == null ? other.getBiddingNewHighestBid() == null : this.getBiddingNewHighestBid().equals(other.getBiddingNewHighestBid()))
            && (this.getBidExpiring() == null ? other.getBidExpiring() == null : this.getBidExpiring().equals(other.getBidExpiring()))
            && (this.getBidExpired() == null ? other.getBidExpired() == null : this.getBidExpired().equals(other.getBidExpired()))
            && (this.getAskMatchesExpiredBid() == null ? other.getAskMatchesExpiredBid() == null : this.getAskMatchesExpiredBid().equals(other.getAskMatchesExpiredBid()))
            && (this.getBuyerNearbyMatch() == null ? other.getBuyerNearbyMatch() == null : this.getBuyerNearbyMatch().equals(other.getBuyerNearbyMatch()))
            && (this.getBidAccepted() == null ? other.getBidAccepted() == null : this.getBidAccepted().equals(other.getBidAccepted()))
            && (this.getIPOBidAlmost() == null ? other.getIPOBidAlmost() == null : this.getIPOBidAlmost().equals(other.getIPOBidAlmost()))
            && (this.getIPOBidOut() == null ? other.getIPOBidOut() == null : this.getIPOBidOut().equals(other.getIPOBidOut()))
            && (this.getIPOBidAccepted() == null ? other.getIPOBidAccepted() == null : this.getIPOBidAccepted().equals(other.getIPOBidAccepted()))
            && (this.getFollowingNewLowestAsk() == null ? other.getFollowingNewLowestAsk() == null : this.getFollowingNewLowestAsk().equals(other.getFollowingNewLowestAsk()))
            && (this.getAskingNewHighestBid() == null ? other.getAskingNewHighestBid() == null : this.getAskingNewHighestBid().equals(other.getAskingNewHighestBid()))
            && (this.getAskingNewHighestBidPercent() == null ? other.getAskingNewHighestBidPercent() == null : this.getAskingNewHighestBidPercent().equals(other.getAskingNewHighestBidPercent()))
            && (this.getAskingNewLowestAsk() == null ? other.getAskingNewLowestAsk() == null : this.getAskingNewLowestAsk().equals(other.getAskingNewLowestAsk()))
            && (this.getAskExpiring() == null ? other.getAskExpiring() == null : this.getAskExpiring().equals(other.getAskExpiring()))
            && (this.getAskExpired() == null ? other.getAskExpired() == null : this.getAskExpired().equals(other.getAskExpired()))
            && (this.getItemSold() == null ? other.getItemSold() == null : this.getItemSold().equals(other.getItemSold()))
            && (this.getFirstSellerHasNotShipped() == null ? other.getFirstSellerHasNotShipped() == null : this.getFirstSellerHasNotShipped().equals(other.getFirstSellerHasNotShipped()))
            && (this.getSecondSellerHasNotShipped() == null ? other.getSecondSellerHasNotShipped() == null : this.getSecondSellerHasNotShipped().equals(other.getSecondSellerHasNotShipped()))
            && (this.getThirdSellerHasNotShipped() == null ? other.getThirdSellerHasNotShipped() == null : this.getThirdSellerHasNotShipped().equals(other.getThirdSellerHasNotShipped()))
            && (this.getProductFeatures() == null ? other.getProductFeatures() == null : this.getProductFeatures().equals(other.getProductFeatures()))
            && (this.getSneakerNews() == null ? other.getSneakerNews() == null : this.getSneakerNews().equals(other.getSneakerNews()))
            && (this.getHandbagNews() == null ? other.getHandbagNews() == null : this.getHandbagNews().equals(other.getHandbagNews()))
            && (this.getWatchNews() == null ? other.getWatchNews() == null : this.getWatchNews().equals(other.getWatchNews()))
            && (this.getStreetwearNews() == null ? other.getStreetwearNews() == null : this.getStreetwearNews().equals(other.getStreetwearNews()))
            && (this.getPriceDropEmail() == null ? other.getPriceDropEmail() == null : this.getPriceDropEmail().equals(other.getPriceDropEmail()))
            && (this.getWelcomeSeries() == null ? other.getWelcomeSeries() == null : this.getWelcomeSeries().equals(other.getWelcomeSeries()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAccountCode() == null) ? 0 : getAccountCode().hashCode());
        result = prime * result + ((getBiddingNewLowestAsk() == null) ? 0 : getBiddingNewLowestAsk().hashCode());
        result = prime * result + ((getBiddingNewHighestBid() == null) ? 0 : getBiddingNewHighestBid().hashCode());
        result = prime * result + ((getBidExpiring() == null) ? 0 : getBidExpiring().hashCode());
        result = prime * result + ((getBidExpired() == null) ? 0 : getBidExpired().hashCode());
        result = prime * result + ((getAskMatchesExpiredBid() == null) ? 0 : getAskMatchesExpiredBid().hashCode());
        result = prime * result + ((getBuyerNearbyMatch() == null) ? 0 : getBuyerNearbyMatch().hashCode());
        result = prime * result + ((getBidAccepted() == null) ? 0 : getBidAccepted().hashCode());
        result = prime * result + ((getIPOBidAlmost() == null) ? 0 : getIPOBidAlmost().hashCode());
        result = prime * result + ((getIPOBidOut() == null) ? 0 : getIPOBidOut().hashCode());
        result = prime * result + ((getIPOBidAccepted() == null) ? 0 : getIPOBidAccepted().hashCode());
        result = prime * result + ((getFollowingNewLowestAsk() == null) ? 0 : getFollowingNewLowestAsk().hashCode());
        result = prime * result + ((getAskingNewHighestBid() == null) ? 0 : getAskingNewHighestBid().hashCode());
        result = prime * result + ((getAskingNewHighestBidPercent() == null) ? 0 : getAskingNewHighestBidPercent().hashCode());
        result = prime * result + ((getAskingNewLowestAsk() == null) ? 0 : getAskingNewLowestAsk().hashCode());
        result = prime * result + ((getAskExpiring() == null) ? 0 : getAskExpiring().hashCode());
        result = prime * result + ((getAskExpired() == null) ? 0 : getAskExpired().hashCode());
        result = prime * result + ((getItemSold() == null) ? 0 : getItemSold().hashCode());
        result = prime * result + ((getFirstSellerHasNotShipped() == null) ? 0 : getFirstSellerHasNotShipped().hashCode());
        result = prime * result + ((getSecondSellerHasNotShipped() == null) ? 0 : getSecondSellerHasNotShipped().hashCode());
        result = prime * result + ((getThirdSellerHasNotShipped() == null) ? 0 : getThirdSellerHasNotShipped().hashCode());
        result = prime * result + ((getProductFeatures() == null) ? 0 : getProductFeatures().hashCode());
        result = prime * result + ((getSneakerNews() == null) ? 0 : getSneakerNews().hashCode());
        result = prime * result + ((getHandbagNews() == null) ? 0 : getHandbagNews().hashCode());
        result = prime * result + ((getWatchNews() == null) ? 0 : getWatchNews().hashCode());
        result = prime * result + ((getStreetwearNews() == null) ? 0 : getStreetwearNews().hashCode());
        result = prime * result + ((getPriceDropEmail() == null) ? 0 : getPriceDropEmail().hashCode());
        result = prime * result + ((getWelcomeSeries() == null) ? 0 : getWelcomeSeries().hashCode());
        return result;
    }
}