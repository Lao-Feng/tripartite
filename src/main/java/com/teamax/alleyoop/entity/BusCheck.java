package com.teamax.alleyoop.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class BusCheck implements Serializable {
    /**
    * 验货编码
    **/
    private Integer checkCode;

    /**
     * 商品编号
     */
    private Integer commodityCode;

    /**
    * 订单编码
    **/
    private Integer orderCode;

    /**
    * 验货人
    **/
    private String checkMan;

    /**
    * 验货时间
    **/
    private Date checkTime;

    /**
    * 验货结果，-1未通过，1通过
    **/
    private Integer checkResult;

    /**
    * 验货备注
    **/
    private String remark;

    /**
    * 验货图片路径，多个以分号;分开
    **/
    private String pictures;
    private String[] picArray;
    @ApiModelProperty(value="图片路径数组")
    private String[] picUrlArray;

    private static final long serialVersionUID = 1L;

    public Integer getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(Integer commodityCode) {
        this.commodityCode = commodityCode;
    }

    public String[] getPicArray() {
        return picArray;
    }

    public void setPicArray(String[] picArray) {
        this.picArray = picArray;
    }

    public String[] getPicUrlArray() {
        return picUrlArray;
    }

    public void setPicUrlArray(String[] picUrlArray) {
        this.picUrlArray = picUrlArray;
    }

    public Integer getCheckCode() {
        return checkCode;
    }

    public BusCheck withCheckCode(Integer checkCode) {
        this.setCheckCode(checkCode);
        return this;
    }

    public void setCheckCode(Integer checkCode) {
        this.checkCode = checkCode;
    }

    public Integer getOrderCode() {
        return orderCode;
    }

    public BusCheck withOrderCode(Integer orderCode) {
        this.setOrderCode(orderCode);
        return this;
    }

    public void setOrderCode(Integer orderCode) {
        this.orderCode = orderCode;
    }

    public String getCheckMan() {
        return checkMan;
    }

    public BusCheck withCheckMan(String checkMan) {
        this.setCheckMan(checkMan);
        return this;
    }

    public void setCheckMan(String checkMan) {
        this.checkMan = checkMan == null ? null : checkMan.trim();
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public BusCheck withCheckTime(Date checkTime) {
        this.setCheckTime(checkTime);
        return this;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public Integer getCheckResult() {
        return checkResult;
    }

    public BusCheck withCheckResult(Integer checkResult) {
        this.setCheckResult(checkResult);
        return this;
    }

    public void setCheckResult(Integer checkResult) {
        this.checkResult = checkResult;
    }

    public String getRemark() {
        return remark;
    }

    public BusCheck withRemark(String remark) {
        this.setRemark(remark);
        return this;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getPictures() {
        return pictures;
    }

    public BusCheck withPictures(String pictures) {
        this.setPictures(pictures);
        return this;
    }

    public void setPictures(String pictures) {
        this.picArray = pictures.split(";");
        this.pictures = pictures == null ? null : pictures.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", checkCode=").append(checkCode);
        sb.append(", orderCode=").append(orderCode);
        sb.append(", checkMan=").append(checkMan);
        sb.append(", checkTime=").append(checkTime);
        sb.append(", checkResult=").append(checkResult);
        sb.append(", remark=").append(remark);
        sb.append(", pictures=").append(pictures);
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
        BusCheck other = (BusCheck) that;
        return (this.getCheckCode() == null ? other.getCheckCode() == null : this.getCheckCode().equals(other.getCheckCode()))
            && (this.getOrderCode() == null ? other.getOrderCode() == null : this.getOrderCode().equals(other.getOrderCode()))
            && (this.getCheckMan() == null ? other.getCheckMan() == null : this.getCheckMan().equals(other.getCheckMan()))
            && (this.getCheckTime() == null ? other.getCheckTime() == null : this.getCheckTime().equals(other.getCheckTime()))
            && (this.getCheckResult() == null ? other.getCheckResult() == null : this.getCheckResult().equals(other.getCheckResult()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getPictures() == null ? other.getPictures() == null : this.getPictures().equals(other.getPictures()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCheckCode() == null) ? 0 : getCheckCode().hashCode());
        result = prime * result + ((getOrderCode() == null) ? 0 : getOrderCode().hashCode());
        result = prime * result + ((getCheckMan() == null) ? 0 : getCheckMan().hashCode());
        result = prime * result + ((getCheckTime() == null) ? 0 : getCheckTime().hashCode());
        result = prime * result + ((getCheckResult() == null) ? 0 : getCheckResult().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getPictures() == null) ? 0 : getPictures().hashCode());
        return result;
    }
}