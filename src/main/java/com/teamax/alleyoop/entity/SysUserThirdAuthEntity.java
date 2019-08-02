package com.teamax.alleyoop.entity;

/**
 * @ClassName: SysUserThirdAuthEntity
 * @Description: TODO
 * @Author DingDaWei
 * @date 2018/7/2314:35
 * @Version 1.0.0
 */
public class SysUserThirdAuthEntity {

    /** 主键id */
    private Long id;

    /**用户id */
    private Long userId;

    /**第三方登陆类型 openID*/
    private Long oauthKey;

    /**第三方登陆名称 */
    private String oauthName;

    /**access_token令牌 */
    private String oauthAccessToken;

    /**token失效时间 */
    private String oauthTokenExpires;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getOauthKey() {
        return oauthKey;
    }

    public void setOauthKey(Long oauthKey) {
        this.oauthKey = oauthKey;
    }

    public String getOauthName() {
        return oauthName;
    }

    public void setOauthName(String oauthName) {
        this.oauthName = oauthName;
    }

    public String getOauthAccessToken() {
        return oauthAccessToken;
    }

    public void setOauthAccessToken(String oauthAccessToken) {
        this.oauthAccessToken = oauthAccessToken;
    }

    public String getOauthTokenExpires() {
        return oauthTokenExpires;
    }

    public void setOauthTokenExpires(String oauthTokenExpires) {
        this.oauthTokenExpires = oauthTokenExpires;
    }

    @Override
    public String toString() {
        return "SysUserThirdAuthEntity{" +
                "id=" + id +
                ", userId=" + userId +
                ", oauthKey=" + oauthKey +
                ", oauthName='" + oauthName + '\'' +
                ", oauthAccessToken='" + oauthAccessToken + '\'' +
                ", oauthTokenExpires='" + oauthTokenExpires + '\'' +
                '}';
    }
}
