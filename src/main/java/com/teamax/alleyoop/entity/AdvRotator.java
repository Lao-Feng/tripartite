package com.teamax.alleyoop.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
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
public class AdvRotator implements Serializable {
    public String http;

    private Integer id;

    /**
    * 广告类型:commodity-商品；news-新闻；charity-慈善；
    **/
    private String type;

    /**
    * 图片地址
    **/
    private String picture;
    private String[] picArray;
    private String[] picUrlArray;

    /**
    * 跳转链接
    **/
    private String url;

    /**
    * 有效日期
    **/
    @DateTimeFormat(pattern = "yyyy-MM-dd") //入参格式化
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")//出参格式
    private Date validDate;

    /**
    * 状态:0-无效(首页不展示);1-有效(首页展示);
    **/
    private Integer status;

    /**
    * 订阅者
    **/
    private String subscriber;

    /**
    * 联系电话
    **/
    private String contactNumber;

    /**
    * 修改时间
    **/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modifyTime;

    private static final long serialVersionUID = 1L;

    public String getHttp() {
        return http;
    }

    public void setHttp(String http) {
        this.http = http;
        if(this.picture!=null&&!"".equals(this.picture)){
            this.picUrlArray = this.picture.split(";");
            for(int i=0;i<this.picUrlArray.length;i++){
                this.picUrlArray[i] = this.http + this.picUrlArray[i];
            }
        }
    }

    public Integer getId() {
        return id;
    }

    public AdvRotator withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public AdvRotator withType(String type) {
        this.setType(type);
        return this;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getPicture() {
        return picture;
    }

    public AdvRotator withPicture(String picture) {
        this.setPicture(picture);
        return this;
    }

    public void setPicture(String picture) {
        this.picArray = picture.split(";");
        this.picture = picture == null ? null : picture.trim();
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
    public String getUrl() {
        return url;
    }

    public AdvRotator withUrl(String url) {
        this.setUrl(url);
        return this;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Date getValidDate() {
        return validDate;
    }

    public AdvRotator withValidDate(Date validDate) {
        this.setValidDate(validDate);
        return this;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public Integer getStatus() {
        return status;
    }

    public AdvRotator withStatus(Integer status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSubscriber() {
        return subscriber;
    }

    public AdvRotator withSubscriber(String subscriber) {
        this.setSubscriber(subscriber);
        return this;
    }

    public void setSubscriber(String subscriber) {
        this.subscriber = subscriber == null ? null : subscriber.trim();
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public AdvRotator withContactNumber(String contactNumber) {
        this.setContactNumber(contactNumber);
        return this;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber == null ? null : contactNumber.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public AdvRotator withModifyTime(Date modifyTime) {
        this.setModifyTime(modifyTime);
        return this;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", picture=").append(picture);
        sb.append(", url=").append(url);
        sb.append(", validDate=").append(validDate);
        sb.append(", status=").append(status);
        sb.append(", subscriber=").append(subscriber);
        sb.append(", contactNumber=").append(contactNumber);
        sb.append(", modifyTime=").append(modifyTime);
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
        AdvRotator other = (AdvRotator) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getPicture() == null ? other.getPicture() == null : this.getPicture().equals(other.getPicture()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getValidDate() == null ? other.getValidDate() == null : this.getValidDate().equals(other.getValidDate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSubscriber() == null ? other.getSubscriber() == null : this.getSubscriber().equals(other.getSubscriber()))
            && (this.getContactNumber() == null ? other.getContactNumber() == null : this.getContactNumber().equals(other.getContactNumber()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getPicture() == null) ? 0 : getPicture().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getValidDate() == null) ? 0 : getValidDate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSubscriber() == null) ? 0 : getSubscriber().hashCode());
        result = prime * result + ((getContactNumber() == null) ? 0 : getContactNumber().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        return result;
    }
}