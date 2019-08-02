package com.teamax.alleyoop.web;

import com.teamax.alleyoop.common.util.JsonResult;
import com.teamax.alleyoop.service.OrderService;
import com.teamax.alleyoop.service.WeChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: WeChatController 微信第三方登录
 * @Description: TODO
 * @Author DingDaWei
 * @date 2018/7/1614:55
 * @Version 1.0.0
 */
@Controller
@RequestMapping("web/weChat")
@ApiIgnore
public class WeChatController {

    @Autowired
    private WeChatService weChatService;
    @Resource
    OrderService orderService;


    @RequestMapping(value = "test.shtm",method = RequestMethod.POST)
    @ResponseBody
    public Integer test() {
        return orderService.statisticsCommoditySoldInfo();
    }

    /**
     * 微信授权 -->登录(移动端)
     * @param request
     * @param code 微信临时授权凭证
     * @return
     */
    @RequestMapping(value = "appWXLogin.shtm",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult appWXLogin(HttpServletRequest request, String code) {
        return weChatService.appWXLogin(request,code);
    }

    /**
     * 微信授权 -->注册(移动端)
     * @param request
     * @param phone 手机号
     * @return
     */
    @RequestMapping(value = "/appWXRegister",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult appWXRegister(HttpServletRequest request,Long phone){
        return weChatService.appWXRegister(request,phone);
    }

    /**
     * 拉起微信登录二维码页面(PC端)
     * @return URL 微信登录请求地址
     */
    @RequestMapping(value = "/webWXLink",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult webWXLink(HttpServletRequest request) {
        return weChatService.webWXLink(request);
    }

    /**
     * 微信授权 -->登录回调(PC端)
     * @param request
     * @return
     */
    @RequestMapping(value = "/webWXLogin")
    @ResponseBody
    public JsonResult webWXLogin(HttpServletRequest request) {
        return weChatService.webWXLogin(request);
    }

    /**
     *  微信授权 -->注册(PC端)
     * @param request
     * @param phone 手机号
     * @return
     */
    @RequestMapping(value = "/webWXRegister",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult webWXRegister(HttpServletRequest request,String phone) {
        return weChatService.webWXRegister(request,phone);
    }

}
