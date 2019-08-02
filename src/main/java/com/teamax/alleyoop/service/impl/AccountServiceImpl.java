package com.teamax.alleyoop.service.impl;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.EphemeralKey;
import com.stripe.net.RequestOptions;
import com.teamax.alleyoop.common.shiro.PasswordHash;
import com.teamax.alleyoop.common.util.DateUtils;
import com.teamax.alleyoop.common.util.MailUtil;
import com.teamax.alleyoop.common.util.R;
import com.teamax.alleyoop.common.util.StringUtils;
import com.teamax.alleyoop.dao.*;
import com.teamax.alleyoop.entity.*;
import com.teamax.alleyoop.service.AccountService;
import com.teamax.alleyoop.service.BrandService;
import com.teamax.alleyoop.service.runnable.AccountUpdateRunnable;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import springfox.documentation.annotations.ApiIgnore;

import java.util.*;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Value("#{prop.activeUrl}")
    String activeUrl;
    @Value("#{prop.apiKey}")
    public String privateKey;
    @Autowired
    BusAccountPasswordForgetMapper forgetMapper;
    @Autowired
    TemplateEngine mailTemplateEngine;
    @Autowired
    private PasswordHash passwordHash;
    @Autowired
    BusAccountMapper accountMapper;
    @Autowired
    BusAccountNotificationMapper notificationMapper;
    @Autowired
    BusAccountAddressMapper addressMapper;

    @Override
    @Transactional
    public R addOrUpdateAddress(String opt, BusAccountAddress address) {
        if(opt.equals("add")){
            addressMapper.insertSelective(address);
            return R.ok("地址新增成功!").put("addressCode",address.getAddressCode());
        }else if(opt.equals("update")){
            BusAccountAddress original = addressMapper.selectByPrimaryKey(address.getAddressCode());
            if(!address.equals(original)){//有属性修改，同数据库中不一致
                address.setAddressCode(null);//置为null
                address.setDefaultUsed(1);//设置为默认使用
                addressMapper.insertSelective(address);//新增
                ////////////////////////////////////////////////////////////////////////////////////////////////////////
                original.setDefaultUsed(0);//设置为非默认使用
                addressMapper.updateByPrimaryKeySelective(original);
            }
            return R.ok("修改成功!").put("addressCode",address.getAddressCode());
        }
        return R.error();
    }

    @Override
    @Transactional
    public int register(BusAccount bean) {
        String salt = StringUtils.getUUId();//加盐[密钥]
        String pwd  = passwordHash.toHex(bean.getPassword(), salt);
        bean.setSalt(salt);
        bean.setPassword(pwd);
        accountMapper.insertSelective(bean);//新增用户
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        BusAccountNotification notification = new BusAccountNotification();
        notification.setAccountCode(bean.getAccountCode());
        notificationMapper.insertSelective(notification);//新增账户消息通知相关信息

        String emailX  = passwordHash.toHex(bean.getEmailAddress(), salt);
        String url =  activeUrl + "?id="+bean.getAccountCode()+"&email="+emailX;//账号激活
        Context context = new Context();
        context.setVariable("activeUrl",url);
        String content= mailTemplateEngine.process("accountActive", context); //获取thymeleaf的html模板
        new Thread(new MailUtil(bean.getEmailAddress(),"账号激活",content)).start();
        return 1;
    }

    @Override
    @Transactional
    public int forgetPassword(String email) {
        String verifyCode = StringUtils.verifyCode();//生成随机验证码
        BusAccountPasswordForget temp = forgetMapper.getVerifyCodeByEmail(email);//获取验证码
        if(temp==null){
            BusAccountPasswordForget forget = new BusAccountPasswordForget();
            forget.setEmail(email);
            forget.setVerifyCode(verifyCode);
            forget.setCreateTime(new Date());
            forgetMapper.insertSelective(forget);
        }else{
            temp.setVerifyCode(verifyCode);
            temp.setCreateTime(new Date());
            forgetMapper.updateByPrimaryKeySelective(temp);
        }
        Context context = new Context();
        context.setVariable("verifyCode",verifyCode);
        String content= mailTemplateEngine.process("passwordForget", context); //获取thymeleaf的html模板
        new Thread(new MailUtil(email,"忘记密码",content)).start();
        return 1;
    }

    @Override
    @Transactional
    public R changePasswordByEmail(BusAccount account, String verifyCode, String newPassword) {
        BusAccountPasswordForget temp = forgetMapper.getVerifyCodeByEmail(account.getEmailAddress());//获取验证码
        if(temp==null){
            return R.error("验证码错误!");
        }
        if(!verifyCode.equals(temp.getVerifyCode())){
            return R.error("验证码错误!");
        }
        Date now = new Date();
        Date deadline =  DateUtils.plusMinutes(temp.getCreateTime(),new Long(1));//验证码1分钟有效期
        if(now.getTime() > deadline.getTime()){
            forgetMapper.deleteByPrimaryKey(temp.getId());//删除验证码信息
            return R.error("验证码已过期");
        }
        String salt = StringUtils.getUUId();//加盐[密钥]
        String pwd  = passwordHash.toHex(newPassword, salt);
        account.setSalt(salt);
        account.setPassword(pwd);
        accountMapper.updateByPrimaryKeySelective(account);//修改密码
        forgetMapper.deleteByPrimaryKey(temp.getId());//删除验证码信息
        return R.ok("密码修改成功!");
    }

    @Override
    @Transactional
    public JSONObject generateEphemeralKey(Integer accountCode, String apiVersion) {
        try {
            Stripe.apiKey = privateKey;
            RequestOptions requestOptions = (new RequestOptions.RequestOptionsBuilder())
                    .setStripeVersionOverride(apiVersion)
                    .build();
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Map<String, Object> options = new HashMap<>();
            BusAccount account = accountMapper.selectByPrimaryKey(accountCode);
            if(account.getStripeCustomerId()!=null&&!"".equals(account.getStripeCustomerId())){ //已有customerId关联
                options.put("customer", account.getStripeCustomerId());
            }else{
                Map<String, Object> params = new HashMap<>();
                params.put("email", account.getEmailAddress());
                Customer customer = Customer.create(params);//没有customerId关联 创建新的
                options.put("customer", customer.getId());
                ////////////////////////////////////////////////////////////////////////////////////////////////////////
                account.setStripeCustomerId(customer.getId());
                new Thread(new AccountUpdateRunnable(account,accountMapper)).start();//新建线程更新customerId
            }
            EphemeralKey key = EphemeralKey.create(options, requestOptions);
            JSONObject jb = JSONObject.fromObject(key.getRawJson());
            return jb;
        } catch (StripeException e) {
            JSONObject jb = new JSONObject();
            jb.put("msg",e.getMessage());
            return jb;
        }
    }
}
