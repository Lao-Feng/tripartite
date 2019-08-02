package com.teamax.alleyoop.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
@ApiModel(value="信息对象模型")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SysNews implements Serializable {
    private Integer id;

    /**
    * 类型：1-用户条款；2-隐私政策；3-常见问题；
    **/
    private Byte type;

    /**
    * 标题
    **/
    @ApiModelProperty(value="标题")
    private String title;

    /**
    * 简介
    **/
    @ApiModelProperty(value="简介")
    private String introduction;

    /**
    * 消息接收人
    **/
    private Long message_receiver;

    /**
    * 创建时间
    **/
    private Date create_time;

    /**
    * 作者
    **/
    private String author;

    /**
    * 点击量、阅读量
    **/
    private Integer click_rate;

    /**
    * 发布时间
    **/
    private Date newstime;

    /**
    * 是否有图片1有，0没有
    **/
    private Byte picture_flag;

    /**
    * 图片url
    **/
    private String picture;

    /**
    * 是否已发布?(1:表示发布;0:表示未发布)
    **/
    private String status;

    /**
    * 内容
    **/
    private byte[] content;
    private String xxxx;

    @ApiModelProperty(value="内容")
    private String contentStr;

    private static final long serialVersionUID = 1L;

    public String getXxxx() {
        return xxxx;
    }

    public void setXxxx(String xxxx) {
        this.xxxx = xxxx;
    }

    public Integer getId() {
        return id;
    }

    public SysNews withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getType() {
        return type;
    }

    public SysNews withType(Byte type) {
        this.setType(type);
        return this;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public SysNews withTitle(String title) {
        this.setTitle(title);
        return this;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public SysNews withIntroduction(String introduction) {
        this.setIntroduction(introduction);
        return this;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Long getMessage_receiver() {
        return message_receiver;
    }

    public SysNews withMessage_receiver(Long message_receiver) {
        this.setMessage_receiver(message_receiver);
        return this;
    }

    public void setMessage_receiver(Long message_receiver) {
        this.message_receiver = message_receiver;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public SysNews withCreate_time(Date create_time) {
        this.setCreate_time(create_time);
        return this;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getAuthor() {
        return author;
    }

    public SysNews withAuthor(String author) {
        this.setAuthor(author);
        return this;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Integer getClick_rate() {
        return click_rate;
    }

    public SysNews withClick_rate(Integer click_rate) {
        this.setClick_rate(click_rate);
        return this;
    }

    public void setClick_rate(Integer click_rate) {
        this.click_rate = click_rate;
    }

    public Date getNewstime() {
        return newstime;
    }

    public SysNews withNewstime(Date newstime) {
        this.setNewstime(newstime);
        return this;
    }

    public void setNewstime(Date newstime) {
        this.newstime = newstime;
    }

    public Byte getPicture_flag() {
        return picture_flag;
    }

    public SysNews withPicture_flag(Byte picture_flag) {
        this.setPicture_flag(picture_flag);
        return this;
    }

    public void setPicture_flag(Byte picture_flag) {
        this.picture_flag = picture_flag;
    }

    public String getPicture() {
        return picture;
    }

    public SysNews withPicture(String picture) {
        this.setPicture(picture);
        return this;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getStatus() {
        return status;
    }

    public SysNews withStatus(String status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public byte[] getContent() {
        return content;
    }

    public SysNews withContent(byte[] content) {
        this.setContent(content);
        return this;
    }

    public void setContent(byte[] content) {
        this.contentStr = new String(content);
        this.content = content;
    }

    public String getContentStr() {
        return contentStr;
    }

    public void setContentStr(String contentStr) {
        this.contentStr = contentStr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", title=").append(title);
        sb.append(", introduction=").append(introduction);
        sb.append(", message_receiver=").append(message_receiver);
        sb.append(", create_time=").append(create_time);
        sb.append(", author=").append(author);
        sb.append(", click_rate=").append(click_rate);
        sb.append(", newstime=").append(newstime);
        sb.append(", picture_flag=").append(picture_flag);
        sb.append(", picture=").append(picture);
        sb.append(", status=").append(status);
        sb.append(", content=").append(content);
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
        SysNews other = (SysNews) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getIntroduction() == null ? other.getIntroduction() == null : this.getIntroduction().equals(other.getIntroduction()))
            && (this.getMessage_receiver() == null ? other.getMessage_receiver() == null : this.getMessage_receiver().equals(other.getMessage_receiver()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getClick_rate() == null ? other.getClick_rate() == null : this.getClick_rate().equals(other.getClick_rate()))
            && (this.getNewstime() == null ? other.getNewstime() == null : this.getNewstime().equals(other.getNewstime()))
            && (this.getPicture_flag() == null ? other.getPicture_flag() == null : this.getPicture_flag().equals(other.getPicture_flag()))
            && (this.getPicture() == null ? other.getPicture() == null : this.getPicture().equals(other.getPicture()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (Arrays.equals(this.getContent(), other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getIntroduction() == null) ? 0 : getIntroduction().hashCode());
        result = prime * result + ((getMessage_receiver() == null) ? 0 : getMessage_receiver().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getClick_rate() == null) ? 0 : getClick_rate().hashCode());
        result = prime * result + ((getNewstime() == null) ? 0 : getNewstime().hashCode());
        result = prime * result + ((getPicture_flag() == null) ? 0 : getPicture_flag().hashCode());
        result = prime * result + ((getPicture() == null) ? 0 : getPicture().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + (Arrays.hashCode(getContent()));
        return result;
    }
}