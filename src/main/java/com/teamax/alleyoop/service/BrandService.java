package com.teamax.alleyoop.service;


import java.util.Map;

public interface BrandService {

    /**
     * 批量删除品牌信息,包括旗下系列
     * @param params
     * @return
     */
    int deleteBatch(Map<String, Object> params);
}