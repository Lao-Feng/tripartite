/**
 *
 */
package com.teamax.alleyoop.common.shiro;

import com.teamax.alleyoop.entity.SysUser;

import java.io.Serializable;
import java.util.Set;

/**
 * @description：自定义Authentication对象，使得Subject除了携带用户的登录名外还可以携带更多信息
 * @author：zhixuan.wang
 * @date：2015/10/1 14:51
 */
public class ShiroUser implements Serializable {
    private static final long serialVersionUID = -1373760761780840081L;

    private final String loginName;
    private Set<String> urlSet;
    private Set<String> roles;
    private SysUser user;

    public ShiroUser(SysUser user,String loginName) {
        this.user = user;
        this.loginName = loginName;
    }

    public String getLoginName() {
        return loginName;
    }

    public Set<String> getUrlSet() {
        return urlSet;
    }

    public void setUrlSet(Set<String> urlSet) {
        this.urlSet = urlSet;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public SysUser getUser() {
        return user;
    }

    public void setUser(SysUser user) {
        this.user = user;
    }
}