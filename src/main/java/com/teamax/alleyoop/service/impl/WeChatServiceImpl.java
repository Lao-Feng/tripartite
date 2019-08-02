package com.teamax.alleyoop.service.impl;

import com.teamax.alleyoop.common.util.JsonResult;
import com.teamax.alleyoop.common.wechat.AccessToken;
import com.teamax.alleyoop.common.wechat.WeChatUser;
import com.teamax.alleyoop.common.wechat.WeChatUtils;
import com.teamax.alleyoop.dao.HdPubMemberThirdAuthMapper;
import com.teamax.alleyoop.dao.SysUserMapper;
import com.teamax.alleyoop.dao.SysUserThirdAuthMapper;
import com.teamax.alleyoop.entity.HdPubMemberThirdAuthEntity;
import com.teamax.alleyoop.entity.SysUserEntity;
import com.teamax.alleyoop.entity.SysUserThirdAuthEntity;
import com.teamax.alleyoop.service.WeChatService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;

/**
 * @ClassName: WeChatServiceImpl
 * @Description: TODO
 * @Author DingDaWei
 * @date 2018/7/1710:07
 * @Version 1.0.0
 */
@Service
public class WeChatServiceImpl implements WeChatService {

    @Autowired
    private HdPubMemberThirdAuthMapper hdPubMemberThirdAuthMapper;

    @Autowired
    private SysUserThirdAuthMapper sysUserThirdAuthMapper;

    @Autowired
    private SysUserMapper sysUserMapper;


    @Override
    public JsonResult appWXLogin(HttpServletRequest request, String code) {
        //创建一个统一返回对象
        JsonResult jsonResult = new JsonResult();
        //根据code向微信服务器发送请求,获取返回参数
        AccessToken accessToken = WeChatUtils.getAccessToken(code);
        //判断微信服务器返回的access_token是否为空
        if (StringUtils.isNotEmpty(accessToken.getAccess_token())) {
            //根据微信服务器返回的openid,查询第三方授权信息表
            HdPubMemberThirdAuthEntity hdPubMemberThirdAuthEntity = hdPubMemberThirdAuthMapper.findEntityByOpenId(accessToken.getOpenid());
            //判断第三方授权信息 为空 (新用户)
            if (ObjectUtils.isEmpty(hdPubMemberThirdAuthEntity)) {
                //将微信服务器返回的accessToken类存入session
                request.getSession().setAttribute("accessToken",accessToken);
                //返回
                jsonResult.setMsg("微信授权成功，请输入手机号注册！");
                jsonResult.setStatus(1);
                jsonResult.setData(null);
                return jsonResult;
            } else {  //不为空 (已注册用户)
                //根据access_token和openid向微信服务器发送请求,获取微信用户信息
                WeChatUser weChatUserInfo = WeChatUtils.getWeChatUserInfo(accessToken.getAccess_token(), accessToken.getOpenid());
                //根据返回的weChatUserInfo中的openid,判断'微信用户信息'是否成功获取
                if (!ObjectUtils.isEmpty(weChatUserInfo.getOpenid())) {
                    /*
                    HdPubMember hdPubMember = new HdPubMember();
                    //微信昵称
                    hdPubMember.setNickname(weChatUserInfo.getNickname());
                    int sex = Integer.parseInt(weChatUserInfo.getSex());
                    //(数据库)性别 1男 0女
                    hdPubMember.setSex(sex == 1 ? sex : 0);
                    //微信头像
                    hdPubMember.setAvatar(weChatUserInfo.getHeadimgurl());
                    //更新微信用户信息
                    hdPubMemberMapper.updateByPrimaryKeySelective(hdPubMember);
                    HashMap<String, Object> map = new HashMap<>();
                    map.put("obj",accessToken);
                    //根据openid,更新access_token和expires_in
                    hdPubMemberThirdAuthMapper.updateAccessTokenByMap(map);
                    */
                    //返回
                    jsonResult.setMsg("微信授权登录成功！");
                    jsonResult.setStatus(1);
                    jsonResult.setData(weChatUserInfo);//返回用户信息
                    return jsonResult;
                } else {
                    jsonResult.setMsg("微信授权登录失败，请重新授权！");
                    jsonResult.setStatus(2);
                    jsonResult.setData(null);
                    return jsonResult;
                }
            }
        } else {
            System.out.println("微信获取token失败:错误编码 >> "+accessToken.getErrcode()+"错误信息 >> "+accessToken.getErrmsg());
            jsonResult.setMsg("微信授权登录失败，请重新授权！");
            jsonResult.setStatus(2);
            jsonResult.setData(null);
            return jsonResult;
        }
    }

