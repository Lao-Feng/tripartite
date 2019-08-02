package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.BusAccount;
import com.teamax.alleyoop.entity.BusAccountToken;
import com.teamax.alleyoop.entity.BusAccountTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BusAccountTokenMapper {
    long countByExample(BusAccountTokenExample example);

    int deleteByExample(BusAccountTokenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusAccountToken record);

    int insertSelective(BusAccountToken record);

    List<BusAccountToken> selectByExample(BusAccountTokenExample example);

    BusAccountToken selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusAccountToken record, @Param("example") BusAccountTokenExample example);

    int updateByExample(@Param("record") BusAccountToken record, @Param("example") BusAccountTokenExample example);

    int updateByPrimaryKeySelective(BusAccountToken record);

    int updateByPrimaryKey(BusAccountToken record);

    @Select("select * from bus_account_token where EmailAddress = #{email}")
    BusAccountToken getTokenByEmail(@Param("email")String email);

    @Select("select * from bus_account_token where AccountCode = #{accountCode} and Token = #{token} and Status = 1")
    BusAccountToken isTokenAvailable(@Param("accountCode")Integer accountCode,@Param("token")String token);

    @Update("update bus_account_token set Status = 0 where EmailAddress = #{email}")
    int setTokenUnavailable(@Param("email")String email);
}