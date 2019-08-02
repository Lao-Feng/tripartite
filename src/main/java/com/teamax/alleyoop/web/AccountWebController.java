package com.teamax.alleyoop.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teamax.alleyoop.common.annotation.SysLogAnnotation;
import com.teamax.alleyoop.common.json.JSON;
import com.teamax.alleyoop.common.shiro.PasswordHash;
import com.teamax.alleyoop.common.util.*;
import com.teamax.alleyoop.dao.*;
import com.teamax.alleyoop.entity.*;
import com.teamax.alleyoop.service.AccountService;
import com.teamax.alleyoop.service.CommodityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 账户接口服务
 */
@Controller
@RequestMapping("web")
@Api(tags={"Account API"},description="账户相关接口")
public class AccountWebController {
    @Value("#{prop.fileHttp}")
    public String http;
    @Autowired
    private PasswordHash passwordHash;
    @Autowired
    BusAccountMapper busAccountMapper;
    @Autowired
    DicBrandMapper dicBrandMapper;
    @Autowired
    BusCommondityMapper busCommondityMapper;
    @Autowired
    BusCommonditySizeMapper commoditySizeMapper;
    @Autowired
    BusAskMapper busAskMapper;
    @Autowired
    BusBidMapper busBidMapper;
    @Autowired
    CommodityService commodityService;
    @Autowired
    BusAccountAddressMapper addressMapper;
    @Autowired
    BusAccountTokenMapper tokenMapper;
    @Autowired
    BusOrderMapper busOrderMapper;
    @Autowired
    AccountService accountService;
    @Autowired
    BusAccountNotificationMapper notificationMapper;
    @Autowired
    RelAccountCommodityFollowingMapper followingMapper;

