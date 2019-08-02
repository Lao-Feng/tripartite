package com.teamax.alleyoop.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;
import java.util.Date;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
@ApiModel(value="商品尺寸模型")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusCommonditySize implements Serializable {
    /**
    * 规格编码
    **/
    private Integer sizeCode;

    /**
    * 规格名称
    **/
    private String sizeName;

    /**
    * 尺寸类型：man womon child
    **/
    private String sizeType;

    /**
    * 商品编码
    **/
    private Integer commondityCode;
    private BusCommondity commodity;
    /**
    * 最低要价
    **/
    private Double lowestAsk;

    /**
    * 最高出价
    **/
    private Double highestBid;

    /**
    * 最近售价
    **/
    private Double lastSale;

    /**
    * 最近售价时间
    **/
    private Date lastSaleTime;

    /**
    * 最近成交订单号
    **/
    private Integer lastOrderCode;

    private static final long serialVersionUID = 1L;

    public BusCommondity getCommodity() {
        return commodity;
    }

    public void setCommodity(BusCommondity commodity) {
        this.commodity = commodity;
    }

    public Integer getSizeCode() {
        return sizeCode;
    }

    public BusCommonditySize withSizeCode(Integer sizeCode) {
        this.setSizeCode(sizeCode);
        return this;
    }

    public void setSizeCode(Integer sizeCode) {
        this.sizeCode = sizeCode;
    }

    public String getSizeName() {
        return sizeName;
    }

    public BusCommonditySize withSizeName(String sizeName) {
        this.setSizeName(sizeName);
        return this;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName == null ? null : sizeName.trim();
    }

    public String getSizeType() {
        return sizeType;
    }

    public BusCommonditySize withSizeType(String sizeType) {
        this.setSizeType(sizeType);
        return this;
    }

    public void setSizeType(String sizeType) {
        this.sizeType = sizeType == null ? null : sizeType.trim();
    }

    public Integer getCommondityCode() {
        return commondityCode;
    }

    public BusCommonditySize withCommondityCode(Integer commondityCode) {
        this.setCommondityCode(commondityCode);
        return this;
    }

    public void setCommondityCode(Integer commondityCode) {
        this.commondityCode = commondityCode;
    }

    public Double getLowestAsk() {
        return lowestAsk;
    }

    public BusCommonditySize withLowestAsk(Double lowestAsk) {
        this.setLowestAsk(lowestAsk);
        return this;
    }

    public void setLowestAsk(Double lowestAsk) {
        this.lowestAsk = lowestAsk;
    }

    public Double getHighestBid() {
        return highestBid;
    }

    public BusCommonditySize withHighestBid(Double highestBid) {
        this.setHighestBid(highestBid);
        return this;
    }

    public void setHighestBid(Double highestBid) {
        this.highestBid = highestBid;
    }

    public Double getLastSale() {
        return lastSale;
    }

    public BusCommonditySize withLastSale(Double lastSale) {
        this.setLastSale(lastSale);
        return this;
    }

    public void setLastSale(Double lastSale) {
        this.lastSale = lastSale;
    }

    public Date getLastSaleTime() {
        return lastSaleTime;
    }

    public BusCommonditySize withLastSaleTime(Date lastSaleTime) {
        this.setLastSaleTime(lastSaleTime);
        return this;
    }

    public void setLastSaleTime(Date lastSaleTime) {
        this.lastSaleTime = lastSaleTime;
    }

    public Integer getLastOrderCode() {
        return lastOrderCode;
    }

    public BusCommonditySize withLastOrderCode(Integer lastOrderCode) {
        this.setLastOrderCode(lastOrderCode);
        return this;
    }

    public void setLastOrderCode(Integer lastOrderCode) {
        this.lastOrderCode = lastOrderCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sizeCode=").append(sizeCode);
        sb.append(", sizeName=").append(sizeName);
        sb.append(", sizeType=").append(sizeType);
        sb.append(", commondityCode=").append(commondityCode);
        sb.append(", lowestAsk=").append(lowestAsk);
        sb.append(", highestBid=").append(highestBid);
        sb.append(", lastSale=").append(lastSale);
        sb.append(", lastSaleTime=").append(lastSaleTime);
        sb.append(", lastOrderCode=").append(lastOrderCode);
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
        BusCommonditySize other = (BusCommonditySize) that;
        return (this.getSizeCode() == null ? other.getSizeCode() == null : this.getSizeCode().equals(other.getSizeCode()))
            && (this.getSizeName() == null ? other.getSizeName() == null : this.getSizeName().equals(other.getSizeName()))
            && (this.getSizeType() == null ? other.getSizeType() == null : this.getSizeType().equals(other.getSizeType()))
            && (this.getCommondityCode() == null ? other.getCommondityCode() == null : this.getCommondityCode().equals(other.getCommondityCode()))
            && (this.getLowestAsk() == null ? other.getLowestAsk() == null : this.getLowestAsk().equals(other.getLowestAsk()))
            && (this.getHighestBid() == null ? other.getHighestBid() == null : this.getHighestBid().equals(other.getHighestBid()))
            && (this.getLastSale() == null ? other.getLastSale() == null : this.getLastSale().equals(other.getLastSale()))
            && (this.getLastSaleTime() == null ? other.getLastSaleTime() == null : this.getLastSaleTime().equals(other.getLastSaleTime()))
            && (this.getLastOrderCode() == null ? other.getLastOrderCode() == null : this.getLastOrderCode().equals(other.getLastOrderCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSizeCode() == null) ? 0 : getSizeCode().hashCode());
        result = prime * result + ((getSizeName() == null) ? 0 : getSizeName().hashCode());
        result = prime * result + ((getSizeType() == null) ? 0 : getSizeType().hashCode());
        result = prime * result + ((getCommondityCode() == null) ? 0 : getCommondityCode().hashCode());
        result = prime * result + ((getLowestAsk() == null) ? 0 : getLowestAsk().hashCode());
        result = prime * result + ((getHighestBid() == null) ? 0 : getHighestBid().hashCode());
        result = prime * result + ((getLastSale() == null) ? 0 : getLastSale().hashCode());
        result = prime * result + ((getLastSaleTime() == null) ? 0 : getLastSaleTime().hashCode());
        result = prime * result + ((getLastOrderCode() == null) ? 0 : getLastOrderCode().hashCode());
        return result;
    }
}