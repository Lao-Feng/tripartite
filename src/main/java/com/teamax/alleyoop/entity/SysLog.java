package com.teamax.alleyoop.entity;

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
public class SysLog implements Serializable {
    /**
    * 标识
    **/
    private Long id;

    /**
    * 日志类型  0 ，系统 ，操作，访问，1，异常
    **/
    private Byte type;

    /**
    * 接口访问人
    **/
    private String user;

    /**
    * 操作人 组织
    **/
    private String organization;

    /**
    * 操作名
    **/
    private String operation;

    /**
    * 方法 接口
    **/
    private String interface_name;

    /**
    * 参数
    **/
    private String params;

    /**
    * 请求方式 get post
    **/
    private String method;

    /**
    * 用户 浏览器
    **/
    private String browser;

    /**
    * 服务端ip
    **/
    private String server_ip;

    /**
    * 客户端IP
    **/
    private String client_ip;

    /**
    * 返回
    **/
    private String result;

    /**
    * 异常
    **/
    private String exception;

    /**
    * 创建时间,操作时间
    **/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date create_time;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public SysLog withId(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getType() {
        return type;
    }

    public SysLog withType(Byte type) {
        this.setType(type);
        return this;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getUser() {
        return user;
    }

    public SysLog withUser(String user) {
        this.setUser(user);
        return this;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getOrganization() {
        return organization;
    }

    public SysLog withOrganization(String organization) {
        this.setOrganization(organization);
        return this;
    }

    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    public String getOperation() {
        return operation;
    }

    public SysLog withOperation(String operation) {
        this.setOperation(operation);
        return this;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    public String getInterface_name() {
        return interface_name;
    }

    public SysLog withInterface_name(String interface_name) {
        this.setInterface_name(interface_name);
        return this;
    }

    public void setInterface_name(String interface_name) {
        this.interface_name = interface_name == null ? null : interface_name.trim();
    }

    public String getParams() {
        return params;
    }

    public SysLog withParams(String params) {
        this.setParams(params);
        return this;
    }

    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    public String getMethod() {
        return method;
    }

    public SysLog withMethod(String method) {
        this.setMethod(method);
        return this;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getBrowser() {
        return browser;
    }

    public SysLog withBrowser(String browser) {
        this.setBrowser(browser);
        return this;
    }

    public void setBrowser(String browser) {
        this.browser = browser == null ? null : browser.trim();
    }

    public String getServer_ip() {
        return server_ip;
    }

    public SysLog withServer_ip(String server_ip) {
        this.setServer_ip(server_ip);
        return this;
    }

    public void setServer_ip(String server_ip) {
        this.server_ip = server_ip == null ? null : server_ip.trim();
    }

    public String getClient_ip() {
        return client_ip;
    }

    public SysLog withClient_ip(String client_ip) {
        this.setClient_ip(client_ip);
        return this;
    }

    public void setClient_ip(String client_ip) {
        this.client_ip = client_ip == null ? null : client_ip.trim();
    }

    public String getResult() {
        return result;
    }

    public SysLog withResult(String result) {
        this.setResult(result);
        return this;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getException() {
        return exception;
    }

    public SysLog withException(String exception) {
        this.setException(exception);
        return this;
    }

    public void setException(String exception) {
        this.exception = exception == null ? null : exception.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public SysLog withCreate_time(Date create_time) {
        this.setCreate_time(create_time);
        return this;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", user=").append(user);
        sb.append(", organization=").append(organization);
        sb.append(", operation=").append(operation);
        sb.append(", interface_name=").append(interface_name);
        sb.append(", params=").append(params);
        sb.append(", method=").append(method);
        sb.append(", browser=").append(browser);
        sb.append(", server_ip=").append(server_ip);
        sb.append(", client_ip=").append(client_ip);
        sb.append(", result=").append(result);
        sb.append(", exception=").append(exception);
        sb.append(", create_time=").append(create_time);
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
        SysLog other = (SysLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getOrganization() == null ? other.getOrganization() == null : this.getOrganization().equals(other.getOrganization()))
            && (this.getOperation() == null ? other.getOperation() == null : this.getOperation().equals(other.getOperation()))
            && (this.getInterface_name() == null ? other.getInterface_name() == null : this.getInterface_name().equals(other.getInterface_name()))
            && (this.getParams() == null ? other.getParams() == null : this.getParams().equals(other.getParams()))
            && (this.getMethod() == null ? other.getMethod() == null : this.getMethod().equals(other.getMethod()))
            && (this.getBrowser() == null ? other.getBrowser() == null : this.getBrowser().equals(other.getBrowser()))
            && (this.getServer_ip() == null ? other.getServer_ip() == null : this.getServer_ip().equals(other.getServer_ip()))
            && (this.getClient_ip() == null ? other.getClient_ip() == null : this.getClient_ip().equals(other.getClient_ip()))
            && (this.getResult() == null ? other.getResult() == null : this.getResult().equals(other.getResult()))
            && (this.getException() == null ? other.getException() == null : this.getException().equals(other.getException()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getOrganization() == null) ? 0 : getOrganization().hashCode());
        result = prime * result + ((getOperation() == null) ? 0 : getOperation().hashCode());
        result = prime * result + ((getInterface_name() == null) ? 0 : getInterface_name().hashCode());
        result = prime * result + ((getParams() == null) ? 0 : getParams().hashCode());
        result = prime * result + ((getMethod() == null) ? 0 : getMethod().hashCode());
        result = prime * result + ((getBrowser() == null) ? 0 : getBrowser().hashCode());
        result = prime * result + ((getServer_ip() == null) ? 0 : getServer_ip().hashCode());
        result = prime * result + ((getClient_ip() == null) ? 0 : getClient_ip().hashCode());
        result = prime * result + ((getResult() == null) ? 0 : getResult().hashCode());
        result = prime * result + ((getException() == null) ? 0 : getException().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        return result;
    }
}