    @SysLogAnnotation(value="平台用户注册/平台用户修改")
    @ApiOperation(value = "账户注册/账户修改", httpMethod = "POST", notes = "平台账户信息注册/修改", response = R.class)
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="path", name = "opt", value = "opt为register表示注册;opt为update表示修改", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "accountCode", value = "账号ID", required = false, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "firstName", value = "姓", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "lastName", value = "名", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "userName", value = "别名", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "emailAddress", value = "邮箱地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "password", value = "密码", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "selectedCurrency", value = "采用的货币(RMB/USD)", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "vice", value = "关注品类,逗号分隔", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "shoeSize", value = "鞋码（自动推荐用）", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "fingerPrintLogin", value = "是否支持指纹登录0-不支持，1-支持", required = false),
            @ApiImplicitParam(paramType="query", name = "bean", value = "(此参数不用)", required = false, dataType = "BusAccount")
    })
    @RequestMapping( path = "account/{opt}.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public R registerOrUpdate(@PathVariable(value="opt") String opt,@Param("account") BusAccount bean){
        boolean isEmail = RegexUtils.checkEmail(bean.getEmailAddress());
        if(!isEmail){
            return R.error().put("msg","邮箱地址错误!");
        }
        if(opt.equals("register")){//注册
            BusAccount exist = busAccountMapper.selectByEmailAddress(bean.getEmailAddress().trim());
            if(exist!=null){
                return R.error().put("msg","该邮箱已注册使用!");
            }else{
                accountService.register(bean);
                return R.ok().put("msg","恭喜! 注册成功!");
            }
        }else if(opt.equals("update")){//修改基本信息
            if(bean.getAccountCode()==null){return R.error("accountCode不能为空");}
            BusAccount exist = busAccountMapper.selectByEmailAddressOther(bean.getEmailAddress().trim(),bean.getAccountCode());
            if(exist!=null){
                return R.error().put("msg","该邮箱已注册使用!");
            }else{
                busAccountMapper.updateByPrimaryKeySelective(bean);
                return R.ok().put("msg","修改成功!");
            }
        }
        return R.error();
    }

    @SysLogAnnotation(value="账号激活")
    @ApiOperation(value = "用户账号激活", httpMethod = "POST", notes = "用户注册后进行账号激活", response = R.class)
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "id", value = "账号ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "email", value = "邮箱地址", required = true, dataType = "String"),
    })
    @RequestMapping( path = "account/active.shtm", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public R accountActive(Integer id,String email){
        if(id==null||email==null){
            return R.error("参数id,email不能为空!");
        }
        BusAccount account = busAccountMapper.selectByPrimaryKey(id);
        if(account==null){
            return R.error("账号不存在!");
        }
        String emailX = passwordHash.toHex(account.getEmailAddress(), account.getSalt());
        if(!email.equals(emailX)){
            return R.error("邮箱地址错误!");
        }
        account.setStatus("1");
        busAccountMapper.updateByPrimaryKeySelective(account);
        return R.ok("账号激活成功!");
    }

    @SysLogAnnotation(value="设置vacation模式")
    @ApiOperation(value = "设置vacation模式", httpMethod = "POST", notes = "vacation模式", response = R.class)
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "accountCode", value = "账号ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "vacationMode", value = "1-启用，2-未启用", required = true, dataType = "String")
    })
    @RequestMapping( path = "account/vacation/setting.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public R setVacation(@Param("account")Integer accountCode,@Param("account") String vacationMode){
        BusAccount temp = busAccountMapper.selectByPrimaryKey(accountCode);
        if(temp==null){return R.error("accountCode账号不存在!");}
        if(!"1".equals(vacationMode)&&!"2".equals(vacationMode)){return R.error("vacationMode值错误!");}
        BusAccount account = new BusAccount();
        account.setAccountCode(accountCode);
        account.setVacationMode(vacationMode);
        busAccountMapper.updateByPrimaryKeySelective(account);
        return R.ok("设置成功").put("vacationMode",vacationMode);
    }

    @SysLogAnnotation(value="设置notification消息通知")
    @ApiOperation(value = "设置notification消息通知", httpMethod = "POST", notes = "设置账号是否开启消息通知", response = R.class)
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "accountCode", value = "账号ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "biddingNewLowestAsk", value = "0-都不启用,1-email消息推送,2-app消息推送,3-email/app都推送", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "bidExpiring", value = "0-都不启用,1-email消息推送,2-app消息推送,3-email/app都推送", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "bidExpired", value = "0-都不启用,1-email消息推送,2-app消息推送,3-email/app都推送", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "askMatchesExpiredBid", value = "0-都不启用,1-email消息推送,2-app消息推送,3-email/app都推送", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "buyerNearbyMatch", value = "0-都不启用,1-email消息推送,2-app消息推送,3-email/app都推送", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "bidAccepted", value = "0-都不启用,1-email消息推送,2-app消息推送,3-email/app都推送", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "IPOBidAlmost", value = "0-都不启用,1-email消息推送,2-app消息推送,3-email/app都推送", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "IPOBidOut", value = "0-都不启用,1-email消息推送,2-app消息推送,3-email/app都推送", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "IPOBidAccepted", value = "0-都不启用,1-email消息推送,2-app消息推送,3-email/app都推送", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "followingNewLowestAsk", value = "0-都不启用,1-email消息推送,2-app消息推送,3-email/app都推送", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "askingNewHighestBid", value = "0-都不启用,1-email消息推送,2-app消息推送,3-email/app都推送", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "askingNewHighestBidPercent", value = "at least X percent of your Ask.", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "askingNewLowestAsk", value = "0-都不启用,1-email消息推送,2-app消息推送,3-email/app都推送", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "askExpiring", value = "0-都不启用,1-email消息推送,2-app消息推送,3-email/app都推送", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "askExpired", value = "0-都不启用,1-email消息推送,2-app消息推送,3-email/app都推送", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "itemSold", value = "0-都不启用,1-email消息推送,2-app消息推送,3-email/app都推送", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "firstSellerHasNotShipped", value = "0-都不启用,1-email消息推送,2-app消息推送,3-email/app都推送", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "secondSellerHasNotShipped", value = "0-都不启用,1-email消息推送,2-app消息推送,3-email/app都推送", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "thirdSellerHasNotShipped", value = "0-都不启用,1-email消息推送,2-app消息推送,3-email/app都推送", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "productFeatures", value = "0-都不启用,1-email消息推送,2-app消息推送,3-email/app都推送", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "sneakerNews", value = "0-都不启用,1-email消息推送,2-app消息推送,3-email/app都推送", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "handbagNews", value = "0-都不启用,1-email消息推送,2-app消息推送,3-email/app都推送", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "watchNews", value = "0-都不启用,1-email消息推送,2-app消息推送,3-email/app都推送", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "streetwearNews", value = "0-都不启用,1-email消息推送,2-app消息推送,3-email/app都推送", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "priceDropEmail", value = "0-都不启用,1-email消息推送,2-app消息推送,3-email/app都推送", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "welcomeSeries", value = "0-都不启用,1-email消息推送,2-app消息推送,3-email/app都推送", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "bean", value = "(此参数不用)", required = false, dataType = "BusAccountNotification")
    })
    @RequestMapping( path = "account/notification/setting.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public R setNotification(@Param("notification")BusAccountNotification bean){
        notificationMapper.updateByPrimaryKeySelective(bean);
        return R.ok("设置成功");
    }

    @ApiOperation(value = "获取用户消息通知设置", httpMethod = "GET", notes = "获取用户的各种通知消息设置", response = BusAccountNotification.class)
    @ApiImplicitParams({@ApiImplicitParam(paramType="query", name = "accountCode", value = "用户账号", required = true, dataType = "Integer")})
    @RequestMapping(value = "account/notification/getting.shtm",method = RequestMethod.GET)
    @JSON(type = BusAccountNotification.class)
    public Result getNotification(Integer accountCode){
        BusAccountNotification notification = notificationMapper.selectByPrimaryKey(accountCode);
        return ResultUtil.success(notification);
    }

    @SysLogAnnotation(value="平台用户修改密码")
    @ApiOperation(value = "根据用户ID修改密码", httpMethod = "POST", notes = "平台用户根据ID请求修改密码", response = R.class)
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="path", name = "opt", value = "opt为change表示修改;", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "accountCode", value = "账号", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "newPassword", value = "新密码", required = true, dataType = "String")
    })
    @ResponseBody
    @RequestMapping(path = "account/password/{opt}.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public R password(Integer accountCode,String newPassword,@PathVariable(value="opt") String opt){
        if(accountCode==null){return R.error("accountCode不能为空");}
        BusAccount account = busAccountMapper.selectByPrimaryKey(accountCode);
        if(account==null){
            return R.error().put("msg","账户不存在!");
        }
        if("change".equals(opt)){
            String salt = StringUtils.getUUId();//加盐[密钥]
            String pwd  = passwordHash.toHex(newPassword, salt);
            account.setSalt(salt);
            account.setPassword(pwd);
            busAccountMapper.updateByPrimaryKeySelective(account);
            return R.ok("密码修改成功!");
        }else if("reset".equals(opt)){//重置密码

        }
        return R.error();
    }

    @SysLogAnnotation(value="忘记密码")
    @ApiOperation(value = "用户忘记密码", httpMethod = "POST", notes = "平台用户忘记密码", response = R.class)
    @ApiImplicitParams({@ApiImplicitParam(paramType="query", name = "email", value = "邮件地址", required = true, dataType = "String")})
    @ResponseBody
    @RequestMapping(path = "account/password/forget.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public R passwordForget(String email){
        boolean isEmail = RegexUtils.checkEmail(email);
        if(!isEmail){
            return R.error().put("msg","邮箱地址错误!");
        }
        BusAccount account = busAccountMapper.selectByEmailAddress(email);
        if(account==null){
            return R.error().put("msg","账户不存在!");
        }
        int r = accountService.forgetPassword(email);
        if(r==0){return R.error();}
        return R.ok("验证码已发送至邮箱,验证通过后可重置密码!");
    }

    @SysLogAnnotation(value="平台用户修改密码")
    @ApiOperation(value = "根据email修改密码", httpMethod = "POST", notes = "平台用户根据邮箱地址修改密码", response = R.class)
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "email", value = "邮箱地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "verifyCode", value = "验证码", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "newPassword", value = "新密码", required = true, dataType = "String")
    })
    @ResponseBody
    @RequestMapping(path = "email/password/change.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public R passwordChangeByEmail(String email,String verifyCode,String newPassword){
        boolean isEmail = RegexUtils.checkEmail(email);
        if(!isEmail){
            return R.error().put("msg","邮箱地址错误!");
        }
        if(verifyCode==null||"".equals(verifyCode)){
            return R.error().put("msg","验证码错误!");
        }
        BusAccount account = busAccountMapper.selectByEmailAddress(email);
        if(account==null){
            return R.error().put("msg","账户不存在!");
        }
        return  accountService.changePasswordByEmail(account,verifyCode,newPassword);
    }

    @SysLogAnnotation(value="用户登录",type = "1")
    @ApiOperation(value = "用户登录", httpMethod = "POST", notes = "平台用户登录", response = R.class)
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "emailAddress", value = "邮箱地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "password", value = "密码", required = true, dataType = "String")
    })
    @ResponseBody
    @RequestMapping(value = "account/login.shtm",method = RequestMethod.POST)
    public R login(String emailAddress,String password) {
        BusAccount account = busAccountMapper.selectByEmailAddress(emailAddress);
        if(account==null){
            return R.error("账号不存在!");
        }
        if("0".equals(account.getStatus())){
            return R.error("账号未激活!");
        }else if("-1".equals(account.getStatus())){
            return R.error("账号已注销!");
        }else if("-2".equals(account.getStatus())){
            return R.error("账号冻结!");
        }
        String pwd  = passwordHash.toHex(password, account.getSalt());
        BusAccount success = busAccountMapper.selectByEmailAddressAndPassword(emailAddress,pwd);
        if(success==null){
            return R.error().put("msg","密码错误!");
        }
        String token = DigestUtils.md5Hex(account.getEmailAddress()+String.valueOf(System.currentTimeMillis()) + "appService.02154778ke783dad34");
        saveOrUpdateToken(account,token);
        return R.ok().put("msg","登录成功!").put("token",token).put("account",account);
    }

    @SysLogAnnotation(value="用户注销")
    @ApiOperation(value = "用户注销", httpMethod = "POST", notes = "平台用户退出", response = R.class)
    @ApiImplicitParams({ @ApiImplicitParam(paramType="query", name = "emailAddress", value = "邮箱地址", required = true, dataType = "String") })
    @ResponseBody
    @RequestMapping(value = "account/logout.shtm",method = RequestMethod.POST)
    public R logout(String emailAddress) {
        tokenMapper.setTokenUnavailable(emailAddress);
        return R.ok().put("msg","注销成功!");
    }

    @ApiOperation(value = "新增/修改地址信息",notes = "绑定地址相关信息",response = R.class)
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="path", name = "opt", value = "opt为add表示新增;opt为update表示修改", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "addressCode", value = "地址ID", required = false, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "addressType", value = "1-物流地址，2-账单地址", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "firstName", value = "姓", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "lastName", value = "名", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "country", value = "国家", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "province", value = "省;", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "city", value = "城市", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "address", value = "地址1", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "address2", value = "地址2", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "postalCode", value = "邮编", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "phoneNumber", value = "电话号码", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "accountCode", value = "用户ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "bean", value = "(此参数不用)", required = false, dataType = "BusAccountAddress")
    })
    @RequestMapping( path = "account/address/{opt}.shtm",method = RequestMethod.POST)
    @ResponseBody
    public R addNewAddress(@PathVariable(value="opt") String opt,@Param("address") BusAccountAddress address){
        return accountService.addOrUpdateAddress(opt,address);
    }

    @ApiOperation(value = "地址获取（物流地址、账单地址）",notes = "根据用户账号获取其相关地址信息",response = R.class)
    @ApiImplicitParams({@ApiImplicitParam(paramType="query", name = "accountCode", value = "用户ID", required = true, dataType = "Integer"),
                        @ApiImplicitParam(paramType="query", name = "addressType", value = "地址类型，1-物流地址，2-账单地址", required = true, dataType = "Integer") })
    @RequestMapping( path = "account/getAddress.shtm",method = RequestMethod.POST)
    @ResponseBody
    public R getAddressList(@Param("accountCode") Integer accountCode,
                            @Param("addressType") Integer addressType){
        BusAccountAddressExample example = new BusAccountAddressExample();
        BusAccountAddressExample.Criteria criteria = example.createCriteria();
        criteria.andAccountCodeEqualTo(accountCode);
        criteria.andAddressTypeEqualTo(addressType);
        //criteria.andDefaultUsedEqualTo(1);//默认地址
        List< BusAccountAddress> list = addressMapper.selectByExample(example);
        return R.ok("成功").put("data",list);
    }

    @ApiOperation(value = "用户详情信息获取",notes = "根据用户ID获取详情信息",response = R.class)
    @ApiImplicitParams({@ApiImplicitParam(paramType="query", name = "accountCode", value = "用户ID", required = true, dataType = "Integer") })
    @RequestMapping( path = "account/profile.shtm",method = RequestMethod.GET)
    @ResponseBody
    public R getAccountProfile(@Param("accountCode") Integer accountCode){
        BusAccount account = busAccountMapper.selectByPrimaryKey(accountCode);
        return R.ok().put("profile",account);
    }
