package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.HdPubMemberThirdAuthEntity;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;

public interface HdPubMemberThirdAuthMapper {

    /**
     * 根据微信服务器返回的openid,查询第三方授权信息表
     * @param openid
     * @return
     */
    HdPubMemberThirdAuthEntity findEntityByOpenId(@Param("openid") String openid);

    /**
     * 根据用户id,新增第三方授权信息
     * @param hdPubMemberThirdAuthEntity
     */
    void createHdPubMemberThirdAuth(HdPubMemberThirdAuthEntity hdPubMemberThirdAuthEntity);

    /**
     * 根据openid,更新access_token和expires_in
     * @param map
     */
    void updateAccessTokenByMap(HashMap<String, Object> map);
}
