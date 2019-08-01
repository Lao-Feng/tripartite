package com.fj.tripartite.constant;

/**
 * 微信相关常亮
 *
 * @author FengJie
 */
public interface WeiXinConstant {

    /**
     * 获取微信token
     * 参数	是否必须	说明
     * appid	是	应用唯一标识，在微信开放平台提交应用审核通过后获得
     * secret	是	应用密钥AppSecret，在微信开放平台提交应用审核通过后获得
     * code	是	填写第一步获取的code参数
     * grant_type	是	填authorization_code
     * 返回结果：
     * 参数                              说明
     * access_token                    接口调用凭证
     * expires_in  access_token        接口调用凭证超时时间，单位（秒）
     * refresh_token                   用户刷新access_token
     * openid                          授权用户唯一标识
     * scope                           用户授权的作用域，使用逗号（,）分隔
     * unionid          只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。
     */
    String ACCESS_TOKEN_URL = "https://api.weixin.qq.com/sns/oauth2/access_token";

    /**
     * 获取个人信息
     * 参数	是否必须	说明
     * access_token	是	调用凭证（上一个请求中获得）
     * openid	是	普通用户的标识，对当前开发者帐号唯一（上一个请求中获得）
     * lang	  否	国家地区语言版本，zh_CN 简体，zh_TW 繁体，en 英语，默认为zh-CN
     * <p>
     * 返回结果
     * openid	普通用户的标识，对当前开发者帐号唯一
     * nickname	普通用户昵称
     * sex	普通用户性别，1为男性，2为女性
     * province	普通用户个人资料填写的省份
     * city	普通用户个人资料填写的城市
     * country	国家，如中国为CN
     * headimgurl	用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空
     * privilege	用户特权信息，json数组，如微信沃卡用户为（chinaunicom）
     * unionid	用户统一标识。针对一个微信开放平台帐号下的应用，同一用户的unionid是唯一的。
     */
    String USER_INFO_URL = "https://api.weixin.qq.com/sns/userinfo";
}
