package com.teamax.alleyoop.common.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.teamax.alleyoop.common.util.R;
import com.teamax.alleyoop.common.util.Result;
import com.teamax.alleyoop.common.util.ResultUtil;
import com.teamax.alleyoop.dao.BusAccountTokenMapper;
import com.teamax.alleyoop.entity.BusAccountToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Writer;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class RestFulInterceptor implements HandlerInterceptor {
    @Autowired
    private BusAccountTokenMapper tokenMapper;

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
        String uri = request.getRequestURI();
        Map<String, String> headerMaps = new HashMap<>();
        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            String value = request.getHeader(key);
            headerMaps.put(key, value);
        }
        if(!uri.contains("/web/")){ //不是api接口
            return true;
        }
        if( uri.contains("account/update.shtm")||               //账户修改
            uri.contains("account/password/change.shtm")||      //密码修改
            uri.contains("account/logout.shtm")||               //退出
            uri.contains("account/address/add.shtm")||          //地址新增
            uri.contains("account/address/update.shtm")||       //地址修改
            uri.contains("account/getAddress.shtm")||           //地址获取
            uri.contains("account/following.shtm")||            //关注商品列表
            uri.contains("account/buying.shtm")||               //购买记录
            uri.contains("account/selling.shtm")||              //出售记录
            uri.contains("account/profile.shtm")||              //用户信息
            uri.contains("account/vacation/setting.shtm")||     //假日模式设置
            uri.contains("account/notification/setting.shtm")|| //设置消息通知
            uri.contains("account/notification/getting.shtm")|| //获取消息通知

            uri.contains("commodity/sell/ask.shtm")||           //报价
            uri.contains("commodity/buy/bid.shtm")||            //出价
            uri.contains("commodity/search/add.shtm")||         //检索记录新增
            uri.contains("commodity/search/history.shtm")||     //检索记录获取历史
            uri.contains("commodity/follow.shtm")||             //关注商品
            uri.contains("commodity/follow/cancel.shtm")||      //取消关注商品

            uri.contains("payment/add.shtm")||                  //支付账号新增
            uri.contains("payment/update.shtm")||               //支付账号修改
            uri.contains("payment/history/list.shtm")||         //获取可用的支付列表

            uri.contains("order/0/placeAnOrder.shtm")||         //下单
            uri.contains("order/*/change.shtm")||               //订单状态修改

            uri.contains("stripe/ephemeralKey.shtm")||          //Stripe生成ephemeral key
            uri.contains("stripe/charge.shtm")                  //Stripe token支付
            ){
            response.setCharacterEncoding("UTF-8");
            if(request.getParameter("accountCode")==null||"".equals(request.getParameter("accountCode"))){
                Writer writer = response.getWriter();
                writer.write(JSONObject.toJSONString(R.error(401,"accountCode参数不能为空"), SerializerFeature.WriteMapNullValue));
                return false;
            }
            if(!((request.getParameter("accountCode")).matches("-?[0-9]+.*[0-9]*"))){
                Writer writer = response.getWriter();
                writer.write(JSONObject.toJSONString(R.error(401,"accountCode参数类型错误"), SerializerFeature.WriteMapNullValue));
                return false;
            }
            Integer accountCode = Integer.parseInt(request.getParameter("accountCode"));//用户账号
            BusAccountToken loginToken = tokenMapper.isTokenAvailable(accountCode,headerMaps.get("token"));
            if(loginToken != null){//token存在
                Date expireTime = loginToken.getExpireTime();
                if(expireTime.before(new Date())){
                    Writer writer = response.getWriter();
                    writer.write(JSONObject.toJSONString(R.error(401,"登录信息已过期"), SerializerFeature.WriteMapNullValue));
                    return false;
                }
                return true;
            }else{//token不存在，验证不通过
                Writer writer = response.getWriter();
                writer.write(JSONObject.toJSONString(R.error(401,"用户身份验证失败"), SerializerFeature.WriteMapNullValue));
                return false;
            }
        }else{
            return true;
        }
    }

    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {
    }

    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
    }
}
