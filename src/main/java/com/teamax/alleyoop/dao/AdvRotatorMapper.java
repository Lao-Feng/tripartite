package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.AdvRotator;
import com.teamax.alleyoop.entity.AdvRotatorExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AdvRotatorMapper {
    long countByExample(AdvRotatorExample example);

    int deleteByExample(AdvRotatorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdvRotator record);

    int insertSelective(AdvRotator record);

    List<AdvRotator> selectByExample(AdvRotatorExample example);

    AdvRotator selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdvRotator record, @Param("example") AdvRotatorExample example);

    int updateByExample(@Param("record") AdvRotator record, @Param("example") AdvRotatorExample example);

    int updateByPrimaryKeySelective(AdvRotator record);

    int updateByPrimaryKey(AdvRotator record);

    @Update("UPDATE `adv_rotator` SET `Picture` = CONCAT(ifNull(`picture`,''),#{pictures}) WHERE Id = #{id}")
    int updatePic(@Param("id") Integer id,@Param("pictures") String pictures);

    @Update("UPDATE `adv_rotator` SET `Picture` = REPLACE (`Picture`,#{picture}, '') WHERE Id = #{id}")
    int deletePic(@Param("id") Integer id,@Param("picture") String picture);
}