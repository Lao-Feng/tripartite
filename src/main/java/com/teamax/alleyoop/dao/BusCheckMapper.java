package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.BusCheck;
import com.teamax.alleyoop.entity.BusCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BusCheckMapper {
    long countByExample(BusCheckExample example);

    int deleteByExample(BusCheckExample example);

    int deleteByPrimaryKey(Integer checkCode);

    int insert(BusCheck record);

    int insertSelective(BusCheck record);

    List<BusCheck> selectByExample(BusCheckExample example);

    BusCheck selectByPrimaryKey(Integer checkCode);

    int updateByExampleSelective(@Param("record") BusCheck record, @Param("example") BusCheckExample example);

    int updateByExample(@Param("record") BusCheck record, @Param("example") BusCheckExample example);

    int updateByPrimaryKeySelective(BusCheck record);

    int updateByPrimaryKey(BusCheck record);

    @Update("UPDATE `bus_check` SET `Pictures` = REPLACE (`Pictures`,#{picture}, '') WHERE CheckCode = #{checkCode}")
    int deletePic(@Param("checkCode") Integer checkCode,@Param("picture") String picture);

    @Update("UPDATE `bus_check` SET `Pictures` = CONCAT(ifNull(`Pictures`,''),#{pictures}) WHERE CheckCode = #{checkCode}")
    int updatePic(@Param("checkCode") Integer checkCode,@Param("pictures") String pictures);
}