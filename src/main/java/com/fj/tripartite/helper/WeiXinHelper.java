package com.fj.tripartite.helper;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fj.tripartite.constant.WeiXinConstant;
import com.fj.tripartite.domain.bo.weixin.WeiXinUserInfo;
import com.fj.tripartite.domain.bo.weixin.WxTokenResult;
import com.fj.tripartite.okhttp.DefaultHttpClient;
import com.google.common.base.Joiner;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;


/**
 * @Author: FengJie
 * @Date: 2019/8/1 21:34
 */
@Slf4j
@Component
public class WeiXinHelper {

    // TODO: 2019/8/1  获取微信配置


    @Value("${wanqian.weixin.app.appId}")
    String appId;

    @Value("${wanqian.weixin.app.appSecret}")
    String secret;

    @Value("${wanqian.weixin.applet.appId}")
    String appletAppId;

    @Value("${wanqian.weixin.applet.appSecret}")
    String appletAppSecret;

    /**
     * 根据当前登录用户的code，查询其对应的微信注册资料
     *
     * @param code 微信登录成功之后返回的code
     * @return 微信用户资料
     */
    public WxTokenResult getAccessToken(String code) {
        //构建请求参数
        Map<String, String> paramMap = new HashMap<>(4);
        paramMap.put("appid", appId);
        paramMap.put("secret", secret);
        paramMap.put("code", code);
        paramMap.put("grant_type", "authorization_code");

        try {
            String url = WeiXinConstant.ACCESS_TOKEN_URL + "?" + mapToFormData(paramMap, false);
            Request request = new Request.Builder().url(url).get().build();
            //此处省略回调方法。
            Response response = DefaultHttpClient.newCall(request).execute();

            JSONObject jsonObject = JSON.parseObject(response.body().string());
            return JSON.toJavaObject(jsonObject, WxTokenResult.class);
        } catch (Exception e) {
            throw new RuntimeException("获取微信TOKEN信息失败");
        }
    }

    /**
     * 获取openId
     *
     * @param accessToken
     * @param openId
     * @return
     */
    public WeiXinUserInfo getWeiXinUserInfo(String accessToken, String openId) {

        //构建请求参数
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("access_token", accessToken);
        paramMap.put("openId", openId);
        paramMap.put("lang", "cn");

        try {
            String url = WeiXinConstant.USER_INFO_URL + "?" + mapToFormData(paramMap, false);
            Request request = new Request.Builder().url(url).get().build();
            Response response = DefaultHttpClient.newCall(request).execute();
            String result = response.body().string();
            return JSON.parseObject(result, WeiXinUserInfo.class);
        } catch (Exception e) {
            throw new RuntimeException("获取用户微信信息失败");
        }
    }

    private static String mapToFormData(Map<String, String> map, boolean isURLEncoder) throws UnsupportedEncodingException {
        String formData = "";
        if (map != null && map.size() > 0) {
            formData = Joiner.on("&").withKeyValueSeparator("=").join(map);
            if (isURLEncoder) {
                formData = URLEncoder.encode(formData, "UTF-8");
            }
        }
        return formData;
    }
}
