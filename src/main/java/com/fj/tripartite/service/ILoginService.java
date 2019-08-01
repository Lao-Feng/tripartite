package com.fj.tripartite.service;

import com.fj.tripartite.domain.po.UserInfo;

import javax.validation.constraints.NotNull;

/**
 * 登录服务接口
 *
 * @Author: FengJie
 * @Date: 2019/8/1 21:55
 */
public interface ILoginService {

    /**
     * 微信APP登录
     *
     * @param code 微信登录code
     * @return 用户信息
     */
    UserInfo weixinLogin(@NotNull String code);
}
