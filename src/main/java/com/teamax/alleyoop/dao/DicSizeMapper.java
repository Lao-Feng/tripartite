package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.DicSize;
import com.teamax.alleyoop.entity.DicSizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DicSizeMapper {
    long countByExample(DicSizeExample example);

    int deleteByExample(DicSizeExample example);

    int deleteByPrimaryKey(Integer sizeCode);

    int insert(DicSize record);

    int insertSelective(DicSize record);

    List<DicSize> selectByExample(DicSizeExample example);

    DicSize selectByPrimaryKey(Integer sizeCode);

    int updateByExampleSelective(@Param("record") DicSize record, @Param("example") DicSizeExample example);

    int updateByExample(@Param("record") DicSize record, @Param("example") DicSizeExample example);

    int updateByPrimaryKeySelective(DicSize record);

    int updateByPrimaryKey(DicSize record);

    @Select("select ifNull(max(SizeIndex)+1,0) from dic_size where CommondityType = #{category}")
    int getNextIndex(@Param("category")String category);

    @Select("select * from `dic_size` where `CommondityType` = #{category} ")
    List<DicSize> getSizeListByCategory(@Param("category")String category);
}