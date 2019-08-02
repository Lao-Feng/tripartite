package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.BusAccountPasswordForget;
import com.teamax.alleyoop.entity.BusAccountPasswordForgetExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BusAccountPasswordForgetMapper {
    long countByExample(BusAccountPasswordForgetExample example);

    int deleteByExample(BusAccountPasswordForgetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusAccountPasswordForget record);

    int insertSelective(BusAccountPasswordForget record);

    List<BusAccountPasswordForget> selectByExample(BusAccountPasswordForgetExample example);

    BusAccountPasswordForget selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusAccountPasswordForget record, @Param("example") BusAccountPasswordForgetExample example);

    int updateByExample(@Param("record") BusAccountPasswordForget record, @Param("example") BusAccountPasswordForgetExample example);

    int updateByPrimaryKeySelective(BusAccountPasswordForget record);

    int updateByPrimaryKey(BusAccountPasswordForget record);

    @Select("select * from bus_account_password_forget where Email = #{email}")
    BusAccountPasswordForget getVerifyCodeByEmail(@Param("email") String email);
}