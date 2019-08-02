package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.SysUser;
import com.teamax.alleyoop.entity.SysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface SysUserMapper {
    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    SysUser getSysUserByLoginName(@Param("loginName")String loginName);

    @Select("select * from sys_user where LoginName = #{loginName} and UserId != #{userId}")
    SysUser getSysUserByLoginNameOther(@Param("loginName")String loginName,@Param("userId")Integer userId);

    @Update("update sys_user set Password = #{password},Salt = #{salt} where UserId = #{userId}")
    int updatePassword(@Param("userId") Integer userId,@Param("password") String password,@Param("salt") String salt);
}