package com.teamax.alleyoop.service;


import com.teamax.alleyoop.common.util.R;
import com.teamax.alleyoop.entity.BusAccount;
import com.teamax.alleyoop.entity.BusAccountAddress;
import net.sf.json.JSONObject;

public interface AccountService {

    R addOrUpdateAddress(String opt,BusAccountAddress address);

    /**
     * 用户注册
     * @param bean
     * @return
     */
    int register(BusAccount bean);

    /**
     * 忘记密码
     * @param email
     * @return
     */
    int forgetPassword(String email);

    /**
     * 根据邮箱地址修改密码
     * @param account
     * @param verifyCode
     * @param newPassword
     * @return
     */
    R changePasswordByEmail(BusAccount account, String verifyCode, String newPassword);

    /**
     * stripe获取ephemeral key
     * @param accountCode
     * @param apiVersion
     * @return
     */
    JSONObject generateEphemeralKey(Integer accountCode, String apiVersion);
}