    @Override
    public JsonResult appWXRegister(HttpServletRequest request,Long phone) {
        //创建一个统一返回对象
        JsonResult jsonResult = new JsonResult();
        //获取session中的accessToken类
        HttpSession session = request.getSession();
        AccessToken accessToken =(AccessToken) session.getAttribute("accessToken");
        //判断从session中取出的access_token是否为空
        if (!ObjectUtils.isEmpty(accessToken.getAccess_token())) {
            //根据access_token和openid向微信服务器发送请求,获取微信用户信息
            WeChatUser weChatUserInfo = WeChatUtils.getWeChatUserInfo(accessToken.getAccess_token(), accessToken.getOpenid());
            //根据返回的weChatUserInfo中的openid,判断'微信用户信息'是否成功获取
            if (!ObjectUtils.isEmpty(weChatUserInfo.getOpenid())) {
                /*
                HdPubMember hdPubMember = new HdPubMember();
                Long userId = UuidUtil.getUuid();
                hdPubMember.setId(userId);
                //用户名 (第三方注册默认为:用户手机号)
                hdPubMember.setUsername(String.valueOf(phone));
                //密码 (第三方注册默认为:123456)
                hdPubMember.setPassword("123456");
                //是否禁用 0为正常 1为禁用
                hdPubMember.setIsForbidden(0);
                //审核状态 0:未审核 1：审核通过
                hdPubMember.setApproveStatus(0);
                hdPubMember.setLoginNum(0);
                //Salt 值
                hdPubMember.setSalt("");
                hdPubMember.setPhone(phone);
                //昵称
                hdPubMember.setNickname(weChatUserInfo.getNickname());
                int sex = Integer.parseInt(weChatUserInfo.getSex());
                //(数据库)性别 1男 0女
                hdPubMember.setSex(sex == 1 ? sex : 0);
                //微信头像
                hdPubMember.setAvatar(weChatUserInfo.getHeadimgurl());
                //对用户密码进行加密,为用户生成 Salt 值(md5)
                passwordHelper.encryptPassword(hdPubMember);
                //新增用户信息
                hdPubMemberMapper.insertSelective(hdPubMember);
                HdPubMemberThirdAuthEntity hdPubMemberThirdAuthEntity = new HdPubMemberThirdAuthEntity();
                hdPubMemberThirdAuthEntity.setUserId(userId);
                hdPubMemberThirdAuthEntity.setOauthKey(Long.parseLong(accessToken.getOpenid()));
                hdPubMemberThirdAuthEntity.setOauthName("微信");
                hdPubMemberThirdAuthEntity.setOauthAccessToken(accessToken.getAccess_token());
                hdPubMemberThirdAuthEntity.setOauthTokenExpires(accessToken.getExpires_in());
                //根据用户id,新增第三方授权信息
                hdPubMemberThirdAuthMapper.createHdPubMemberThirdAuth(hdPubMemberThirdAuthEntity);
                */
                jsonResult.setMsg("微信授权注册成功！");
                jsonResult.setStatus(1);
                jsonResult.setData(null);
                return jsonResult;
            } else {
                System.out.println("微信用户信息获取失败:错误编码 >> "+weChatUserInfo.getErrcode()+"。错误信息 >> "+weChatUserInfo.getErrmsg());
                jsonResult.setMsg("微信授权注册失败，请重新授权！");
                jsonResult.setStatus(2);
                jsonResult.setData(null);
                return jsonResult;
            }
        } else {
            jsonResult.setMsg("微信授权注册失败，请重新授权！");
            jsonResult.setStatus(2);
            jsonResult.setData(null);
            return jsonResult;
        }
    }

    @Override
    public JsonResult webWXLink(HttpServletRequest request) {
        //创建一个统一返回对象
        JsonResult jsonResult = new JsonResult();
        return jsonResult;
    }

    @Override
    public JsonResult webWXLogin(HttpServletRequest request) {
        //创建一个统一返回对象
        JsonResult jsonResult = new JsonResult();
        return jsonResult;
    }

    @Override
    public JsonResult webWXRegister(HttpServletRequest request, String phone) {
        //创建一个统一返回对象
        JsonResult jsonResult = new JsonResult();
        return jsonResult;
    }
}
