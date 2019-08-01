package com.fj.tripartite.controller.login;

import com.fj.tripartite.controller.req.WeiXinLoginRequest;
import com.fj.tripartite.controller.resp.WeiXinLoginResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 登录控制器
 *
 * @Author: FengJie
 * @Date: 2019/8/1 21:34
 */
@Api(tags = "CLIENT-登录/登出/注册等")
@RestController
@RequestMapping("user")
public class LoginController {

    @ApiOperation(value = "微信快捷登录", notes = "微信快捷登录")
    @ApiParam(name = "req", required = true)
    @ApiResponse(code = 200, message = "OK", response = WeiXinLoginResponse.class)
    @PostMapping("v1/login/weixin")
    public WeiXinLoginResponse weixinLogin(@RequestBody @Valid WeiXinLoginRequest req) {
        return null;
    }

}
