package com.teamax.alleyoop.entity;

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
public class BusBid implements Serializable {
    /**
    * 序号
    **/
    private Integer code;

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
    * 出价金额
    **/
    private Double bidPrice;

    /**
    * 报价时间
    **/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date bidTime;

    /**
    * 报价有效期（天数）
    **/
    private Integer bidExpiration;

    /**
    * 付款方式
    **/
    private String payMethod;

    /**
    * 用户ID
    **/
    private Integer accountCode;
    private BusAccount account;
    private BusAccountNotification accountNotification;//消息通知

    /**
    * 支付账号
    **/
    private Integer paymentCode;

    /**
    * 买方接收地址
    **/
    private Integer mailedToCode;

    /**
    * 状态:-2-买家取消不买; -1-出价已过期、0-出价可用、1-卖家已下单、2-已成交(已购买)
    **/
    private Integer status;

    private Integer available;

    private static final long serialVersionUID = 1L;

    public BusCommondity getCommodity() {
        return commodity;
    }

    public void setCommodity(BusCommondity commodity) {
        this.commodity = commodity;
    }

    public BusAccount getAccount() {
        return account;
    }

    public void setAccount(BusAccount account) {
        this.account = account;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public Integer getCode() {
        return code;
    }

    public BusBid withCode(Integer code) {
        this.setCode(code);
        return this;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCommondityCode() {
        return commondityCode;
    }

    public BusBid withCommondityCode(Integer commondityCode) {
        this.setCommondityCode(commondityCode);
        return this;
    }

    public void setCommondityCode(Integer commondityCode) {
        this.commondityCode = commondityCode;
    }

    public Integer getSizeCode() {
        return sizeCode;
    }

    public BusBid withSizeCode(Integer sizeCode) {
        this.setSizeCode(sizeCode);
        return this;
    }

    public void setSizeCode(Integer sizeCode) {
        this.sizeCode = sizeCode;
    }

    public String getSizeName() {
        return sizeName;
    }

    public BusBid withSizeName(String sizeName) {
        this.setSizeName(sizeName);
        return this;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName == null ? null : sizeName.trim();
    }

    public Double getBidPrice() {
        return bidPrice;
    }

    public BusBid withBidPrice(Double bidPrice) {
        this.setBidPrice(bidPrice);
        return this;
    }

    public void setBidPrice(Double bidPrice) {
        this.bidPrice = bidPrice;
    }

    public Date getBidTime() {
        return bidTime;
    }

    public BusBid withBidTime(Date bidTime) {
        this.setBidTime(bidTime);
        return this;
    }

    public void setBidTime(Date bidTime) {
        this.bidTime = bidTime;
    }

    public Integer getBidExpiration() {
        return bidExpiration;
    }

    public BusBid withBidExpiration(Integer bidExpiration) {
        this.setBidExpiration(bidExpiration);
        return this;
    }

    public void setBidExpiration(Integer bidExpiration) {
        this.bidExpiration = bidExpiration;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public BusBid withPayMethod(String payMethod) {
        this.setPayMethod(payMethod);
        return this;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod == null ? null : payMethod.trim();
    }

    public Integer getAccountCode() {
        return accountCode;
    }

    public BusBid withAccountCode(Integer accountCode) {
        this.setAccountCode(accountCode);
        return this;
    }

    public void setAccountCode(Integer accountCode) {
        this.accountCode = accountCode;
    }

    public BusAccountNotification getAccountNotification() {
        return accountNotification;
    }

    public void setAccountNotification(BusAccountNotification accountNotification) {
        this.accountNotification = accountNotification;
    }

    public Integer getPaymentCode() {
        return paymentCode;
    }

    public BusBid withPaymentCode(Integer paymentCode) {
        this.setPaymentCode(paymentCode);
        return this;
    }

    public void setPaymentCode(Integer paymentCode) {
        this.paymentCode = paymentCode;
    }

    public Integer getMailedToCode() {
        return mailedToCode;
    }

    public BusBid withMailedToCode(Integer mailedToCode) {
        this.setMailedToCode(mailedToCode);
        return this;
    }

    public void setMailedToCode(Integer mailedToCode) {
        this.mailedToCode = mailedToCode;
    }

    public Integer getStatus() {
        return status;
    }

    public BusBid withStatus(Integer status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", code=").append(code);
        sb.append(", commondityCode=").append(commondityCode);
        sb.append(", sizeCode=").append(sizeCode);
        sb.append(", sizeName=").append(sizeName);
        sb.append(", bidPrice=").append(bidPrice);
        sb.append(", bidTime=").append(bidTime);
        sb.append(", bidExpiration=").append(bidExpiration);
        sb.append(", payMethod=").append(payMethod);
        sb.append(", accountCode=").append(accountCode);
        sb.append(", paymentCode=").append(paymentCode);
        sb.append(", mailedToCode=").append(mailedToCode);
        sb.append(", status=").append(status);
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
        BusBid other = (BusBid) that;
        return (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getCommondityCode() == null ? other.getCommondityCode() == null : this.getCommondityCode().equals(other.getCommondityCode()))
            && (this.getSizeCode() == null ? other.getSizeCode() == null : this.getSizeCode().equals(other.getSizeCode()))
            && (this.getSizeName() == null ? other.getSizeName() == null : this.getSizeName().equals(other.getSizeName()))
            && (this.getBidPrice() == null ? other.getBidPrice() == null : this.getBidPrice().equals(other.getBidPrice()))
            && (this.getBidTime() == null ? other.getBidTime() == null : this.getBidTime().equals(other.getBidTime()))
            && (this.getBidExpiration() == null ? other.getBidExpiration() == null : this.getBidExpiration().equals(other.getBidExpiration()))
            && (this.getPayMethod() == null ? other.getPayMethod() == null : this.getPayMethod().equals(other.getPayMethod()))
            && (this.getAccountCode() == null ? other.getAccountCode() == null : this.getAccountCode().equals(other.getAccountCode()))
            && (this.getPaymentCode() == null ? other.getPaymentCode() == null : this.getPaymentCode().equals(other.getPaymentCode()))
            && (this.getMailedToCode() == null ? other.getMailedToCode() == null : this.getMailedToCode().equals(other.getMailedToCode()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getCommondityCode() == null) ? 0 : getCommondityCode().hashCode());
        result = prime * result + ((getSizeCode() == null) ? 0 : getSizeCode().hashCode());
        result = prime * result + ((getSizeName() == null) ? 0 : getSizeName().hashCode());
        result = prime * result + ((getBidPrice() == null) ? 0 : getBidPrice().hashCode());
        result = prime * result + ((getBidTime() == null) ? 0 : getBidTime().hashCode());
        result = prime * result + ((getBidExpiration() == null) ? 0 : getBidExpiration().hashCode());
        result = prime * result + ((getPayMethod() == null) ? 0 : getPayMethod().hashCode());
        result = prime * result + ((getAccountCode() == null) ? 0 : getAccountCode().hashCode());
        result = prime * result + ((getPaymentCode() == null) ? 0 : getPaymentCode().hashCode());
        result = prime * result + ((getMailedToCode() == null) ? 0 : getMailedToCode().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}