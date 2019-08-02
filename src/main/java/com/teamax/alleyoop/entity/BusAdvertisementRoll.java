package com.teamax.alleyoop.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class BusAdvertisementRoll implements Serializable {
    /**
    * 广告代码
    **/
    private Integer ADCode;

    /**
    * 商品编码
    **/
    private Integer commondityCode;
    private BusCommondity commodity;

    /**
    * 商品名称
    **/
    private String commondityName;

    /**
    * 开始日期
    **/
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")//出参格式
    private Date startDate;

    /**
    * 有效期
    **/
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")//出参格式
    private Date expiryDate;

    /**
    * 排序编号
    **/
    private Integer sortIndex;

    /**
    * 状态，1-正常，2-停止
    **/
    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getADCode() {
        return ADCode;
    }

    public BusAdvertisementRoll withADCode(Integer ADCode) {
        this.setADCode(ADCode);
        return this;
    }

    public void setADCode(Integer ADCode) {
        this.ADCode = ADCode;
    }

    public Integer getCommondityCode() {
        return commondityCode;
    }

    public BusAdvertisementRoll withCommondityCode(Integer commondityCode) {
        this.setCommondityCode(commondityCode);
        return this;
    }

    public BusCommondity getCommodity() {
        return commodity;
    }

    public void setCommodity(BusCommondity commodity) {
        this.commodity = commodity;
    }

    public void setCommondityCode(Integer commondityCode) {
        this.commondityCode = commondityCode;
    }

    public String getCommondityName() {
        return commondityName;
    }

    public BusAdvertisementRoll withCommondityName(String commondityName) {
        this.setCommondityName(commondityName);
        return this;
    }

    public void setCommondityName(String commondityName) {
        this.commondityName = commondityName == null ? null : commondityName.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public BusAdvertisementRoll withStartDate(Date startDate) {
        this.setStartDate(startDate);
        return this;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public BusAdvertisementRoll withExpiryDate(Date expiryDate) {
        this.setExpiryDate(expiryDate);
        return this;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Integer getSortIndex() {
        return sortIndex;
    }

    public BusAdvertisementRoll withSortIndex(Integer sortIndex) {
        this.setSortIndex(sortIndex);
        return this;
    }

    public void setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
    }

    public Integer getStatus() {
        return status;
    }

    public BusAdvertisementRoll withStatus(Integer status) {
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
        sb.append(", ADCode=").append(ADCode);
        sb.append(", commondityCode=").append(commondityCode);
        sb.append(", commondityName=").append(commondityName);
        sb.append(", startDate=").append(startDate);
        sb.append(", expiryDate=").append(expiryDate);
        sb.append(", sortIndex=").append(sortIndex);
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
        BusAdvertisementRoll other = (BusAdvertisementRoll) that;
        return (this.getADCode() == null ? other.getADCode() == null : this.getADCode().equals(other.getADCode()))
            && (this.getCommondityCode() == null ? other.getCommondityCode() == null : this.getCommondityCode().equals(other.getCommondityCode()))
            && (this.getCommondityName() == null ? other.getCommondityName() == null : this.getCommondityName().equals(other.getCommondityName()))
            && (this.getStartDate() == null ? other.getStartDate() == null : this.getStartDate().equals(other.getStartDate()))
            && (this.getExpiryDate() == null ? other.getExpiryDate() == null : this.getExpiryDate().equals(other.getExpiryDate()))
            && (this.getSortIndex() == null ? other.getSortIndex() == null : this.getSortIndex().equals(other.getSortIndex()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getADCode() == null) ? 0 : getADCode().hashCode());
        result = prime * result + ((getCommondityCode() == null) ? 0 : getCommondityCode().hashCode());
        result = prime * result + ((getCommondityName() == null) ? 0 : getCommondityName().hashCode());
        result = prime * result + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        result = prime * result + ((getExpiryDate() == null) ? 0 : getExpiryDate().hashCode());
        result = prime * result + ((getSortIndex() == null) ? 0 : getSortIndex().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}