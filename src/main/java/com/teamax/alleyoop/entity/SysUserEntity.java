package com.teamax.alleyoop.entity;

import java.util.Date;

/**
 * @ClassName: SysUserEntity
 * @Description: TODO
 * @Author DingDaWei
 * @date 2018/7/2314:10
 * @Version 1.0.0
 */
public class SysUserEntity {

    /**主键id */
    private Long id;

    /**创建时间 */
    private Date createTime;

    /**邮箱 */
    private String email;

    /**密码 */
    private String password;

    /**座机号码 */
    private String phone;

    /**真实姓名 */
    private String realname;

    /**盐(MD5秘钥) */
    private String salt;

    /**状态 */
    private String status;

    /**用户名 */
    private String username;

    /**组织ID */
    private String organizationId;

    /**类型 */
    private String type;

    /**手机号 */
    private String mobilePhone;

    /**QQ号 */
    private String qq;

    /**微信号码 */
    private String wechat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getCredentialsSalt() {

        return this.salt+salt;
    }

    @Override
    public String toString() {
        return "SysUserEntity{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", realname='" + realname + '\'' +
                ", salt='" + salt + '\'' +
                ", status='" + status + '\'' +
                ", username='" + username + '\'' +
                ", organizationId='" + organizationId + '\'' +
                ", type='" + type + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", qq='" + qq + '\'' +
                ", wechat='" + wechat + '\'' +
                '}';
    }
}
