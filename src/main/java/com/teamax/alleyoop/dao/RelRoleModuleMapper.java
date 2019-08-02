package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.RelRoleModule;
import com.teamax.alleyoop.entity.RelRoleModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RelRoleModuleMapper {
    long countByExample(RelRoleModuleExample example);

    int deleteByExample(RelRoleModuleExample example);

    int deleteByPrimaryKey(Integer code);

    int insert(RelRoleModule record);

    int insertSelective(RelRoleModule record);

    List<RelRoleModule> selectByExample(RelRoleModuleExample example);

    RelRoleModule selectByPrimaryKey(Integer code);

    int updateByExampleSelective(@Param("record") RelRoleModule record, @Param("example") RelRoleModuleExample example);

    int updateByExample(@Param("record") RelRoleModule record, @Param("example") RelRoleModuleExample example);

    int updateByPrimaryKeySelective(RelRoleModule record);

    int updateByPrimaryKey(RelRoleModule record);
}