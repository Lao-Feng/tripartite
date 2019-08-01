package com.fj.tripartite.service.impl;

import com.fj.tripartite.controller.resp.WeiXinLoginResponse;
import com.fj.tripartite.helper.WeiXinHelper;
import com.fj.tripartite.helper.domain.WeiXinUserInfo;
import com.fj.tripartite.helper.domain.WxTokenResult;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 登录服务接口实现
 *
 * @Author: FengJie
 * @Date: 2019/8/1 21:56
 */
public class LoginServiceImpl {

    @Autowired
    private WeiXinHelper weiXinHelper;

    public void weixinLogin(String code) {
        WeiXinLoginResponse response = new WeiXinLoginResponse();

        WxTokenResult wxTokenResult = weiXinHelper.getAccessToken(code);
        WeiXinUserInfo weiXinUserInfo = weiXinHelper.getWeiXinUserInfo(wxTokenResult.getAccess_token(), wxTokenResult.getOpenid());


        // 数据库根据用户的openId 查询用户
        // 查询到了用户就返回对应的用户信息
        //未查询到用户信息,看看app是否还额外需要绑定用户手机号
        //返回其对应的用户信息

        //response.setOptionId(wxTokenResult.getOpend);

    }

}
