package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.DicCurrency;
import com.teamax.alleyoop.entity.DicCurrencyExample;
import org.springframework.stereotype.Repository;

/**
 * DicCurrencyMapper继承基类
 */
@Repository
public interface DicCurrencyMapper extends MyBatisBaseDao<DicCurrency, Integer, DicCurrencyExample> {
}