package com.teamax.alleyoop.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class BusAccount implements Serializable {
    /**
    * 账号
    **/
    private Integer accountCode;

    /**
    * 名字
    **/
    private String firstName;

    /**
    * 姓氏
    **/
    private String lastName;

    /**
    * 用户名
    **/
    private String userName;

    /**
    * 邮箱地址
    **/
    private String emailAddress;

    /**
    * 密码
    **/
    private String password;

    /**
    * 采用的货币
    **/
    private String selectedCurrency;

    /**
    * 鞋码
    **/
    private String shoeSize;

    /**
    * 关注商品大类
    **/
    private String vice;

    /**
    * 是否支持指纹登录，0-不支持，1-支持
    **/
    private Integer fingerPrintLogin;

    /**
    * 假日模型，1-启用，2-未启用
    **/
    private String vacationMode;

    /**
    * 购买支付方式
    **/
    private Integer buyingPayment;

    /**
    * 购买单据填写地址
    **/
    private Integer buyingBilling;

    /**
    * 购买物流收货地址
    **/
    private Integer buyingShipping;

    /**
    * 销售收款方式
    **/
    private Integer sellerPayment;

    /**
    * 销售单据地址
    **/
    private Integer sellerBilling;

    /**
    * 销售费用支持方式
    **/
    private Integer sellerPayout;

    /**
    * Facebook账号
    **/
    private String facebook;

    /**
    * 谷歌账号
    **/
    private String google;

    /**
    * 微信账号
    **/
    private String wechat;

    /**
    * 新浪微博账号
    **/
    private String sina;

    /**
    * 密钥
    **/
    private String salt;

    /**
    * 关注商品编号,多个以逗号分开
    **/
    private String commoditySizeFollowing;

    /**
    * 状态:0-未激活;1-已激活;-1-已注销;-2-已冻结
    **/
    private String status;

    /**
    * 用户积分
    **/
    private Integer userExp;

    /**
    * 用户等级
    **/
    private Integer userLevel;

    /**
    * 手表交易费率
    **/
    private Double sellFeeOfWatches;

    /**
    * 手包交易费率
    **/
    private Double sellFeeOfHandbags;

    /**
    * 服装交易费率
    **/
    private Double sellFeeOfSnakers;

    /**
    * Stripe Customer ID
    **/
    private String stripeCustomerId;

    private static final long serialVersionUID = 1L;

    public Integer getAccountCode() {
        return accountCode;
    }

    public BusAccount withAccountCode(Integer accountCode) {
        this.setAccountCode(accountCode);
        return this;
    }

    public void setAccountCode(Integer accountCode) {
        this.accountCode = accountCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public BusAccount withFirstName(String firstName) {
        this.setFirstName(firstName);
        return this;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public String getLastName() {
        return lastName;
    }

    public BusAccount withLastName(String lastName) {
        this.setLastName(lastName);
        return this;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public BusAccount withUserName(String userName) {
        this.setUserName(userName);
        return this;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public BusAccount withEmailAddress(String emailAddress) {
        this.setEmailAddress(emailAddress);
        return this;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress == null ? null : emailAddress.trim();
    }

    public String getPassword() {
        return password;
    }

    public BusAccount withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSelectedCurrency() {
        return selectedCurrency;
    }

    public BusAccount withSelectedCurrency(String selectedCurrency) {
        this.setSelectedCurrency(selectedCurrency);
        return this;
    }

    public void setSelectedCurrency(String selectedCurrency) {
        this.selectedCurrency = selectedCurrency == null ? null : selectedCurrency.trim();
    }

    public String getShoeSize() {
        return shoeSize;
    }

    public BusAccount withShoeSize(String shoeSize) {
        this.setShoeSize(shoeSize);
        return this;
    }

    public void setShoeSize(String shoeSize) {
        this.shoeSize = shoeSize == null ? null : shoeSize.trim();
    }

    public String getVice() {
        return vice;
    }

    public BusAccount withVice(String vice) {
        this.setVice(vice);
        return this;
    }

    public void setVice(String vice) {
        this.vice = vice == null ? null : vice.trim();
    }

    public Integer getFingerPrintLogin() {
        return fingerPrintLogin;
    }

    public BusAccount withFingerPrintLogin(Integer fingerPrintLogin) {
        this.setFingerPrintLogin(fingerPrintLogin);
        return this;
    }

    public void setFingerPrintLogin(Integer fingerPrintLogin) {
        this.fingerPrintLogin = fingerPrintLogin;
    }

    public String getVacationMode() {
        return vacationMode;
    }

    public BusAccount withVacationMode(String vacationMode) {
        this.setVacationMode(vacationMode);
        return this;
    }

    public void setVacationMode(String vacationMode) {
        this.vacationMode = vacationMode == null ? null : vacationMode.trim();
    }

    public Integer getBuyingPayment() {
        return buyingPayment;
    }

    public BusAccount withBuyingPayment(Integer buyingPayment) {
        this.setBuyingPayment(buyingPayment);
        return this;
    }

    public void setBuyingPayment(Integer buyingPayment) {
        this.buyingPayment = buyingPayment;
    }

    public Integer getBuyingBilling() {
        return buyingBilling;
    }

    public BusAccount withBuyingBilling(Integer buyingBilling) {
        this.setBuyingBilling(buyingBilling);
        return this;
    }

    public void setBuyingBilling(Integer buyingBilling) {
        this.buyingBilling = buyingBilling;
    }

    public Integer getBuyingShipping() {
        return buyingShipping;
    }

    public BusAccount withBuyingShipping(Integer buyingShipping) {
        this.setBuyingShipping(buyingShipping);
        return this;
    }

    public void setBuyingShipping(Integer buyingShipping) {
        this.buyingShipping = buyingShipping;
    }

    public Integer getSellerPayment() {
        return sellerPayment;
    }

    public BusAccount withSellerPayment(Integer sellerPayment) {
        this.setSellerPayment(sellerPayment);
        return this;
    }

    public void setSellerPayment(Integer sellerPayment) {
        this.sellerPayment = sellerPayment;
    }

    public Integer getSellerBilling() {
        return sellerBilling;
    }

    public BusAccount withSellerBilling(Integer sellerBilling) {
        this.setSellerBilling(sellerBilling);
        return this;
    }

    public void setSellerBilling(Integer sellerBilling) {
        this.sellerBilling = sellerBilling;
    }

    public Integer getSellerPayout() {
        return sellerPayout;
    }

    public BusAccount withSellerPayout(Integer sellerPayout) {
        this.setSellerPayout(sellerPayout);
        return this;
    }

    public void setSellerPayout(Integer sellerPayout) {
        this.sellerPayout = sellerPayout;
    }

    public String getFacebook() {
        return facebook;
    }

    public BusAccount withFacebook(String facebook) {
        this.setFacebook(facebook);
        return this;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook == null ? null : facebook.trim();
    }

    public String getGoogle() {
        return google;
    }

    public BusAccount withGoogle(String google) {
        this.setGoogle(google);
        return this;
    }

    public void setGoogle(String google) {
        this.google = google == null ? null : google.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public BusAccount withWechat(String wechat) {
        this.setWechat(wechat);
        return this;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getSina() {
        return sina;
    }

    public BusAccount withSina(String sina) {
        this.setSina(sina);
        return this;
    }

    public void setSina(String sina) {
        this.sina = sina == null ? null : sina.trim();
    }

    public String getSalt() {
        return salt;
    }

    public BusAccount withSalt(String salt) {
        this.setSalt(salt);
        return this;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getCommoditySizeFollowing() {
        return commoditySizeFollowing;
    }

    public BusAccount withCommoditySizeFollowing(String commoditySizeFollowing) {
        this.setCommoditySizeFollowing(commoditySizeFollowing);
        return this;
    }

    public void setCommoditySizeFollowing(String commoditySizeFollowing) {
        this.commoditySizeFollowing = commoditySizeFollowing == null ? null : commoditySizeFollowing.trim();
    }

    public String getStatus() {
        return status;
    }

    public BusAccount withStatus(String status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getUserExp() {
        return userExp;
    }

    public BusAccount withUserExp(Integer userExp) {
        this.setUserExp(userExp);
        return this;
    }

    public void setUserExp(Integer userExp) {
        this.userExp = userExp;
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public BusAccount withUserLevel(Integer userLevel) {
        this.setUserLevel(userLevel);
        return this;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public Double getSellFeeOfWatches() {
        return sellFeeOfWatches;
    }

    public BusAccount withSellFeeOfWatches(Double sellFeeOfWatches) {
        this.setSellFeeOfWatches(sellFeeOfWatches);
        return this;
    }

    public void setSellFeeOfWatches(Double sellFeeOfWatches) {
        this.sellFeeOfWatches = sellFeeOfWatches;
    }

    public Double getSellFeeOfHandbags() {
        return sellFeeOfHandbags;
    }

    public BusAccount withSellFeeOfHandbags(Double sellFeeOfHandbags) {
        this.setSellFeeOfHandbags(sellFeeOfHandbags);
        return this;
    }

    public void setSellFeeOfHandbags(Double sellFeeOfHandbags) {
        this.sellFeeOfHandbags = sellFeeOfHandbags;
    }

    public Double getSellFeeOfSnakers() {
        return sellFeeOfSnakers;
    }

    public BusAccount withSellFeeOfSnakers(Double sellFeeOfSnakers) {
        this.setSellFeeOfSnakers(sellFeeOfSnakers);
        return this;
    }

    public void setSellFeeOfSnakers(Double sellFeeOfSnakers) {
        this.sellFeeOfSnakers = sellFeeOfSnakers;
    }

    public String getStripeCustomerId() {
        return stripeCustomerId;
    }

    public BusAccount withStripeCustomerId(String stripeCustomerId) {
        this.setStripeCustomerId(stripeCustomerId);
        return this;
    }

    public void setStripeCustomerId(String stripeCustomerId) {
        this.stripeCustomerId = stripeCustomerId == null ? null : stripeCustomerId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", accountCode=").append(accountCode);
        sb.append(", firstName=").append(firstName);
        sb.append(", lastName=").append(lastName);
        sb.append(", userName=").append(userName);
        sb.append(", emailAddress=").append(emailAddress);
        sb.append(", password=").append(password);
        sb.append(", selectedCurrency=").append(selectedCurrency);
        sb.append(", shoeSize=").append(shoeSize);
        sb.append(", vice=").append(vice);
        sb.append(", fingerPrintLogin=").append(fingerPrintLogin);
        sb.append(", vacationMode=").append(vacationMode);
        sb.append(", buyingPayment=").append(buyingPayment);
        sb.append(", buyingBilling=").append(buyingBilling);
        sb.append(", buyingShipping=").append(buyingShipping);
        sb.append(", sellerPayment=").append(sellerPayment);
        sb.append(", sellerBilling=").append(sellerBilling);
        sb.append(", sellerPayout=").append(sellerPayout);
        sb.append(", facebook=").append(facebook);
        sb.append(", google=").append(google);
        sb.append(", wechat=").append(wechat);
        sb.append(", sina=").append(sina);
        sb.append(", salt=").append(salt);
        sb.append(", commoditySizeFollowing=").append(commoditySizeFollowing);
        sb.append(", status=").append(status);
        sb.append(", userExp=").append(userExp);
        sb.append(", userLevel=").append(userLevel);
        sb.append(", sellFeeOfWatches=").append(sellFeeOfWatches);
        sb.append(", sellFeeOfHandbags=").append(sellFeeOfHandbags);
        sb.append(", sellFeeOfSnakers=").append(sellFeeOfSnakers);
        sb.append(", stripeCustomerId=").append(stripeCustomerId);
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
        BusAccount other = (BusAccount) that;
        return (this.getAccountCode() == null ? other.getAccountCode() == null : this.getAccountCode().equals(other.getAccountCode()))
            && (this.getFirstName() == null ? other.getFirstName() == null : this.getFirstName().equals(other.getFirstName()))
            && (this.getLastName() == null ? other.getLastName() == null : this.getLastName().equals(other.getLastName()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getEmailAddress() == null ? other.getEmailAddress() == null : this.getEmailAddress().equals(other.getEmailAddress()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getSelectedCurrency() == null ? other.getSelectedCurrency() == null : this.getSelectedCurrency().equals(other.getSelectedCurrency()))
            && (this.getShoeSize() == null ? other.getShoeSize() == null : this.getShoeSize().equals(other.getShoeSize()))
            && (this.getVice() == null ? other.getVice() == null : this.getVice().equals(other.getVice()))
            && (this.getFingerPrintLogin() == null ? other.getFingerPrintLogin() == null : this.getFingerPrintLogin().equals(other.getFingerPrintLogin()))
            && (this.getVacationMode() == null ? other.getVacationMode() == null : this.getVacationMode().equals(other.getVacationMode()))
            && (this.getBuyingPayment() == null ? other.getBuyingPayment() == null : this.getBuyingPayment().equals(other.getBuyingPayment()))
            && (this.getBuyingBilling() == null ? other.getBuyingBilling() == null : this.getBuyingBilling().equals(other.getBuyingBilling()))
            && (this.getBuyingShipping() == null ? other.getBuyingShipping() == null : this.getBuyingShipping().equals(other.getBuyingShipping()))
            && (this.getSellerPayment() == null ? other.getSellerPayment() == null : this.getSellerPayment().equals(other.getSellerPayment()))
            && (this.getSellerBilling() == null ? other.getSellerBilling() == null : this.getSellerBilling().equals(other.getSellerBilling()))
            && (this.getSellerPayout() == null ? other.getSellerPayout() == null : this.getSellerPayout().equals(other.getSellerPayout()))
            && (this.getFacebook() == null ? other.getFacebook() == null : this.getFacebook().equals(other.getFacebook()))
            && (this.getGoogle() == null ? other.getGoogle() == null : this.getGoogle().equals(other.getGoogle()))
            && (this.getWechat() == null ? other.getWechat() == null : this.getWechat().equals(other.getWechat()))
            && (this.getSina() == null ? other.getSina() == null : this.getSina().equals(other.getSina()))
            && (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
            && (this.getCommoditySizeFollowing() == null ? other.getCommoditySizeFollowing() == null : this.getCommoditySizeFollowing().equals(other.getCommoditySizeFollowing()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getUserExp() == null ? other.getUserExp() == null : this.getUserExp().equals(other.getUserExp()))
            && (this.getUserLevel() == null ? other.getUserLevel() == null : this.getUserLevel().equals(other.getUserLevel()))
            && (this.getSellFeeOfWatches() == null ? other.getSellFeeOfWatches() == null : this.getSellFeeOfWatches().equals(other.getSellFeeOfWatches()))
            && (this.getSellFeeOfHandbags() == null ? other.getSellFeeOfHandbags() == null : this.getSellFeeOfHandbags().equals(other.getSellFeeOfHandbags()))
            && (this.getSellFeeOfSnakers() == null ? other.getSellFeeOfSnakers() == null : this.getSellFeeOfSnakers().equals(other.getSellFeeOfSnakers()))
            && (this.getStripeCustomerId() == null ? other.getStripeCustomerId() == null : this.getStripeCustomerId().equals(other.getStripeCustomerId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAccountCode() == null) ? 0 : getAccountCode().hashCode());
        result = prime * result + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        result = prime * result + ((getLastName() == null) ? 0 : getLastName().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getSelectedCurrency() == null) ? 0 : getSelectedCurrency().hashCode());
        result = prime * result + ((getShoeSize() == null) ? 0 : getShoeSize().hashCode());
        result = prime * result + ((getVice() == null) ? 0 : getVice().hashCode());
        result = prime * result + ((getFingerPrintLogin() == null) ? 0 : getFingerPrintLogin().hashCode());
        result = prime * result + ((getVacationMode() == null) ? 0 : getVacationMode().hashCode());
        result = prime * result + ((getBuyingPayment() == null) ? 0 : getBuyingPayment().hashCode());
        result = prime * result + ((getBuyingBilling() == null) ? 0 : getBuyingBilling().hashCode());
        result = prime * result + ((getBuyingShipping() == null) ? 0 : getBuyingShipping().hashCode());
        result = prime * result + ((getSellerPayment() == null) ? 0 : getSellerPayment().hashCode());
        result = prime * result + ((getSellerBilling() == null) ? 0 : getSellerBilling().hashCode());
        result = prime * result + ((getSellerPayout() == null) ? 0 : getSellerPayout().hashCode());
        result = prime * result + ((getFacebook() == null) ? 0 : getFacebook().hashCode());
        result = prime * result + ((getGoogle() == null) ? 0 : getGoogle().hashCode());
        result = prime * result + ((getWechat() == null) ? 0 : getWechat().hashCode());
        result = prime * result + ((getSina() == null) ? 0 : getSina().hashCode());
        result = prime * result + ((getSalt() == null) ? 0 : getSalt().hashCode());
        result = prime * result + ((getCommoditySizeFollowing() == null) ? 0 : getCommoditySizeFollowing().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getUserExp() == null) ? 0 : getUserExp().hashCode());
        result = prime * result + ((getUserLevel() == null) ? 0 : getUserLevel().hashCode());
        result = prime * result + ((getSellFeeOfWatches() == null) ? 0 : getSellFeeOfWatches().hashCode());
        result = prime * result + ((getSellFeeOfHandbags() == null) ? 0 : getSellFeeOfHandbags().hashCode());
        result = prime * result + ((getSellFeeOfSnakers() == null) ? 0 : getSellFeeOfSnakers().hashCode());
        result = prime * result + ((getStripeCustomerId() == null) ? 0 : getStripeCustomerId().hashCode());
        return result;
    }
}