package com.teamax.alleyoop.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class RelAccountCommodityFollowing implements Serializable {
    private Integer id;

    /**
    * 账号
    **/
    private Integer accountCode;
    private BusAccount account;

    /**
    * 规格编码
    **/
    private Integer sizeCode;
    private BusCommonditySize commoditySize;

    private static final long serialVersionUID = 1L;

    public BusAccount getAccount() {
        return account;
    }

    public void setAccount(BusAccount account) {
        this.account = account;
    }

    public BusCommonditySize getCommoditySize() {
        return commoditySize;
    }

    public void setCommoditySize(BusCommonditySize commoditySize) {
        this.commoditySize = commoditySize;
    }

    public Integer getId() {
        return id;
    }

    public RelAccountCommodityFollowing withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccountCode() {
        return accountCode;
    }

    public RelAccountCommodityFollowing withAccountCode(Integer accountCode) {
        this.setAccountCode(accountCode);
        return this;
    }

    public void setAccountCode(Integer accountCode) {
        this.accountCode = accountCode;
    }

    public Integer getSizeCode() {
        return sizeCode;
    }

    public RelAccountCommodityFollowing withSizeCode(Integer sizeCode) {
        this.setSizeCode(sizeCode);
        return this;
    }

    public void setSizeCode(Integer sizeCode) {
        this.sizeCode = sizeCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", accountCode=").append(accountCode);
        sb.append(", sizeCode=").append(sizeCode);
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
        RelAccountCommodityFollowing other = (RelAccountCommodityFollowing) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccountCode() == null ? other.getAccountCode() == null : this.getAccountCode().equals(other.getAccountCode()))
            && (this.getSizeCode() == null ? other.getSizeCode() == null : this.getSizeCode().equals(other.getSizeCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccountCode() == null) ? 0 : getAccountCode().hashCode());
        result = prime * result + ((getSizeCode() == null) ? 0 : getSizeCode().hashCode());
        return result;
    }
}