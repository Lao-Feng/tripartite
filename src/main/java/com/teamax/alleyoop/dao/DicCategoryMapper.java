package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.DicCategory;
import com.teamax.alleyoop.entity.DicCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DicCategoryMapper {
    long countByExample(DicCategoryExample example);

    int deleteByExample(DicCategoryExample example);

    int deleteByPrimaryKey(Integer categoryCode);

    int insert(DicCategory record);

    int insertSelective(DicCategory record);

    List<DicCategory> selectByExample(DicCategoryExample example);

    DicCategory selectByPrimaryKey(Integer categoryCode);

    int updateByExampleSelective(@Param("record") DicCategory record, @Param("example") DicCategoryExample example);

    int updateByExample(@Param("record") DicCategory record, @Param("example") DicCategoryExample example);

    int updateByPrimaryKeySelective(DicCategory record);

    int updateByPrimaryKey(DicCategory record);
}