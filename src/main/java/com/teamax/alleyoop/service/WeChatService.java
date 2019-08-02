package com.teamax.alleyoop.service;


import com.teamax.alleyoop.common.util.JsonResult;

import javax.servlet.http.HttpServletRequest;

public interface WeChatService {

    /**
     * 微信授权 -->登录(移动端)
     * @param request
     * @param code 微信临时授权凭证
     * @return
     */
    JsonResult appWXLogin(HttpServletRequest request, String code);

    /**
     *  微信授权 -->注册(移动端)
     * @param request
     * @param phone 手机号
     * @return
     */
    JsonResult appWXRegister(HttpServletRequest request, Long phone);

    /**
     * 拉起微信登录二维码页面(PC端)
     * @return URL 微信登录请求地址
     */
    JsonResult webWXLink(HttpServletRequest request);

    /**
     * 微信登录回调(PC端)
     * @param request
     * @return
     */
    JsonResult webWXLogin(HttpServletRequest request);

    /**
     * 微信授权 -->注册(PC端)
     * @param request
     * @param phone 手机号
     * @return
     */
    JsonResult webWXRegister(HttpServletRequest request, String phone);
}
