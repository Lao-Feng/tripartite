package com.teamax.alleyoop.service.impl;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import com.stripe.model.Customer;
import com.stripe.model.Token;
import com.teamax.alleyoop.common.util.R;
import com.teamax.alleyoop.dao.*;
import com.teamax.alleyoop.entity.*;
import com.teamax.alleyoop.service.PaymentService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {
    @Value("#{prop.apiKey}")
    public String privateKey;
    @Autowired
    BusAccountPaymentMapper paymentMapper;
    @Autowired
    BusAccountAddressMapper addressMapper;
    @Autowired
    BusOrderMapper orderMapper;
    @Autowired
    BusOrderFlowMapper flowMapper;
    @Resource
    BusDiscountMapper busDiscountMapper;

    @Override
    @Transactional
    public R addOrUpdatePayment(String opt, BusAccountPayment payment) {
        if("add".equals(opt)){
            //1.调用接口验证账户信息是否可用(未完....)

            //2.新增账户信息
            paymentMapper.insertSelective(payment);
            return R.ok("新增成功!").put("paymentCode",payment.getPaymentCode());
        }else if("update".equals(opt)){
            BusAccountPayment original = paymentMapper.selectByPrimaryKey(payment.getPaymentCode());
            if(!payment.equals(original)){//有属性修改，同数据库中不一致
                payment.setPaymentCode(null);//置为null
                payment.setDefaultUsed(1);//设置为默认使用
                paymentMapper.insertSelective(payment);//新增
                ////////////////////////////////////////////////////////////////////////////////////////////////////////
                original.setDefaultUsed(0);//设置为非默认使用
                paymentMapper.updateByPrimaryKeySelective(original);
            }
            return R.ok("修改成功!").put("paymentCode",payment.getPaymentCode());
        }
        return R.error();
    }

    @Override
    @Transactional
    public R newPayment(BusAccountPayment payment) {
        //1.调用接口验证账户信息是否可用(未完....)

        //2.新增账户信息
        paymentMapper.insertSelective(payment);
        return R.ok("新增成功!").put("paymentCode",payment.getPaymentCode());
    }

    @Override
    @Transactional
    public R stripePayByToken(String stripeToken, Integer orderCode) {
        BusOrder order = orderMapper.selectByPrimaryKey(orderCode);
        try {
            Stripe.apiKey = privateKey;
            Token token = Token.retrieve(stripeToken);
            if (token==null || token.getUsed()){
                return R.error("token 无效");
            }
            // Create a Customer:
            Map<String, Object> customerParams = new HashMap<>();
            customerParams.put("source", stripeToken);//TODO 使用了测试token tok_visa
            customerParams.put("email", order.getPurchaser().getEmailAddress());//购买者邮件地址
            Customer customer = Customer.create(customerParams);
            {
                // Charge the Customer instead of the card:
                Map<String, Object> chargeParams = new HashMap<>();
                chargeParams.put("amount", getPaymentsFromOrder(order));//应付金额
                chargeParams.put("currency", "usd");//美元
                //chargeParams.put("currency", "CNY");//英镑
                chargeParams.put("customer", customer.getId());
                chargeParams.put("description", order.getCommodity().getCommodityName());//商品名称
                chargeParams.put("receipt_email", order.getPurchaser().getEmailAddress());//正式环境下付款成功后将会收到邮件信息（付款人邮件）
                Charge charge = Charge.create(chargeParams);
                //System.out.println(charge);
                if ("succeeded".equals(charge.getStatus())){
                    //TODO 此时应该将charge id 关联在订单并处理订单支付成功逻辑
                    ////////////////////////////////////////////////////////////////////////////////////////////////////
                    BusOrderFlow flow = new BusOrderFlow();
                    flow.setOperator(order.getBuyer());flow.setFlowName("买家支付");
                    flow.setOperatorType("1");
                    flow.setOrderCode(order.getOrderCode());
                    flow.setFlowTime(new Date());
                    flowMapper.insertSelective(flow);
                    ////////////////////////////////////////////////////////////////////////////////////////////////////
                    order.setProgress("11");//订单已支付
                    order.setReceiptNumber(charge.getId());//支付回单号码
                    order.setPaymentMethod("stripe");//stripe支付
                    order.setPaymentTime(new Date());//支付时间
                    order.setPaymentState(1);//已支付
                    orderMapper.updateByPrimaryKeySelective(order);
                    ////////////////////////////////////////////////////////////////////////////////////////////////////
                    return R.ok("支付成功").put("chargeId",charge.getId());
                }else{
                    return R.error("支付失败");
                }
            }
        } catch (StripeException e) {
            //e.printStackTrace();
            return R.error(e.getMessage());
        }
        //return R.error("支付失败");
    }

    int getPaymentsFromOrder(BusOrder order){
        int price = order.getCommondityPrice().intValue();               //价格
        int shippingFee = order.getShippingFee().intValue();             //物流费用
        int authenticationFee = order.getAuthenticationFee().intValue(); //平台检验费用
        int payments = price + shippingFee + authenticationFee;
        String discountCodes = order.getDiscountCodes();//优惠券
        if(discountCodes!=null&&!"".equals(discountCodes)){
            String[] dcodes = discountCodes.split(",");
            for(String code: dcodes){
                BusDiscount discount = busDiscountMapper.selectByPrimaryKey(code);
                int discountAmount = discount.getAmount();
                payments = payments - discountAmount;//减去优惠券上的价格
            }
        }
        return payments;
    }
}
