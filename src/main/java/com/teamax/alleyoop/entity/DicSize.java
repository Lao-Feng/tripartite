package com.teamax.alleyoop.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class DicSize implements Serializable {
    /**
    * 规格编码
    **/
    private Integer sizeCode;

    /**
    * 规格名称
    **/
    private String sizeName;

    /**
    * 规格序号
    **/
    private Integer sizeIndex;

    /**
    * 商品类型，1：衣服，2：鞋子
    **/
    private String commondityType;

    /**
     *
     **/
    private boolean checked;

    private static final long serialVersionUID = 1L;

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public Integer getSizeCode() {
        return sizeCode;
    }

    public DicSize withSizeCode(Integer sizeCode) {
        this.setSizeCode(sizeCode);
        return this;
    }

    public void setSizeCode(Integer sizeCode) {
        this.sizeCode = sizeCode;
    }

    public String getSizeName() {
        return sizeName;
    }

    public DicSize withSizeName(String sizeName) {
        this.setSizeName(sizeName);
        return this;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName == null ? null : sizeName.trim();
    }

    public Integer getSizeIndex() {
        return sizeIndex;
    }

    public DicSize withSizeIndex(Integer sizeIndex) {
        this.setSizeIndex(sizeIndex);
        return this;
    }

    public void setSizeIndex(Integer sizeIndex) {
        this.sizeIndex = sizeIndex;
    }

    public String getCommondityType() {
        return commondityType;
    }

    public DicSize withCommondityType(String commondityType) {
        this.setCommondityType(commondityType);
        return this;
    }

    public void setCommondityType(String commondityType) {
        this.commondityType = commondityType == null ? null : commondityType.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sizeCode=").append(sizeCode);
        sb.append(", sizeName=").append(sizeName);
        sb.append(", sizeIndex=").append(sizeIndex);
        sb.append(", commondityType=").append(commondityType);
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
        DicSize other = (DicSize) that;
        return (this.getSizeCode() == null ? other.getSizeCode() == null : this.getSizeCode().equals(other.getSizeCode()))
            && (this.getSizeName() == null ? other.getSizeName() == null : this.getSizeName().equals(other.getSizeName()))
            && (this.getSizeIndex() == null ? other.getSizeIndex() == null : this.getSizeIndex().equals(other.getSizeIndex()))
            && (this.getCommondityType() == null ? other.getCommondityType() == null : this.getCommondityType().equals(other.getCommondityType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSizeCode() == null) ? 0 : getSizeCode().hashCode());
        result = prime * result + ((getSizeName() == null) ? 0 : getSizeName().hashCode());
        result = prime * result + ((getSizeIndex() == null) ? 0 : getSizeIndex().hashCode());
        result = prime * result + ((getCommondityType() == null) ? 0 : getCommondityType().hashCode());
        return result;
    }
}