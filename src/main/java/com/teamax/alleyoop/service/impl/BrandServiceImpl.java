package com.teamax.alleyoop.service.impl;

import com.teamax.alleyoop.dao.DicBrandMapper;
import com.teamax.alleyoop.dao.DicSeriesMapper;
import com.teamax.alleyoop.entity.DicBrandExample;
import com.teamax.alleyoop.entity.DicSeries;
import com.teamax.alleyoop.entity.DicSeriesExample;
import com.teamax.alleyoop.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service("brandService")
public class BrandServiceImpl implements BrandService {

    @Autowired
    private DicBrandMapper dicBrandMapper;
    @Autowired
    private DicSeriesMapper dicSeriesMapper;

    @Override
    @Transactional
    public int deleteBatch(Map<String, Object> params) {
        //删除品牌
        String ids = (String)params.get("brandIds");
        if(ids!=null&&!"".equals(ids)){
            List<Integer> list = new ArrayList<>();
            String [] strs = ids.split(",");
            for(String id : strs){
                list.add(new Integer(id));
            }
            DicBrandExample example = new DicBrandExample();
            DicBrandExample.Criteria criteria = example.createCriteria();
            criteria.andBrandCodeIn(list);
            dicBrandMapper.deleteByExample(example);
        }
        //删除系列
        String ids2 = (String)params.get("seriesIds");
        if(ids2!=null&&!"".equals(ids2)){
            List<Integer> list2 = new ArrayList<>();
            String [] strs2 = ids2.split(",");
            for(String id : strs2){
                list2.add(new Integer(id));
            }
            DicSeriesExample example2 = new DicSeriesExample();
            DicSeriesExample.Criteria criteria2 = example2.createCriteria();
            criteria2.andSeriesCodeIn(list2);
            dicSeriesMapper.deleteByExample(example2);
        }
        return 1;
    }
}
