package com.fj.controller.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 微信登录响应对象
 *
 * @Author: FengJie
 * @Date: 2019/8/1 21:47
 */
@Data
@ApiModel(value = "CLIENT-微信登录响应对象")
public class WeiXinLoginResponse {

    @ApiModelProperty(value = "用户ID", required = true, example = "12345689987654321")
    private Long userId;

    @ApiModelProperty(value = "令牌", required = true, example = "sjdfkahskdfhaksfka")
    private String token;

    @ApiModelProperty(value = "令牌", required = true, example = "sjdfkahskdfhaksfka")
    private String openId;

    @ApiModelProperty(value = "是否需要绑定到账户1已经绑定，2未绑定", required = true, example = "1")
    private Integer bindTelFlag;
}
