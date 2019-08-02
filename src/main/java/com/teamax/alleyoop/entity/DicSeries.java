package com.teamax.alleyoop.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class DicSeries implements Serializable {
    /**
    * 品牌系列编码
    **/
    private Integer seriesCode;

    /**
    * 品牌系列名称
    **/
    private String seriesName;

    /**
    * 品牌编码
    **/
    private Integer brandCode;

    private static final long serialVersionUID = 1L;

    public Integer getSeriesCode() {
        return seriesCode;
    }

    public DicSeries withSeriesCode(Integer seriesCode) {
        this.setSeriesCode(seriesCode);
        return this;
    }

    public void setSeriesCode(Integer seriesCode) {
        this.seriesCode = seriesCode;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public DicSeries withSeriesName(String seriesName) {
        this.setSeriesName(seriesName);
        return this;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName == null ? null : seriesName.trim();
    }

    public Integer getBrandCode() {
        return brandCode;
    }

    public DicSeries withBrandCode(Integer brandCode) {
        this.setBrandCode(brandCode);
        return this;
    }

    public void setBrandCode(Integer brandCode) {
        this.brandCode = brandCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seriesCode=").append(seriesCode);
        sb.append(", seriesName=").append(seriesName);
        sb.append(", brandCode=").append(brandCode);
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
        DicSeries other = (DicSeries) that;
        return (this.getSeriesCode() == null ? other.getSeriesCode() == null : this.getSeriesCode().equals(other.getSeriesCode()))
            && (this.getSeriesName() == null ? other.getSeriesName() == null : this.getSeriesName().equals(other.getSeriesName()))
            && (this.getBrandCode() == null ? other.getBrandCode() == null : this.getBrandCode().equals(other.getBrandCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSeriesCode() == null) ? 0 : getSeriesCode().hashCode());
        result = prime * result + ((getSeriesName() == null) ? 0 : getSeriesName().hashCode());
        result = prime * result + ((getBrandCode() == null) ? 0 : getBrandCode().hashCode());
        return result;
    }
}