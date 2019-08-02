package com.teamax.alleyoop.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class ToolNextNum implements Serializable {
    private String name;

    private Integer value;

    private Integer next;

    private String tips;

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public ToolNextNum withName(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getValue() {
        return value;
    }

    public ToolNextNum withValue(Integer value) {
        this.setValue(value);
        return this;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getNext() {
        return next;
    }

    public ToolNextNum withNext(Integer next) {
        this.setNext(next);
        return this;
    }

    public void setNext(Integer next) {
        this.next = next;
    }

    public String getTips() {
        return tips;
    }

    public ToolNextNum withTips(String tips) {
        this.setTips(tips);
        return this;
    }

    public void setTips(String tips) {
        this.tips = tips == null ? null : tips.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", value=").append(value);
        sb.append(", next=").append(next);
        sb.append(", tips=").append(tips);
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
        ToolNextNum other = (ToolNextNum) that;
        return (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()))
            && (this.getNext() == null ? other.getNext() == null : this.getNext().equals(other.getNext()))
            && (this.getTips() == null ? other.getTips() == null : this.getTips().equals(other.getTips()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        result = prime * result + ((getNext() == null) ? 0 : getNext().hashCode());
        result = prime * result + ((getTips() == null) ? 0 : getTips().hashCode());
        return result;
    }
}