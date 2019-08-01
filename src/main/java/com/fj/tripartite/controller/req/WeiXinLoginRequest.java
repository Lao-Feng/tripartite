package com.fj.tripartite.controller.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 微信快捷登录请求对象
 *
 * @Author: FengJie
 * @Date: 2019/8/1 21:46
 */
@Data
@ApiModel(value = "CLIENT-微信快捷登录请求对象")
public class WeiXinLoginRequest {

    @ApiModelProperty(value = "微信登录CODE,当前App程序在调用微信App登录成功之后，由微信返回", required = true, example = "ASFASGASAS")
    private String code;
}
