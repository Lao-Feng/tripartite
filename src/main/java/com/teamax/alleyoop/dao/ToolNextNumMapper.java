package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.ToolNextNum;
import com.teamax.alleyoop.entity.ToolNextNumExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ToolNextNumMapper {
    long countByExample(ToolNextNumExample example);

    int deleteByExample(ToolNextNumExample example);

    int deleteByPrimaryKey(String name);

    int insert(ToolNextNum record);

    int insertSelective(ToolNextNum record);

    List<ToolNextNum> selectByExample(ToolNextNumExample example);

    ToolNextNum selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") ToolNextNum record, @Param("example") ToolNextNumExample example);

    int updateByExample(@Param("record") ToolNextNum record, @Param("example") ToolNextNumExample example);

    int updateByPrimaryKeySelective(ToolNextNum record);

    int updateByPrimaryKey(ToolNextNum record);

    @Select("select next_num(#{name})")
    Integer getNextNum(@Param("name")String name);
}