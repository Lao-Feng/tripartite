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
public class BusAsk implements Serializable {
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
    * 要价金额
    **/
    private Double askPrice;

    /**
    * 报价时间
    **/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date askTime;

    /**
    * 报价有效期（天数）
    **/
    private Integer askExpiration;

    /**
    * 收款方式
    **/
    private String payout;

    /**
    * 用户ID
    **/
    private Integer accountCode;
    private BusAccount account;
    private BusAccountNotification accountNotification;//消息通知

    /**
    * 收款账号
    **/
    private Integer paymentCode;

    /**
    * 卖方发货地址
    **/
    private Integer mailedFromCode;

    /**
    * 状态:-2-卖家取消不卖; -1-要价已过期、0-要价可用、1-买家已下单、2-已成交(已出售)
    **/
    private Integer status;

    private Integer available;

    public BusAccount getAccount() {
        return account;
    }

    public void setAccount(BusAccount account) {
        this.account = account;
    }

    public BusCommondity getCommodity() {
        return commodity;
    }

    public void setCommodity(BusCommondity commodity) {
        this.commodity = commodity;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    private static final long serialVersionUID = 1L;

    public Integer getCode() {
        return code;
    }

    public BusAsk withCode(Integer code) {
        this.setCode(code);
        return this;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCommondityCode() {
        return commondityCode;
    }

    public BusAsk withCommondityCode(Integer commondityCode) {
        this.setCommondityCode(commondityCode);
        return this;
    }

    public void setCommondityCode(Integer commondityCode) {
        this.commondityCode = commondityCode;
    }

    public Integer getSizeCode() {
        return sizeCode;
    }

    public BusAsk withSizeCode(Integer sizeCode) {
        this.setSizeCode(sizeCode);
        return this;
    }

    public void setSizeCode(Integer sizeCode) {
        this.sizeCode = sizeCode;
    }

    public String getSizeName() {
        return sizeName;
    }

    public BusAsk withSizeName(String sizeName) {
        this.setSizeName(sizeName);
        return this;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName == null ? null : sizeName.trim();
    }

    public Double getAskPrice() {
        return askPrice;
    }

    public BusAsk withAskPrice(Double askPrice) {
        this.setAskPrice(askPrice);
        return this;
    }

    public void setAskPrice(Double askPrice) {
        this.askPrice = askPrice;
    }

    public Date getAskTime() {
        return askTime;
    }

    public BusAsk withAskTime(Date askTime) {
        this.setAskTime(askTime);
        return this;
    }

    public void setAskTime(Date askTime) {
        this.askTime = askTime;
    }

    public Integer getAskExpiration() {
        return askExpiration;
    }

    public BusAsk withAskExpiration(Integer askExpiration) {
        this.setAskExpiration(askExpiration);
        return this;
    }

    public void setAskExpiration(Integer askExpiration) {
        this.askExpiration = askExpiration;
    }

    public String getPayout() {
        return payout;
    }

    public BusAsk withPayout(String payout) {
        this.setPayout(payout);
        return this;
    }

    public void setPayout(String payout) {
        this.payout = payout == null ? null : payout.trim();
    }

    public Integer getAccountCode() {
        return accountCode;
    }

    public BusAsk withAccountCode(Integer accountCode) {
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

    public BusAsk withPaymentCode(Integer paymentCode) {
        this.setPaymentCode(paymentCode);
        return this;
    }

    public void setPaymentCode(Integer paymentCode) {
        this.paymentCode = paymentCode;
    }

    public Integer getMailedFromCode() {
        return mailedFromCode;
    }

    public BusAsk withMailedFromCode(Integer mailedFromCode) {
        this.setMailedFromCode(mailedFromCode);
        return this;
    }

    public void setMailedFromCode(Integer mailedFromCode) {
        this.mailedFromCode = mailedFromCode;
    }

    public Integer getStatus() {
        return status;
    }

    public BusAsk withStatus(Integer status) {
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
        sb.append(", askPrice=").append(askPrice);
        sb.append(", askTime=").append(askTime);
        sb.append(", askExpiration=").append(askExpiration);
        sb.append(", payout=").append(payout);
        sb.append(", accountCode=").append(accountCode);
        sb.append(", paymentCode=").append(paymentCode);
        sb.append(", mailedFromCode=").append(mailedFromCode);
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
        BusAsk other = (BusAsk) that;
        return (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getCommondityCode() == null ? other.getCommondityCode() == null : this.getCommondityCode().equals(other.getCommondityCode()))
            && (this.getSizeCode() == null ? other.getSizeCode() == null : this.getSizeCode().equals(other.getSizeCode()))
            && (this.getSizeName() == null ? other.getSizeName() == null : this.getSizeName().equals(other.getSizeName()))
            && (this.getAskPrice() == null ? other.getAskPrice() == null : this.getAskPrice().equals(other.getAskPrice()))
            && (this.getAskTime() == null ? other.getAskTime() == null : this.getAskTime().equals(other.getAskTime()))
            && (this.getAskExpiration() == null ? other.getAskExpiration() == null : this.getAskExpiration().equals(other.getAskExpiration()))
            && (this.getPayout() == null ? other.getPayout() == null : this.getPayout().equals(other.getPayout()))
            && (this.getAccountCode() == null ? other.getAccountCode() == null : this.getAccountCode().equals(other.getAccountCode()))
            && (this.getPaymentCode() == null ? other.getPaymentCode() == null : this.getPaymentCode().equals(other.getPaymentCode()))
            && (this.getMailedFromCode() == null ? other.getMailedFromCode() == null : this.getMailedFromCode().equals(other.getMailedFromCode()))
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
        result = prime * result + ((getAskPrice() == null) ? 0 : getAskPrice().hashCode());
        result = prime * result + ((getAskTime() == null) ? 0 : getAskTime().hashCode());
        result = prime * result + ((getAskExpiration() == null) ? 0 : getAskExpiration().hashCode());
        result = prime * result + ((getPayout() == null) ? 0 : getPayout().hashCode());
        result = prime * result + ((getAccountCode() == null) ? 0 : getAccountCode().hashCode());
        result = prime * result + ((getPaymentCode() == null) ? 0 : getPaymentCode().hashCode());
        result = prime * result + ((getMailedFromCode() == null) ? 0 : getMailedFromCode().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}