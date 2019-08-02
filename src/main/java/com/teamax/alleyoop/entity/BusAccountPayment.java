package com.teamax.alleyoop.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class BusAccountPayment implements Serializable {
    /**
    * 编码
    **/
    private Integer paymentCode;

    /**
    * 支付方式类型,1-Paypal、2-信用卡、3-微信
    **/
    private Integer paymentType;

    /**
    * 信用卡编号
    **/
    private String cardNumber;

    /**
    * 有效期
    **/
    private String expires;

    /**
    * 安全码
    **/
    private String CVV;

    /**
    * Paypal账号
    **/
    private String paypal;

    /**
    * 微信账号
    **/
    private String weixin;

    /**
    * 用户ID
    **/
    private Integer accountCode;

    /**
    * 账单地址
    **/
    private Integer billingAddress;
    private BusAccountAddress bAddress;

    /**
    * 默认使用：0-未使用；1-默认使用；
    **/
    private Integer defaultUsed;

    private static final long serialVersionUID = 1L;

    public BusAccountAddress getbAddress() {
        return bAddress;
    }

    public void setbAddress(BusAccountAddress bAddress) {
        this.bAddress = bAddress;
    }

    public Integer getPaymentCode() {
        return paymentCode;
    }

    public BusAccountPayment withPaymentCode(Integer paymentCode) {
        this.setPaymentCode(paymentCode);
        return this;
    }

    public void setPaymentCode(Integer paymentCode) {
        this.paymentCode = paymentCode;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public BusAccountPayment withPaymentType(Integer paymentType) {
        this.setPaymentType(paymentType);
        return this;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public BusAccountPayment withCardNumber(String cardNumber) {
        this.setCardNumber(cardNumber);
        return this;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber == null ? null : cardNumber.trim();
    }

    public String getExpires() {
        return expires;
    }

    public BusAccountPayment withExpires(String expires) {
        this.setExpires(expires);
        return this;
    }

    public void setExpires(String expires) {
        this.expires = expires == null ? null : expires.trim();
    }

    public String getCVV() {
        return CVV;
    }

    public BusAccountPayment withCVV(String CVV) {
        this.setCVV(CVV);
        return this;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV == null ? null : CVV.trim();
    }

    public String getPaypal() {
        return paypal;
    }

    public BusAccountPayment withPaypal(String paypal) {
        this.setPaypal(paypal);
        return this;
    }

    public void setPaypal(String paypal) {
        this.paypal = paypal == null ? null : paypal.trim();
    }

    public String getWeixin() {
        return weixin;
    }

    public BusAccountPayment withWeixin(String weixin) {
        this.setWeixin(weixin);
        return this;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public Integer getAccountCode() {
        return accountCode;
    }

    public BusAccountPayment withAccountCode(Integer accountCode) {
        this.setAccountCode(accountCode);
        return this;
    }

    public void setAccountCode(Integer accountCode) {
        this.accountCode = accountCode;
    }

    public Integer getBillingAddress() {
        return billingAddress;
    }

    public BusAccountPayment withBillingAddress(Integer billingAddress) {
        this.setBillingAddress(billingAddress);
        return this;
    }

    public void setBillingAddress(Integer billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Integer getDefaultUsed() {
        return defaultUsed;
    }

    public BusAccountPayment withDefaultUsed(Integer defaultUsed) {
        this.setDefaultUsed(defaultUsed);
        return this;
    }

    public void setDefaultUsed(Integer defaultUsed) {
        this.defaultUsed = defaultUsed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", paymentCode=").append(paymentCode);
        sb.append(", paymentType=").append(paymentType);
        sb.append(", cardNumber=").append(cardNumber);
        sb.append(", expires=").append(expires);
        sb.append(", CVV=").append(CVV);
        sb.append(", paypal=").append(paypal);
        sb.append(", weixin=").append(weixin);
        sb.append(", accountCode=").append(accountCode);
        sb.append(", billingAddress=").append(billingAddress);
        sb.append(", defaultUsed=").append(defaultUsed);
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
        BusAccountPayment other = (BusAccountPayment) that;
        if(this.getPaymentType()==1){ //Paypal
            return (this.getPaymentType() == null ? other.getPaymentType() == null : this.getPaymentType().equals(other.getPaymentType()))
                    && (this.getPaypal() == null ? other.getPaypal() == null : this.getPaypal().equals(other.getPaypal()))
                    && (this.getAccountCode() == null ? other.getAccountCode() == null : this.getAccountCode().equals(other.getAccountCode()))
                    && (this.getBillingAddress() == null ? other.getBillingAddress() == null : this.getBillingAddress().equals(other.getBillingAddress()));
        }else if(this.getPaymentType()==2){ //信用卡
            return (this.getPaymentType() == null ? other.getPaymentType() == null : this.getPaymentType().equals(other.getPaymentType()))
                    && (this.getCardNumber() == null ? other.getCardNumber() == null : this.getCardNumber().equals(other.getCardNumber()))
                    && (this.getExpires() == null ? other.getExpires() == null : this.getExpires().equals(other.getExpires()))
                    && (this.getCVV() == null ? other.getCVV() == null : this.getCVV().equals(other.getCVV()))
                    && (this.getAccountCode() == null ? other.getAccountCode() == null : this.getAccountCode().equals(other.getAccountCode()))
                    && (this.getBillingAddress() == null ? other.getBillingAddress() == null : this.getBillingAddress().equals(other.getBillingAddress()));
        }else if(this.getPaymentType()==3){ //微信
            return (this.getPaymentType() == null ? other.getPaymentType() == null : this.getPaymentType().equals(other.getPaymentType()))
                    && (this.getWeixin() == null ? other.getWeixin() == null : this.getWeixin().equals(other.getWeixin()))
                    && (this.getAccountCode() == null ? other.getAccountCode() == null : this.getAccountCode().equals(other.getAccountCode()))
                    && (this.getBillingAddress() == null ? other.getBillingAddress() == null : this.getBillingAddress().equals(other.getBillingAddress()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPaymentCode() == null) ? 0 : getPaymentCode().hashCode());
        result = prime * result + ((getPaymentType() == null) ? 0 : getPaymentType().hashCode());
        result = prime * result + ((getCardNumber() == null) ? 0 : getCardNumber().hashCode());
        result = prime * result + ((getExpires() == null) ? 0 : getExpires().hashCode());
        result = prime * result + ((getCVV() == null) ? 0 : getCVV().hashCode());
        result = prime * result + ((getPaypal() == null) ? 0 : getPaypal().hashCode());
        result = prime * result + ((getWeixin() == null) ? 0 : getWeixin().hashCode());
        result = prime * result + ((getAccountCode() == null) ? 0 : getAccountCode().hashCode());
        result = prime * result + ((getBillingAddress() == null) ? 0 : getBillingAddress().hashCode());
        result = prime * result + ((getDefaultUsed() == null) ? 0 : getDefaultUsed().hashCode());
        return result;
    }
}