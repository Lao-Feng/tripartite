package com.teamax.alleyoop.common.wechat;


import net.sf.json.JSONObject;

/**
 * @ClassName: WeChatUtils 微信工具类
 * @Description: TODO
 * @Author DingDaWei
 * @date 2018/7/1710:23
 * @Version 1.0.0
 */
public class WeChatUtils {

    public final static String APPID = "wx4530e35e8a9fc5cd";

    public final static String APPSECRET = "6ffcc3cca25aadb32aacdf48bb68778f";

    /*-----------------------------------PC端------------------------------------ */

    //授权作用域(网页应用目前仅填写snsapi_login)
    public final static String SCOPE = "snsapi_login";

    /**微信请求地址 */
    //获取code 接口地址 Get
    public final static String WEB_CODE_URL = "https://open.weixin.qq.com/connect/qrconnect?appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=SCOPE&state=STATE#wechat_redirect";

    //微信回调地址(获取code)
    public final static String REDIRECT_URI = "http://www.mogujie.com/oauth/callback/weixin/mogujie";


    /*-----------------------------------PC端 & 移动端------------------------------------ */
    //获取access_token 接口地址   Get
    public final static String ACCESS_TOKEN_URL = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";

    //刷新或续期access_token 接口地址   Get
    public final static String REFRESH_TOKEN_URL = "https://api.weixin.qq.com/sns/oauth2/refresh_token?appid=APPID&grant_type=refresh_token&refresh_token=REFRESH_TOKEN";

    //获取userinfo 接口地址   Get
    public final static String WECHAT_USERINFO_URL = "https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID";


    /**
     * 拼接获取code的:接口地址
     * @param state 状态码
     * @return
     */
    public static String getCodeURL(String state) {
        return WEB_CODE_URL.replace("APPID",APPID).replace("REDIRECT_URI",REDIRECT_URI).replace("SCOPE",SCOPE).replace("STATE",state);
    }


    /**
     * 获取授权登录access_token
     * @param code 临时授权凭证
     * @return
     */
    public static AccessToken getAccessToken(String code) {
        //拼接获取access_token的请求地址
        String accessTokenUrl  = ACCESS_TOKEN_URL.replace("APPID", APPID).replace("SECRET", APPSECRET).replace("CODE", code);

        //发送请求,获取返回结果
        JSONObject jsonObject = HttpsUtils.sendRequest(accessTokenUrl, "GET", null);

        //获取返回的参数,并且封装成AccessToken对象
        AccessToken accessToken = new AccessToken();
        if (jsonObject.getString("access_token") != null) {
            /**
             *  官方返回格式:
             * "access_token":"ACCESS_TOKEN",
             * "expires_in":7200,
             * "refresh_token":"REFRESH_TOKEN",
             * "openid":"OPENID",
             * "scope":"SCOPE"，
             * "unionid":"o6_bmasdasdsad6_2sgVt7hMZOPfL"
             */
            accessToken.setAccess_token(jsonObject.getString("access_token"));
            accessToken.setExpires_in(jsonObject.getString("expires_in"));
            accessToken.setRefresh_token(jsonObject.getString("refresh_token"));
            accessToken.setOpenid(jsonObject.getString("openid"));
            accessToken.setScope(jsonObject.getString("scope"));
            //UnionID机制
            accessToken.setUnionid(jsonObject.getString("unionid"));
        } else {
            /**
             * 错误返回样例：
             * "errcode":40029,
             * "errmsg":"invalid code"
             */
            accessToken.setErrcode(jsonObject.getString("errcode"));
            accessToken.setErrmsg(jsonObject.getString("errmsg"));
        }
        return accessToken;
    }


    /**
     * 刷新access_token
     * @return
     */
    public static AccessToken refreshAccessToken() {
        //拼接获取refreshTokenUrl的请求地址
        String refreshTokenUrl = REFRESH_TOKEN_URL.replace("APPID", APPID);

        //发送请求,获取返回结果
        JSONObject jsonObject = HttpsUtils.sendRequest(refreshTokenUrl, "GET", null);

        AccessToken accessToken = new AccessToken();
        //获取返回的参数,并且封装成AccessToken对象
        if (jsonObject.getString("access_token") != null) {
            /**
             *  官方返回格式:
             * "access_token":"ACCESS_TOKEN",
             * "expires_in":7200,
             * "refresh_token":"REFRESH_TOKEN",
             * "openid":"OPENID",
             * "scope":"SCOPE"，
             * "unionid":"o6_bmasdasdsad6_2sgVt7hMZOPfL"
             */
            accessToken.setAccess_token(jsonObject.getString("access_token"));
            accessToken.setExpires_in(jsonObject.getString("expires_in"));
            accessToken.setRefresh_token(jsonObject.getString("refresh_token"));
            accessToken.setOpenid(jsonObject.getString("openid"));
            accessToken.setScope(jsonObject.getString("scope"));
            //UnionID机制
            accessToken.setUnionid(jsonObject.getString("unionid"));
        } else {
            /**
             * 错误返回样例：
             * "errcode":40030,
             * "errmsg":"invalid refresh_token"
             */
            accessToken.setErrcode(jsonObject.getString("errcode"));
            accessToken.setErrmsg(jsonObject.getString("errmsg"));
        }
        return accessToken;
    }


    /**
     * 获取用户信息
     * @param accessToken
     * @param openid
     * @return
     */
    public static WeChatUser getWeChatUserInfo(String accessToken,String openid) {
        //拼接获取userinfo的请求地址
        String userinfoUrl = WECHAT_USERINFO_URL.replace("ACCESS_TOKEN",accessToken).replace("OPENID",openid);

        //发送请求,获取返回结果
        JSONObject jsonObject = HttpsUtils.sendRequest(userinfoUrl, "GET", null);

        //获取返回的参数,并且封装成WeChatUser对象
        WeChatUser weChatUser = new WeChatUser();
        if (jsonObject.getString("openid") != null) {
            /**
             * 官方返回格式:
             * {
             * "openid":"OPENID",
             * "nickname":"NICKNAME",
             * "sex":1,
             * "province":"PROVINCE",
             * "city":"CITY",
             * "country":"COUNTRY",
             * "headimgurl": "http://wx.qlogo.cn/mmopen/g3MonUZtNHkdmzicIlibx6iaFqAc56vxLSUfpb6n5WKSYVY0ChQKkiaJSgQ1dZuTOgvLLrhJbERQQ4eMsv84eavHiaiceqxibJxCfHe/0",
             * "privilege":[PRIVILEGE1","PRIVILEGE2"],
             * "unionid": " o6_bmasdasdsad6_2sgVt7hMZOPfL"
             * }
             */

            weChatUser.setOpenid(jsonObject.getString("openid"));
            weChatUser.setNickname(jsonObject.getString("nickname"));
            weChatUser.setSex(jsonObject.getString("sex"));
            weChatUser.setProvince(jsonObject.getString("province"));
            weChatUser.setCity(jsonObject.getString("city"));
            weChatUser.setCountry(jsonObject.getString("country"));
            weChatUser.setHeadimgurl(jsonObject.getString("headimgurl"));
            weChatUser.setPrivilege(jsonObject.getString("privilege"));
            weChatUser.setUnionid(jsonObject.getString("unionid"));
        } else {
            /**
             * 错误返回样例：
             * "errcode":40003,
             * "errmsg":"invalid openid"
             */
            weChatUser.setErrcode(jsonObject.getString("errcode"));
            weChatUser.setErrmsg(jsonObject.getString("errmsg"));
        }
        return weChatUser;
    }

}
