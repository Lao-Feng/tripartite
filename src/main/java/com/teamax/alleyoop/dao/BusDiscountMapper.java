package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.BusDiscount;
import com.teamax.alleyoop.entity.BusDiscountExample;
import org.springframework.stereotype.Repository;

/**
 * BusDiscountMapper继承基类
 */
@Repository
public interface BusDiscountMapper extends MyBatisBaseDao<BusDiscount, String, BusDiscountExample> {
}