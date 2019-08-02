package com.teamax.alleyoop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * bus_discount
 * @author 
 */
public class BusDiscount implements Serializable {
    /**
     * '优惠券编号'
     */
    private String code;

    /**
     * 优惠券金额
     */
    private Integer amount;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 创建人
     */
    private Integer createuserid;

    /**
     * 是否已使用
     */
    private Integer isused;

    /**
     * 使用时间
     */
    private Date usetime;

    /**
     * 使用用户账号
     */
    private Integer accountcode;

    /**
     * 限制使用品牌
     */
    private String brandcodes;

    private static final long serialVersionUID = 1L;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(Integer createuserid) {
        this.createuserid = createuserid;
    }

    public Integer getIsused() {
        return isused;
    }

    public void setIsused(Integer isused) {
        this.isused = isused;
    }

    public Date getUsetime() {
        return usetime;
    }

    public void setUsetime(Date usetime) {
        this.usetime = usetime;
    }

    public Integer getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(Integer accountcode) {
        this.accountcode = accountcode;
    }

    public String getBrandcodes() {
        return brandcodes;
    }

    public void setBrandcodes(String brandcodes) {
        this.brandcodes = brandcodes;
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
        BusDiscount other = (BusDiscount) that;
        return (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getCreateuserid() == null ? other.getCreateuserid() == null : this.getCreateuserid().equals(other.getCreateuserid()))
            && (this.getIsused() == null ? other.getIsused() == null : this.getIsused().equals(other.getIsused()))
            && (this.getUsetime() == null ? other.getUsetime() == null : this.getUsetime().equals(other.getUsetime()))
            && (this.getAccountcode() == null ? other.getAccountcode() == null : this.getAccountcode().equals(other.getAccountcode()))
            && (this.getBrandcodes() == null ? other.getBrandcodes() == null : this.getBrandcodes().equals(other.getBrandcodes()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getCreateuserid() == null) ? 0 : getCreateuserid().hashCode());
        result = prime * result + ((getIsused() == null) ? 0 : getIsused().hashCode());
        result = prime * result + ((getUsetime() == null) ? 0 : getUsetime().hashCode());
        result = prime * result + ((getAccountcode() == null) ? 0 : getAccountcode().hashCode());
        result = prime * result + ((getBrandcodes() == null) ? 0 : getBrandcodes().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", code=").append(code);
        sb.append(", amount=").append(amount);
        sb.append(", createtime=").append(createtime);
        sb.append(", createuserid=").append(createuserid);
        sb.append(", isused=").append(isused);
        sb.append(", usetime=").append(usetime);
        sb.append(", accountcode=").append(accountcode);
        sb.append(", brandcodes=").append(brandcodes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}