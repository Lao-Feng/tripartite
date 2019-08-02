package com.teamax.alleyoop.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class DicBrand implements Serializable {

    private static final long serialVersionUID = 1L;

    public String http;
    /**
    * 品牌编码
    **/
    @ApiModelProperty(value="品牌编码")
    private Integer brandCode;

    /**
    * 品牌名称
    **/
    @ApiModelProperty(value="品牌名称")
    private String brandName;

    /**
    * 类别编码
    **/
    private Integer categoryCode;
    private DicCategory category;

    /**
     * 品牌图片
     **/
    private String picture01;
    private String[] picArray;
    @ApiModelProperty(value="图片路径数组")
    private String[] picUrlArray;

    /**
     * 销售量
     **/
    @ApiModelProperty(value="销售量")
    private Integer sales;

    public String getHttp() {
        return http;
    }

    public void setHttp(String http) {
        this.http = http;
        if(this.picture01!=null&&!"".equals(this.picture01)){
            this.picUrlArray = this.picture01.split(";");
            for(int i=0;i<this.picUrlArray.length;i++){
                this.picUrlArray[i] = this.http + this.picUrlArray[i];
            }
        }
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

    public Integer getBrandCode() {
        return brandCode;
    }

    public DicBrand withBrandCode(Integer brandCode) {
        this.setBrandCode(brandCode);
        return this;
    }

    public void setBrandCode(Integer brandCode) {
        this.brandCode = brandCode;
    }

    public String getBrandName() {
        return brandName;
    }

    public DicBrand withBrandName(String brandName) {
        this.setBrandName(brandName);
        return this;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public Integer getCategoryCode() {
        return categoryCode;
    }

    public DicBrand withCategoryCode(Integer categoryCode) {
        this.setCategoryCode(categoryCode);
        return this;
    }

    public void setCategoryCode(Integer categoryCode) {
        this.categoryCode = categoryCode;
    }

    public DicCategory getCategory() {
        return category;
    }

    public void setCategory(DicCategory category) {
        this.category = category;
    }

    public String getPicture01() {
        return picture01;
    }

    public void setPicture01(String picture01) {
        this.picArray = picture01.split(";");
        this.picture01 = picture01;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", brandCode=").append(brandCode);
        sb.append(", brandName=").append(brandName);
        sb.append(", categoryCode=").append(categoryCode);
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
        DicBrand other = (DicBrand) that;
        return (this.getBrandCode() == null ? other.getBrandCode() == null : this.getBrandCode().equals(other.getBrandCode()))
            && (this.getBrandName() == null ? other.getBrandName() == null : this.getBrandName().equals(other.getBrandName()))
            && (this.getCategoryCode() == null ? other.getCategoryCode() == null : this.getCategoryCode().equals(other.getCategoryCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBrandCode() == null) ? 0 : getBrandCode().hashCode());
        result = prime * result + ((getBrandName() == null) ? 0 : getBrandName().hashCode());
        result = prime * result + ((getCategoryCode() == null) ? 0 : getCategoryCode().hashCode());
        return result;
    }
}