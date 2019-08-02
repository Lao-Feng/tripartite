package com.teamax.alleyoop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class BusSearchHistory implements Serializable {
    /**
    * 检索编码
    **/
    private Integer searchCode;

    /**
    * 账户编码
    **/
    private Integer accountCode;

    /**
    * 检索内容
    **/
    private String searchContent;

    /**
    * 检索时间
    **/
    private Date searchDate;

    private static final long serialVersionUID = 1L;

    public Integer getSearchCode() {
        return searchCode;
    }

    public BusSearchHistory withSearchCode(Integer searchCode) {
        this.setSearchCode(searchCode);
        return this;
    }

    public void setSearchCode(Integer searchCode) {
        this.searchCode = searchCode;
    }

    public Integer getAccountCode() {
        return accountCode;
    }

    public BusSearchHistory withAccountCode(Integer accountCode) {
        this.setAccountCode(accountCode);
        return this;
    }

    public void setAccountCode(Integer accountCode) {
        this.accountCode = accountCode;
    }

    public String getSearchContent() {
        return searchContent;
    }

    public BusSearchHistory withSearchContent(String searchContent) {
        this.setSearchContent(searchContent);
        return this;
    }

    public void setSearchContent(String searchContent) {
        this.searchContent = searchContent == null ? null : searchContent.trim();
    }

    public Date getSearchDate() {
        return searchDate;
    }

    public BusSearchHistory withSearchDate(Date searchDate) {
        this.setSearchDate(searchDate);
        return this;
    }

    public void setSearchDate(Date searchDate) {
        this.searchDate = searchDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", searchCode=").append(searchCode);
        sb.append(", accountCode=").append(accountCode);
        sb.append(", searchContent=").append(searchContent);
        sb.append(", searchDate=").append(searchDate);
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
        BusSearchHistory other = (BusSearchHistory) that;
        return (this.getSearchCode() == null ? other.getSearchCode() == null : this.getSearchCode().equals(other.getSearchCode()))
            && (this.getAccountCode() == null ? other.getAccountCode() == null : this.getAccountCode().equals(other.getAccountCode()))
            && (this.getSearchContent() == null ? other.getSearchContent() == null : this.getSearchContent().equals(other.getSearchContent()))
            && (this.getSearchDate() == null ? other.getSearchDate() == null : this.getSearchDate().equals(other.getSearchDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSearchCode() == null) ? 0 : getSearchCode().hashCode());
        result = prime * result + ((getAccountCode() == null) ? 0 : getAccountCode().hashCode());
        result = prime * result + ((getSearchContent() == null) ? 0 : getSearchContent().hashCode());
        result = prime * result + ((getSearchDate() == null) ? 0 : getSearchDate().hashCode());
        return result;
    }
}