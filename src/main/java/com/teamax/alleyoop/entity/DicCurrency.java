package com.teamax.alleyoop.entity;

import java.io.Serializable;

/**
 * dic_currency
 * @author 
 */
public class DicCurrency implements Serializable {
    /**
     * 编码
     */
    private Integer code;

    /**
     * 本币
     */
    private String localcurrency;

    /**
     * 外币
     */
    private String foreigncurrency;

    private Double exchangerate;

    private static final long serialVersionUID = 1L;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getLocalcurrency() {
        return localcurrency;
    }

    public void setLocalcurrency(String localcurrency) {
        this.localcurrency = localcurrency;
    }

    public String getForeigncurrency() {
        return foreigncurrency;
    }

    public void setForeigncurrency(String foreigncurrency) {
        this.foreigncurrency = foreigncurrency;
    }

    public Double getExchangerate() {
        return exchangerate;
    }

    public void setExchangerate(Double exchangerate) {
        this.exchangerate = exchangerate;
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
        DicCurrency other = (DicCurrency) that;
        return (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getLocalcurrency() == null ? other.getLocalcurrency() == null : this.getLocalcurrency().equals(other.getLocalcurrency()))
            && (this.getForeigncurrency() == null ? other.getForeigncurrency() == null : this.getForeigncurrency().equals(other.getForeigncurrency()))
            && (this.getExchangerate() == null ? other.getExchangerate() == null : this.getExchangerate().equals(other.getExchangerate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getLocalcurrency() == null) ? 0 : getLocalcurrency().hashCode());
        result = prime * result + ((getForeigncurrency() == null) ? 0 : getForeigncurrency().hashCode());
        result = prime * result + ((getExchangerate() == null) ? 0 : getExchangerate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", code=").append(code);
        sb.append(", localcurrency=").append(localcurrency);
        sb.append(", foreigncurrency=").append(foreigncurrency);
        sb.append(", exchangerate=").append(exchangerate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}