package com.teamax.alleyoop.entity;

import java.io.Serializable;

/**
 * dic_item
 * @author 
 */
public class DicItem implements Serializable {
    /**
     * 项目编码
     */
    private Integer itemcode;

    /**
     * 项目名称
     */
    private String itemname;

    /**
     * 序号
     */
    private Integer itemindex;

    /**
     * 项目类型
     */
    private String itemtype;

    /**
     * 商品类型
     */
    private Integer categorycode;
    /**
     * 表达式
     */
    private String expression;

    private static final long serialVersionUID = 1L;

    public Integer getItemcode() {
        return itemcode;
    }

    public void setItemcode(Integer itemcode) {
        this.itemcode = itemcode;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public Integer getItemindex() {
        return itemindex;
    }

    public void setItemindex(Integer itemindex) {
        this.itemindex = itemindex;
    }

    public String getItemtype() {
        return itemtype;
    }

    public void setItemtype(String itemtype) {
        this.itemtype = itemtype;
    }

    public Integer getCategorycode() {
        return categorycode;
    }

    public void setCategorycode(Integer categorycode) {
        this.categorycode = categorycode;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
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
        DicItem other = (DicItem) that;
        return (this.getItemcode() == null ? other.getItemcode() == null : this.getItemcode().equals(other.getItemcode()))
            && (this.getItemname() == null ? other.getItemname() == null : this.getItemname().equals(other.getItemname()))
            && (this.getItemindex() == null ? other.getItemindex() == null : this.getItemindex().equals(other.getItemindex()))
            && (this.getItemtype() == null ? other.getItemtype() == null : this.getItemtype().equals(other.getItemtype()))
            && (this.getCategorycode() == null ? other.getCategorycode() == null : this.getCategorycode().equals(other.getCategorycode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getItemcode() == null) ? 0 : getItemcode().hashCode());
        result = prime * result + ((getItemname() == null) ? 0 : getItemname().hashCode());
        result = prime * result + ((getItemindex() == null) ? 0 : getItemindex().hashCode());
        result = prime * result + ((getItemtype() == null) ? 0 : getItemtype().hashCode());
        result = prime * result + ((getCategorycode() == null) ? 0 : getCategorycode().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", itemcode=").append(itemcode);
        sb.append(", itemname=").append(itemname);
        sb.append(", itemindex=").append(itemindex);
        sb.append(", itemtype=").append(itemtype);
        sb.append(", categorycode=").append(categorycode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}