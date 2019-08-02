package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.BusAccountAddress;
import com.teamax.alleyoop.entity.BusAccountAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BusAccountAddressMapper {
    long countByExample(BusAccountAddressExample example);

    int deleteByExample(BusAccountAddressExample example);

    int deleteByPrimaryKey(Integer addressCode);

    int insert(BusAccountAddress record);

    int insertSelective(BusAccountAddress record);

    List<BusAccountAddress> selectByExample(BusAccountAddressExample example);

    BusAccountAddress selectByPrimaryKey(Integer addressCode);

    int updateByExampleSelective(@Param("record") BusAccountAddress record, @Param("example") BusAccountAddressExample example);

    int updateByExample(@Param("record") BusAccountAddress record, @Param("example") BusAccountAddressExample example);

    int updateByPrimaryKeySelective(BusAccountAddress record);

    int updateByPrimaryKey(BusAccountAddress record);
}