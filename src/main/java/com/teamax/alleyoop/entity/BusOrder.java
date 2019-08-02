package com.teamax.alleyoop.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusOrder implements Serializable {
    /**
    * 订单编码
    **/
    private Integer orderCode;

    /**
    * 订单类型:buy-购买;sell-出售;
    **/
    private String orderType;

    /**
    * 商品编码
    **/
    private Integer commondityCode;
    private BusCommondity commodity;
    /**
    * 规格编码
    **/
    private Integer sizeCode;

    /**
    * 规格名称
    **/
    private String sizeName;

    /**
    * 购买人编码
    **/
    private Integer buyer;
    private BusAccount purchaser;
    /**
    * 卖手编码
    **/
    private Integer seller;
    private BusAccount offer;
    /**
    * 商品价格
    **/
    private Double commondityPrice;

    /**
    * 检验费，0加币
    **/
    private Double authenticationFee;

    /**
    * 物流费，如果自提费用为0，否则固定15加币
    **/
    private Double shippingFee;

    /**
    * 平台手续费，商品价格的20%
    **/
    private Double processingFee;

    /**
    * 订单进度: 0-订单待确认、1-订单生效、2-卖家备货中、3-卖家物流到平台、4-平台收货、5-平台验货、6-平台物流给买家、7-买家收货、8-订单完成、-2-买家退货给平台、-1-平台退货给卖家、11-订单已支付
    **/
    private String progress;

    /**
    * 下单时间
    **/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")//出参格式
    private Date orderTime;

    /**
    * 是否自提，1-自提
    **/
    private Integer selfPickup;

    /**
    * 购买人支付账号
    **/
    private Integer buyerPayment;

    /**
    * 购买人收货地址
    **/
    private Integer buyerAddress;
    private BusAccountAddress bAddress;
    /**
    * 出售方收款账号
    **/
    private Integer sellerPayment;

    /**
    * 出售方寄出地址
    **/
    private Integer sellerAddress;
    private BusAccountAddress sAddress;
    /**
    * bus_ask要价编码
    **/
    private Integer askCode;

    /**
    * bus_bid出价编码
    **/
    private Integer bidCode;

    /**
    * 优惠券编号 多个以逗号,分隔
    **/
    private String discountCodes;

    /**
    * 支付回单号码
    **/
    private String receiptNumber;

    /**
    * 支付方式
    **/
    private String paymentMethod;

    /**
    * 支付完成时间
    **/
    private Date paymentTime;

    /**
    * 支付状态，0-待支付，1-已支付
    **/
    private Integer paymentState;

    /**
     * 出售时，匹配到的购买人（多个以逗号,分隔）
     **/
    private String availableBuyers;

    /**
     * 购买时，匹配到的出售人（多个以逗号,分隔）
     **/
    private String availableSellers;

    /**
     * 出售时，匹配到的购买人出价（多个以逗号,分隔）
     **/
    private String availableBids;

    /**
     * 购买时，匹配到的出售人要价（多个以逗号,分隔）
     **/
    private String availableAsks;

    private static final long serialVersionUID = 1L;

    public BusCommondity getCommodity() {
        return commodity;
    }

    public void setCommodity(BusCommondity commodity) {
        this.commodity = commodity;
    }

    public BusAccount getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(BusAccount purchaser) {
        this.purchaser = purchaser;
    }

    public BusAccount getOffer() {
        return offer;
    }

    public void setOffer(BusAccount offer) {
        this.offer = offer;
    }

    public BusAccountAddress getbAddress() {
        return bAddress;
    }

    public void setbAddress(BusAccountAddress bAddress) {
        this.bAddress = bAddress;
    }

    public BusAccountAddress getsAddress() {
        return sAddress;
    }

    public void setsAddress(BusAccountAddress sAddress) {
        this.sAddress = sAddress;
    }

    public Integer getOrderCode() {
        return orderCode;
    }

    public BusOrder withOrderCode(Integer orderCode) {
        this.setOrderCode(orderCode);
        return this;
    }

    public void setOrderCode(Integer orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderType() {
        return orderType;
    }

    public BusOrder withOrderType(String orderType) {
        this.setOrderType(orderType);
        return this;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public Integer getCommondityCode() {
        return commondityCode;
    }

    public BusOrder withCommondityCode(Integer commondityCode) {
        this.setCommondityCode(commondityCode);
        return this;
    }

    public void setCommondityCode(Integer commondityCode) {
        this.commondityCode = commondityCode;
    }

    public Integer getSizeCode() {
        return sizeCode;
    }

    public BusOrder withSizeCode(Integer sizeCode) {
        this.setSizeCode(sizeCode);
        return this;
    }

    public void setSizeCode(Integer sizeCode) {
        this.sizeCode = sizeCode;
    }

    public String getSizeName() {
        return sizeName;
    }

    public BusOrder withSizeName(String sizeName) {
        this.setSizeName(sizeName);
        return this;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName == null ? null : sizeName.trim();
    }

    public Integer getBuyer() {
        return buyer;
    }

    public BusOrder withBuyer(Integer buyer) {
        this.setBuyer(buyer);
        return this;
    }

    public void setBuyer(Integer buyer) {
        this.buyer = buyer;
    }

    public Integer getSeller() {
        return seller;
    }

    public BusOrder withSeller(Integer seller) {
        this.setSeller(seller);
        return this;
    }

    public void setSeller(Integer seller) {
        this.seller = seller;
    }

    public Double getCommondityPrice() {
        return commondityPrice;
    }

    public BusOrder withCommondityPrice(Double commondityPrice) {
        this.setCommondityPrice(commondityPrice);
        return this;
    }

    public void setCommondityPrice(Double commondityPrice) {
        this.commondityPrice = commondityPrice;
    }

    public Double getAuthenticationFee() {
        return authenticationFee;
    }

    public BusOrder withAuthenticationFee(Double authenticationFee) {
        this.setAuthenticationFee(authenticationFee);
        return this;
    }

    public void setAuthenticationFee(Double authenticationFee) {
        this.authenticationFee = authenticationFee;
    }

    public Double getShippingFee() {
        return shippingFee;
    }

    public BusOrder withShippingFee(Double shippingFee) {
        this.setShippingFee(shippingFee);
        return this;
    }

    public void setShippingFee(Double shippingFee) {
        this.shippingFee = shippingFee;
    }

    public Double getProcessingFee() {
        return processingFee;
    }

    public BusOrder withProcessingFee(Double processingFee) {
        this.setProcessingFee(processingFee);
        return this;
    }

    public void setProcessingFee(Double processingFee) {
        this.processingFee = processingFee;
    }

    public String getProgress() {
        return progress;
    }

    public BusOrder withProgress(String progress) {
        this.setProgress(progress);
        return this;
    }

    public void setProgress(String progress) {
        this.progress = progress == null ? null : progress.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public BusOrder withOrderTime(Date orderTime) {
        this.setOrderTime(orderTime);
        return this;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getSelfPickup() {
        return selfPickup;
    }

    public BusOrder withSelfPickup(Integer selfPickup) {
        this.setSelfPickup(selfPickup);
        return this;
    }

    public void setSelfPickup(Integer selfPickup) {
        this.selfPickup = selfPickup;
    }

    public Integer getBuyerPayment() {
        return buyerPayment;
    }

    public BusOrder withBuyerPayment(Integer buyerPayment) {
        this.setBuyerPayment(buyerPayment);
        return this;
    }

    public void setBuyerPayment(Integer buyerPayment) {
        this.buyerPayment = buyerPayment;
    }

    public Integer getBuyerAddress() {
        return buyerAddress;
    }

    public BusOrder withBuyerAddress(Integer buyerAddress) {
        this.setBuyerAddress(buyerAddress);
        return this;
    }

    public void setBuyerAddress(Integer buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public Integer getSellerPayment() {
        return sellerPayment;
    }

    public BusOrder withSellerPayment(Integer sellerPayment) {
        this.setSellerPayment(sellerPayment);
        return this;
    }

    public void setSellerPayment(Integer sellerPayment) {
        this.sellerPayment = sellerPayment;
    }

    public Integer getSellerAddress() {
        return sellerAddress;
    }

    public BusOrder withSellerAddress(Integer sellerAddress) {
        this.setSellerAddress(sellerAddress);
        return this;
    }

    public void setSellerAddress(Integer sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    public Integer getAskCode() {
        return askCode;
    }

    public BusOrder withAskCode(Integer askCode) {
        this.setAskCode(askCode);
        return this;
    }

    public void setAskCode(Integer askCode) {
        this.askCode = askCode;
    }

    public Integer getBidCode() {
        return bidCode;
    }

    public BusOrder withBidCode(Integer bidCode) {
        this.setBidCode(bidCode);
        return this;
    }

    public void setBidCode(Integer bidCode) {
        this.bidCode = bidCode;
    }

    public String getDiscountCodes() {
        return discountCodes;
    }

    public BusOrder withDiscountCodes(String discountCodes) {
        this.setDiscountCodes(discountCodes);
        return this;
    }

    public void setDiscountCodes(String discountCodes) {
        this.discountCodes = discountCodes == null ? null : discountCodes.trim();
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public BusOrder withReceiptNumber(String receiptNumber) {
        this.setReceiptNumber(receiptNumber);
        return this;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber == null ? null : receiptNumber.trim();
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public BusOrder withPaymentMethod(String paymentMethod) {
        this.setPaymentMethod(paymentMethod);
        return this;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod == null ? null : paymentMethod.trim();
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public BusOrder withPaymentTime(Date paymentTime) {
        this.setPaymentTime(paymentTime);
        return this;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Integer getPaymentState() {
        return paymentState;
    }

    public BusOrder withPaymentState(Integer paymentState) {
        this.setPaymentState(paymentState);
        return this;
    }

    public void setPaymentState(Integer paymentState) {
        this.paymentState = paymentState;
    }

    public String getAvailableBuyers() {
        return availableBuyers;
    }

    public void setAvailableBuyers(String availableBuyers) {
        this.availableBuyers = availableBuyers;
    }

    public String getAvailableSellers() {
        return availableSellers;
    }

    public void setAvailableSellers(String availableSellers) {
        this.availableSellers = availableSellers;
    }

    public String getAvailableBids() {
        return availableBids;
    }

    public void setAvailableBids(String availableBids) {
        this.availableBids = availableBids;
    }

    public String getAvailableAsks() {
        return availableAsks;
    }

    public void setAvailableAsks(String availableAsks) {
        this.availableAsks = availableAsks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderCode=").append(orderCode);
        sb.append(", orderType=").append(orderType);
        sb.append(", commondityCode=").append(commondityCode);
        sb.append(", sizeCode=").append(sizeCode);
        sb.append(", sizeName=").append(sizeName);
        sb.append(", buyer=").append(buyer);
        sb.append(", seller=").append(seller);
        sb.append(", commondityPrice=").append(commondityPrice);
        sb.append(", authenticationFee=").append(authenticationFee);
        sb.append(", shippingFee=").append(shippingFee);
        sb.append(", processingFee=").append(processingFee);
        sb.append(", progress=").append(progress);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", selfPickup=").append(selfPickup);
        sb.append(", buyerPayment=").append(buyerPayment);
        sb.append(", buyerAddress=").append(buyerAddress);
        sb.append(", sellerPayment=").append(sellerPayment);
        sb.append(", sellerAddress=").append(sellerAddress);
        sb.append(", askCode=").append(askCode);
        sb.append(", bidCode=").append(bidCode);
        sb.append(", discountCodes=").append(discountCodes);
        sb.append(", receiptNumber=").append(receiptNumber);
        sb.append(", paymentMethod=").append(paymentMethod);
        sb.append(", paymentTime=").append(paymentTime);
        sb.append(", paymentState=").append(paymentState);
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
        BusOrder other = (BusOrder) that;
        return (this.getOrderCode() == null ? other.getOrderCode() == null : this.getOrderCode().equals(other.getOrderCode()))
            && (this.getOrderType() == null ? other.getOrderType() == null : this.getOrderType().equals(other.getOrderType()))
            && (this.getCommondityCode() == null ? other.getCommondityCode() == null : this.getCommondityCode().equals(other.getCommondityCode()))
            && (this.getSizeCode() == null ? other.getSizeCode() == null : this.getSizeCode().equals(other.getSizeCode()))
            && (this.getSizeName() == null ? other.getSizeName() == null : this.getSizeName().equals(other.getSizeName()))
            && (this.getBuyer() == null ? other.getBuyer() == null : this.getBuyer().equals(other.getBuyer()))
            && (this.getSeller() == null ? other.getSeller() == null : this.getSeller().equals(other.getSeller()))
            && (this.getCommondityPrice() == null ? other.getCommondityPrice() == null : this.getCommondityPrice().equals(other.getCommondityPrice()))
            && (this.getAuthenticationFee() == null ? other.getAuthenticationFee() == null : this.getAuthenticationFee().equals(other.getAuthenticationFee()))
            && (this.getShippingFee() == null ? other.getShippingFee() == null : this.getShippingFee().equals(other.getShippingFee()))
            && (this.getProcessingFee() == null ? other.getProcessingFee() == null : this.getProcessingFee().equals(other.getProcessingFee()))
            && (this.getProgress() == null ? other.getProgress() == null : this.getProgress().equals(other.getProgress()))
            && (this.getOrderTime() == null ? other.getOrderTime() == null : this.getOrderTime().equals(other.getOrderTime()))
            && (this.getSelfPickup() == null ? other.getSelfPickup() == null : this.getSelfPickup().equals(other.getSelfPickup()))
            && (this.getBuyerPayment() == null ? other.getBuyerPayment() == null : this.getBuyerPayment().equals(other.getBuyerPayment()))
            && (this.getBuyerAddress() == null ? other.getBuyerAddress() == null : this.getBuyerAddress().equals(other.getBuyerAddress()))
            && (this.getSellerPayment() == null ? other.getSellerPayment() == null : this.getSellerPayment().equals(other.getSellerPayment()))
            && (this.getSellerAddress() == null ? other.getSellerAddress() == null : this.getSellerAddress().equals(other.getSellerAddress()))
            && (this.getAskCode() == null ? other.getAskCode() == null : this.getAskCode().equals(other.getAskCode()))
            && (this.getBidCode() == null ? other.getBidCode() == null : this.getBidCode().equals(other.getBidCode()))
            && (this.getDiscountCodes() == null ? other.getDiscountCodes() == null : this.getDiscountCodes().equals(other.getDiscountCodes()))
            && (this.getReceiptNumber() == null ? other.getReceiptNumber() == null : this.getReceiptNumber().equals(other.getReceiptNumber()))
            && (this.getPaymentMethod() == null ? other.getPaymentMethod() == null : this.getPaymentMethod().equals(other.getPaymentMethod()))
            && (this.getPaymentTime() == null ? other.getPaymentTime() == null : this.getPaymentTime().equals(other.getPaymentTime()))
            && (this.getPaymentState() == null ? other.getPaymentState() == null : this.getPaymentState().equals(other.getPaymentState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderCode() == null) ? 0 : getOrderCode().hashCode());
        result = prime * result + ((getOrderType() == null) ? 0 : getOrderType().hashCode());
        result = prime * result + ((getCommondityCode() == null) ? 0 : getCommondityCode().hashCode());
        result = prime * result + ((getSizeCode() == null) ? 0 : getSizeCode().hashCode());
        result = prime * result + ((getSizeName() == null) ? 0 : getSizeName().hashCode());
        result = prime * result + ((getBuyer() == null) ? 0 : getBuyer().hashCode());
        result = prime * result + ((getSeller() == null) ? 0 : getSeller().hashCode());
        result = prime * result + ((getCommondityPrice() == null) ? 0 : getCommondityPrice().hashCode());
        result = prime * result + ((getAuthenticationFee() == null) ? 0 : getAuthenticationFee().hashCode());
        result = prime * result + ((getShippingFee() == null) ? 0 : getShippingFee().hashCode());
        result = prime * result + ((getProcessingFee() == null) ? 0 : getProcessingFee().hashCode());
        result = prime * result + ((getProgress() == null) ? 0 : getProgress().hashCode());
        result = prime * result + ((getOrderTime() == null) ? 0 : getOrderTime().hashCode());
        result = prime * result + ((getSelfPickup() == null) ? 0 : getSelfPickup().hashCode());
        result = prime * result + ((getBuyerPayment() == null) ? 0 : getBuyerPayment().hashCode());
        result = prime * result + ((getBuyerAddress() == null) ? 0 : getBuyerAddress().hashCode());
        result = prime * result + ((getSellerPayment() == null) ? 0 : getSellerPayment().hashCode());
        result = prime * result + ((getSellerAddress() == null) ? 0 : getSellerAddress().hashCode());
        result = prime * result + ((getAskCode() == null) ? 0 : getAskCode().hashCode());
        result = prime * result + ((getBidCode() == null) ? 0 : getBidCode().hashCode());
        result = prime * result + ((getDiscountCodes() == null) ? 0 : getDiscountCodes().hashCode());
        result = prime * result + ((getReceiptNumber() == null) ? 0 : getReceiptNumber().hashCode());
        result = prime * result + ((getPaymentMethod() == null) ? 0 : getPaymentMethod().hashCode());
        result = prime * result + ((getPaymentTime() == null) ? 0 : getPaymentTime().hashCode());
        result = prime * result + ((getPaymentState() == null) ? 0 : getPaymentState().hashCode());
        return result;
    }
}