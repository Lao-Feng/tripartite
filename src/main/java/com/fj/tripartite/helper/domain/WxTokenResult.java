package com.fj.tripartite.helper.domain;

import lombok.Data;

/**
 * 微信请求返回对象
 */
@Data
public class WxTokenResult {

    /**
     * 接口调用凭证
     */
    private String access_token;

    /**
     * access_token接口调用凭证超时时间，单位（秒）
     */
    private String expires_in;

    /**
     * 用户刷新access_token
     */
    private String refresh_token;

    /**
     * 授权用户唯一标识
     */
    private String openid;

    /**
     * 用户授权的作用域，使用逗号（,）分隔
     */
    private String scope;

    /**
     * 用户统一标识。针对一个微信开放平台帐号下的应用，同一用户的unionid是唯一的。
     */
    private String unionid;

    /**
     * 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空
     */
    private String headimgurl;
}
