package com.teamax.alleyoop.web;

import com.teamax.alleyoop.common.util.R;
import com.teamax.alleyoop.dao.BusAccountPaymentMapper;
import com.teamax.alleyoop.dao.DicCurrencyMapper;
import com.teamax.alleyoop.entity.*;
import com.teamax.alleyoop.service.AccountService;
import com.teamax.alleyoop.service.CommodityService;
import com.teamax.alleyoop.service.PaymentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONObject;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 支付接口服务
 */
@Controller
@RequestMapping("web")
@Api(tags={"Payment API"},description="支付相关接口")
public class PaymentWebController {
    @Autowired
    AccountService accountService;
    @Autowired
    BusAccountPaymentMapper paymentMapper;
    @Autowired
    PaymentService paymentService;
    @Autowired
    CommodityService commodityService;

    @Autowired
    DicCurrencyMapper dicCurrencyMapper;

    /**
     * 获取加币和外币的汇率
     * @param foreign
     * @return
     */
    @ApiOperation(value = "获取加币和外币的汇率",notes = "获取加币和外币的汇率")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "foreign",value = "外币(人民币CNY,美元USD)",required = true,dataType = "String")})
    @RequestMapping(path ="pay/exchange/getRate.shtm",method =RequestMethod.POST)
    @ResponseBody
    public R exchangeCurrency(String foreign) {
        DicCurrencyExample dicCurrencyExample = new DicCurrencyExample();
        DicCurrencyExample.Criteria criteria = dicCurrencyExample.createCriteria();
        criteria.andLocalcurrencyEqualTo("CAD");
        criteria.andForeigncurrencyEqualTo(foreign);
        List<DicCurrency> dicCurrencyList = dicCurrencyMapper.selectByExample(dicCurrencyExample);
        if (dicCurrencyList.size() == 1) {
            return R.ok().put("msg", "success").put("data", dicCurrencyList.get(0).getExchangerate());
        }
        return R.error().put("msg", "get exchange rate failed!").put("data", dicCurrencyList.size());
    }

    @ApiOperation(value = "新增/修改支付账户",notes = "绑定支付账户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="path", name = "opt", value = "opt为add表示新增;opt为update表示修改", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "paymentCode", value = "账号", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "paymentType", value = "支付方式类型,1-Paypal、2-信用卡、3-微信", required = false, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "cardNumber", value = "信用卡号", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "expires", value = "有效期", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "CVV", value = "安全码;", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "paypal", value = "Paypal账号", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "weixin", value = "微信账号", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "accountCode", value = "用户ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "billingAddress", value = "账单地址", required = false, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "payment", value = "(此参数不用)", required = false, dataType = "BusAccountPayment")
    })
    @RequestMapping( path = "payment/{opt}.shtm",method = RequestMethod.POST)
    @ResponseBody
    public R addOrUpdatePayment(@PathVariable(value="opt") String opt,
                                @Param("payment") BusAccountPayment payment){
        return paymentService.addOrUpdatePayment(opt,payment);
    }

    @ApiOperation(value = "获取支付列表",notes = "用户获取支付账户历史记录")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "accountCode", value = "用户ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "paymentType", value = "支付类型,1-Paypal、2-信用卡、3-微信", required = false, dataType = "Integer")})
    @RequestMapping(value="payment/history/list.shtm",method = RequestMethod.POST)
    @ResponseBody
    public R getPaymentList(@Param(value="accountCode")Integer accountCode,
                            @Param(value="paymentType")Integer paymentType) {
        BusAccountPaymentExample example = new BusAccountPaymentExample();
        BusAccountPaymentExample.Criteria criteria = example.createCriteria();
        criteria.andAccountCodeEqualTo(accountCode);
        if(paymentType!=null){
            criteria.andPaymentTypeEqualTo(paymentType);
        }
        List<BusAccountPayment> list = paymentMapper.selectByExample(example);
        return R.ok().put("data",list);
    }

    @ApiOperation(value = "stripe获取ephemeral key",notes = "stripe获取ephemeral key")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "accountCode", value = "用户ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "apiVersion", value = "apiVersion (2019-05-16)", required = true, dataType = "String")})
    @RequestMapping(value="stripe/ephemeralKey.shtm",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject getEphemeralKey(@Param(value="accountCode")Integer accountCode,
                                      @Param(value="apiVersion")String apiVersion) {
        return accountService.generateEphemeralKey(accountCode,apiVersion);
    }

    /**
     * 客户端提交token令牌id 后，执行付费操作
     * @param stripeToken
     * @param orderCode
     * @return
     */
    @ApiOperation(value = "stripe token支付",notes = "stripe token支付")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "accountCode", value = "用户ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "stripeToken", value = "stripe token", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "orderCode", value = "订单编号", required = true, dataType = "Integer")})
    @RequestMapping(value="stripe/charge.shtm",method = RequestMethod.POST)
    @ResponseBody
    public R charge(@Param(value="accountCode")Integer accountCode,
                    @Param("stripeToken") String stripeToken,
                    @Param("orderCode") Integer orderCode) {
        return paymentService.stripePayByToken(stripeToken,orderCode);
    }



    /**
     * alipay支付回调
     * @param result
     * @return
     */
    @RequestMapping("pay/alipay.shtm")
    @ResponseBody
    @ApiOperation(value = "alipay支付回调", httpMethod = "GET", notes = "alipay支付回调", response = BusCommondity.class)
    public String alipayCallback(String result){
        return "null means success,other means failure!";
    }


    @RequestMapping("pay/test.shtm")
    @ResponseBody
    @ApiOperation(value = "alipay支付回调", httpMethod = "GET", notes = "alipay支付回调", response = BusCommondity.class)
    public String test(){
        //commodityService.updateCommodityPrice();
        return "null means success,other means failure!";
    }

    @RequestMapping("stripe/test.shtm")
    @ResponseBody
    @ApiOperation(value = "stripe webhook测试", httpMethod = "GET", notes = "stripe webhook测试", response = String.class)
    public String testStripe(){
        return "测试成功！o yeah!";
    }


//    public static void  main(String args[]){
//        // Set your secret key: remember to change this to your live secret key in production
//        // See your keys here: https://dashboard.stripe.com/account/apikeys
//        Stripe.apiKey = "sk_test_KbIZ3G0WPG51l3KjlqwqC91q00kh9DBF8N";
//        Map<String, Object> params = new HashMap<String, Object>();
//        params.put("amount", 999);
//        params.put("currency", "usd");
//        params.put("source", "tok_visa");
//        params.put("receipt_email", "jenny.rosen@example.com");
//        try {
//            Charge charge = Charge.create(params);
//            System.out.println();
//        } catch (StripeException e) {
//            e.printStackTrace();
//        }
//    }

}