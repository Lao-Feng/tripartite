package com.teamax.alleyoop.web;

import com.teamax.alleyoop.common.annotation.SysLogAnnotation;
import com.teamax.alleyoop.common.util.R;
import com.teamax.alleyoop.entity.BusOrder;
import com.teamax.alleyoop.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Date;

/**
 * 订单接口服务
 */
@Controller
@RequestMapping("web")
@Api(tags={"Order API"},description="订单相关接口")
public class OrderWebController {
    @Autowired
    OrderService orderService;

    @ApiOperation(value = "下单",notes = "买家下单购买商品 或者 卖家下单出售商品")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "accountCode", value = "用户ID(orderType为buy时表示买方ID,orderType为sell时表示卖方ID,)", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "orderType", value = "订单类型:buy-购买;sell-出售;", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "commondityCode", value = "商品编号", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "sizeName", value = "规格大小", required = true, dataType = "String"),
            //@ApiImplicitParam(paramType="query", name = "buyer", value = "买方ID", required = false, dataType = "Integer"),
            //@ApiImplicitParam(paramType="query", name = "seller", value = "卖方ID", required = false, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "commondityPrice", value = "购买/出售价格", required = true, dataType = "Double"),
            @ApiImplicitParam(paramType="query", name = "selfPickup", value = "是否自提:0-不自提;1-自提", required = false, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "buyerPayment", value = "购买人支付账号ID", required = false, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "buyerAddress", value = "购买人收货地址ID", required = false, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "sellerPayment", value = " 出售方收款账号ID", required = false, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "sellerAddress", value = "出售方寄出地址ID", required = false, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "discountCodes", value = "优惠券编号 多个以逗号,分隔", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "bean", value = "(此参数不用)", required = false, dataType = "BusOrder")
    })
    @RequestMapping(path = "order/0/placeAnOrder.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    @SysLogAnnotation(value="下单")
    public R placeAnOrder(@Param(value="accountCode")Integer accountCode,
                          @Param("order") BusOrder bean) {
        if("buy".equals(bean.getOrderType())) {//购买下单
            bean.setBuyer(accountCode);
        }else if("sell".equals(bean.getOrderType())){
            bean.setSeller(accountCode);
        }else{
            return R.error("orderType 参数错误!");
        }
        return orderService.placeAnOrder(bean);
    }

    @ApiOperation(value = "出售确认",notes = "买家下单购买商品,卖家确定出售或不出售")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "orderCode", value = "订单ID", required = true, dataType = "Integer"),
            //@ApiImplicitParam(paramType="query", name = "askCode", value = "要价ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "seller", value = "卖家", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "status", value = "状态：1-确定出售；-2 取消出售", required = true, dataType = "Integer"),
    })
    @RequestMapping(path = "order/1/sellerConfirm.shtm", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    @SysLogAnnotation(value="出售确认")
    public String sellerConfirm(Integer orderCode,Integer seller, Integer status) {
        return orderService.sellerConfirm(orderCode,seller,status);
    }

    @ApiOperation(value = "购买确认",notes = "卖家下单出售商品,买家确定购买或不购买")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "orderCode", value = "订单ID", required = true, dataType = "Integer"),
            //@ApiImplicitParam(paramType="query", name = "bidCode", value = "出价ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "buyer", value = "买家", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "status", value = "状态：1 确定购买；-2 取消购买", required = true, dataType = "Integer"),
    })
    @RequestMapping(path = "order/1/buyerConfirm.shtm", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    @SysLogAnnotation(value="购买确认")
    public String buyerConfirm(Integer orderCode,Integer buyer, Integer status) {
        return orderService.buyerConfirm(orderCode,buyer,status);
    }


    @ApiOperation(value = "订单状态更改",notes = "更改订单状态：2-卖家备货中、3-卖家物流到平台")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="path", name = "status", value = "订单状态:2-卖家备货中、3-卖家物流到平台、8-买家收货", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "orderCode", value = "订单ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "accountCode", value = "修改人ID", required = true, dataType = "Integer"),
    })
    @RequestMapping(path = "order/{status}/change.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    @SysLogAnnotation(value="修改订单状态")
    public R changeProgress(Integer orderCode,Integer accountCode,@PathVariable(value="status") String status) {
        return orderService.changeProgress(orderCode,accountCode,status);
    }
}