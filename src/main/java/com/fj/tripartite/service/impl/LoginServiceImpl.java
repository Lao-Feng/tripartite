package com.fj.tripartite.service.impl;

import com.fj.tripartite.controller.resp.WeiXinLoginResponse;
import com.fj.tripartite.domain.po.UserInfo;
import com.fj.tripartite.helper.WeiXinHelper;
import com.fj.tripartite.domain.bo.weixin.WeiXinUserInfo;
import com.fj.tripartite.domain.bo.weixin.WxTokenResult;
import com.fj.tripartite.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotNull;

/**
 * 登录服务接口实现
 *
 * @Author: FengJie
 * @Date: 2019/8/1 21:56
 */
public class LoginServiceImpl implements ILoginService {

    @Autowired
    private WeiXinHelper weiXinHelper;

    @Override
    public UserInfo weixinLogin(@NotNull String code) {
        WxTokenResult token = weiXinHelper.getAccessToken(code);
        WeiXinUserInfo weiXinUserInfo = weiXinHelper.getWeiXinUserInfo(token.getAccess_token(), token.getOpenid());

        //1. 根据微信返回的结果，判断用户是否在当前系统中注册过？
        //getByOpenid（）==null

        //2、如果未注册，需要在相应参数中，新增未注册标识，这时就可以在登录界面引导用户注册

        //3、如果注册过，这时就返回用户的基础数据

        return new UserInfo();
    }

    //public void weixinLogin(String code) {
    //    WeiXinLoginResponse response = new WeiXinLoginResponse();
    //
    //    WxTokenResult wxTokenResult = weiXinHelper.getAccessToken(code);
    //    WeiXinUserInfo weiXinUserInfo = weiXinHelper.getWeiXinUserInfo(wxTokenResult.getAccess_token(), wxTokenResult.getOpenid());
    //
    //
    //    // 数据库根据用户的openId 查询用户
    //    // 查询到了用户就返回对应的用户信息
    //    //未查询到用户信息,看看app是否还额外需要绑定用户手机号
    //    //返回其对应的用户信息
    //
    //    //response.setOptionId(wxTokenResult.getOpend);
    //
    //}

}
