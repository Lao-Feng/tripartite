package com.teamax.alleyoop.service;

import com.teamax.alleyoop.common.util.R;
import com.teamax.alleyoop.entity.BusAccountAddress;
import com.teamax.alleyoop.entity.BusAccountPayment;

public interface PaymentService {

    /**
     *
     * @param opt
     * @param payment
     * @return
     */
    R addOrUpdatePayment(String opt,BusAccountPayment payment);

    /**
     * 新增支付账户
     * @param payment
     * @return
     */
    R newPayment(BusAccountPayment payment);

    /**
     * Stripe付款
     * @param stripeToken
     * @param orderCode
     * @return
     */
    R stripePayByToken(String stripeToken,Integer orderCode);
}