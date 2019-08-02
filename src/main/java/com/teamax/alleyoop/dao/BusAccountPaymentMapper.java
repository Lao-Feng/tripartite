package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.BusAccountPayment;
import com.teamax.alleyoop.entity.BusAccountPaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BusAccountPaymentMapper {
    long countByExample(BusAccountPaymentExample example);

    int deleteByExample(BusAccountPaymentExample example);

    int deleteByPrimaryKey(Integer paymentCode);

    int insert(BusAccountPayment record);

    int insertSelective(BusAccountPayment record);

    List<BusAccountPayment> selectByExample(BusAccountPaymentExample example);

    BusAccountPayment selectByPrimaryKey(Integer paymentCode);

    int updateByExampleSelective(@Param("record") BusAccountPayment record, @Param("example") BusAccountPaymentExample example);

    int updateByExample(@Param("record") BusAccountPayment record, @Param("example") BusAccountPaymentExample example);

    int updateByPrimaryKeySelective(BusAccountPayment record);

    int updateByPrimaryKey(BusAccountPayment record);
}