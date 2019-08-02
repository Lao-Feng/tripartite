package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.DicItem;
import com.teamax.alleyoop.entity.DicItemExample;
import org.springframework.stereotype.Repository;

/**
 * DicItemMapper继承基类
 */
@Repository
public interface DicItemMapper extends MyBatisBaseDao<DicItem, Integer, DicItemExample> {
}