//
//    @ApiOperation(value = "购买记录",notes = "根据用户ID获取购买记录",response = R.class)
//    @ApiImplicitParams({@ApiImplicitParam(paramType="query", name = "accountCode", value = "用户ID", required = true, dataType = "Integer") })
//    @RequestMapping( path = "account/buying.shtm",method = RequestMethod.GET)
//    @ResponseBody
//    public R buying(@Param("accountCode") Integer accountCode){
//        BusOrderExample example = new BusOrderExample();
//        BusOrderExample.Criteria criteria = example.createCriteria();
//        criteria.andOrderTypeEqualTo("buy");
//        criteria.andBuyerEqualTo(accountCode);
//        List<BusOrder> list = busOrderMapper.selectByExample(example);
//        List<A1> a1list =list.stream().map(temp -> {
//            A1 a1 = new A1(temp.getCommodity().getCommodityName(),
//                    temp.getCommodity().getColor(),
//                    temp.getSizeName(),
//                    temp.getProgress());
//            return a1;
//        }).collect(Collectors.toList());
//        List<A1> current = a1list.stream().filter(
//                a1 -> ("1".equals(a1.getProgress())||"4".equals(a1.getProgress())||"5".equals(a1.getProgress())||"8".equals(a1.getProgress()))
//        ).collect(Collectors.toList());
//        List<A1> pending = a1list.stream().filter(
//                a1 -> ("0".equals(a1.getProgress())||"2".equals(a1.getProgress())||"3".equals(a1.getProgress())||"6".equals(a1.getProgress())||"7".equals(a1.getProgress()))
//        ).collect(Collectors.toList());
//        List<A1> history = a1list.stream().filter(
//                a1 -> ("8".equals(a1.getProgress()))
//        ).collect(Collectors.toList());
//        return R.ok("成功").put("current",current).put("pending",pending).put("history",history);
//    }

    @ApiOperation(value = "购买记录/出售记录",notes = "根据用户ID获取出售记录",httpMethod = "POST",response = A1.class)
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "params", value = "(此参数不用)", required = false, dataType = "Map"),
            @ApiImplicitParam(paramType="path", name = "opt", value = "opt为selling表示出售记录;opt为buying表示购买记录", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "accountCode", value = "用户ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "pageNum", value = "第几页", required = true, dataType = "integer"),
            @ApiImplicitParam(paramType="query", name = "pageSize", value = "每页多少条数据", required = true, dataType = "integer"),
            @ApiImplicitParam(paramType="query", name = "type", value = "current/pending/history", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "orderByName", value = "按名称排序:CommodityName desc-名称倒序;CommodityName-名称正序;", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "orderByStatus", value = "按状态排序:Progress desc-状态倒序;Progress-状态正序;", required = false, dataType = "String")
    })
    @RequestMapping( path = "account/trade/{opt}.shtm",method = RequestMethod.POST)
    @ResponseBody
    public Result selling(@PathVariable(value="opt") String opt,@RequestParam Map<String, Object> params){
        Integer accountCode = Integer.parseInt(params.get("accountCode").toString());
        Integer pageNum = Integer.parseInt(params.get("pageNum").toString());
        Integer pageSize = Integer.parseInt(params.get("pageSize").toString());
        BusOrderExample example = new BusOrderExample();
        BusOrderExample.Criteria criteria1 = example.createCriteria();
        BusOrderExample.Criteria criteria2 = example.createCriteria();
        if("selling".equals(opt)){
            criteria1.andOrderTypeEqualTo("sell");
            criteria1.andSellerEqualTo(accountCode);//出售人
            criteria2.andAvailableSellersInclude(accountCode);
            criteria2.andProgressIn(Arrays.asList("11"));//购买订单已支付,确认出售
            example.or(criteria2);
        }else if("buying".equals(opt)){
            criteria1.andOrderTypeEqualTo("buy");
            criteria1.andBuyerEqualTo(accountCode);//购买人
            criteria2.andAvailableBuyersInclude(accountCode);
            criteria2.andProgressIn(Arrays.asList("0"));//出售订单已下单,确认购买
            example.or(criteria2);
        }else{
            return ResultUtil.error(400,"opt参数错误");
        }
        if(params.get("type")!=null&&!"".equals(params.get("type"))){
            if("current".equals(params.get("type").toString())){
                criteria1.andProgressIn(Arrays.asList("1","4","5","11"));
            }
            if("pending".equals(params.get("type").toString())){
                criteria1.andProgressIn(Arrays.asList("0","2","3","6","7"));
            }
            if("history".equals(params.get("type").toString())){
                criteria1.andProgressIn(Arrays.asList("8"));
            }
        }
        if(params.get("orderByName")!=null&&!"".equals(params.get("orderByName"))){
            example.setOrderByClause(params.get("orderByName").toString());
        }
        if(params.get("orderByStatus")!=null&&!"".equals(params.get("orderByStatus"))){
            example.setOrderByClause(params.get("orderByStatus").toString());
        }
        PageHelper.startPage(pageNum,pageSize);
        List<BusOrder> list = busOrderMapper.selectByExample(example);
        PageInfo<BusOrder> pageInfo = new PageInfo<>(list);
        List<A1> a1list =list.stream().map(temp -> {
            A1 a1 = new A1(temp.getOrderCode(),temp.getCommodity().getCommodityName(),
                    temp.getCommodity().getColor(),
                    temp.getSizeName(),
                    temp.getProgress());
            return a1;
        }).collect(Collectors.toList());
        int page_size = pageInfo.getPageSize();
        int currentPage = pageInfo.getPageNum();
        long total = pageInfo.getTotal();
        return ResultUtil.success(total, currentPage,page_size, a1list);
    }

    @ApiOperation(value = "关注商品列表",notes = "根据用户ID获取关注商品列表",response = Following.class)
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "pageNum", value = "第几页", required = true, dataType = "integer"),
            @ApiImplicitParam(paramType="query", name = "pageSize", value = "每页多少条数据", required = true, dataType = "integer"),
            @ApiImplicitParam(paramType="query", name = "accountCode", value = "用户ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "orderByName", value = "ITEM排序;降序：bc.CommodityName DESC;降序：bc.CommodityName DESC", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "orderByLowestAsk", value = "lowest ask排序;降序：bcs.LowestAsk DESC;降序：bcs.LowestAsk", required = false, dataType = "String")
     })
    @RequestMapping( path = "account/following.shtm",method = RequestMethod.POST)
    @ResponseBody
    public Result following(@Param("pageNum") Integer pageNum,
                       @Param("pageSize") Integer pageSize,
                       @Param("accountCode") Integer accountCode,
                       @Param("orderByName") String orderByName,
                       @Param("orderByLowestAsk") String orderByLowestAsk){
        RelAccountCommodityFollowingExample example = new RelAccountCommodityFollowingExample();
        RelAccountCommodityFollowingExample.Criteria criteria = example.createCriteria();
        criteria.andAccountCodeEqualTo(accountCode);
        if(orderByLowestAsk!=null){
            example.setOrderByClause(orderByLowestAsk);
        }
        if(orderByLowestAsk!=null){
            example.setOrderByClause(orderByLowestAsk);
        }
        PageHelper.startPage(pageNum,pageSize);
        List<RelAccountCommodityFollowing> list = followingMapper.selectByExample(example);
        PageInfo<RelAccountCommodityFollowing> pageInfo = new PageInfo<>(list);
        List<Following> followings =list.stream().map(temp -> {
            Following f = new Following(
                    temp.getCommoditySize().getCommondityCode(),
                    temp.getCommoditySize().getCommodity().getCommodityName(),
                    temp.getCommoditySize().getCommodity().getColor(),
                    temp.getCommoditySize().getSizeName(),
                    temp.getCommoditySize().getLowestAsk());
            if(temp.getCommoditySize().getCommodity().getPicture()!=null){
                f.setPicture(http+temp.getCommoditySize().getCommodity().getPicture().split(";")[0]);
            }
            return f;
        }).collect(Collectors.toList());
        int page_size = pageInfo.getPageSize();
        int currentPage = pageInfo.getPageNum();
        long total = pageInfo.getTotal();
        return ResultUtil.success(total, currentPage,page_size, followings);
    }



    private String saveOrUpdateToken(BusAccount account,String token){
        Date now = new Date();
        BusAccountToken accountToken = tokenMapper.getTokenByEmail(account.getEmailAddress());
        if(accountToken != null){
            accountToken.setAccountCode(account.getAccountCode());
            accountToken.setEmailAddress(account.getEmailAddress());
            accountToken.setToken(token);
            accountToken.setLastUpdateTime(now);
            accountToken.setExpireTime(DateUtils.plusDays(now,7));//默认 7天过期时间
            accountToken.setStatus("1");
            tokenMapper.updateByPrimaryKeySelective(accountToken);
        }else{
            accountToken = new BusAccountToken();
            accountToken.setAccountCode(account.getAccountCode());
            accountToken.setEmailAddress(account.getEmailAddress());
            accountToken.setToken(token);
            accountToken.setCreateTime(now);
            accountToken.setLastUpdateTime(now);
            accountToken.setExpireTime(DateUtils.plusDays(now,7));//默认 7天过期时间
            accountToken.setStatus("1");
            tokenMapper.insertSelective(accountToken);
        }
        return token;
    }
}