package com.teamax.alleyoop.service.runnable;

import com.teamax.alleyoop.dao.BusCommondityMapper;
import com.teamax.alleyoop.dao.BusCommonditySortingMapper;
import com.teamax.alleyoop.dao.BusOrderMapper;
import com.teamax.alleyoop.entity.BusCommondity;
import com.teamax.alleyoop.entity.BusCommondityExample;
import com.teamax.alleyoop.entity.BusCommonditySorting;
import com.teamax.alleyoop.entity.BusCommonditySortingExample;

import java.util.List;

public class CommoditySoldStatisticsRunnable implements Runnable{
    private BusCommondityMapper commodityMapper;
    private BusOrderMapper orderMapper;
    private BusCommonditySortingMapper sortingMapper;

    public CommoditySoldStatisticsRunnable(BusCommondityMapper commodityMapper,BusOrderMapper orderMapper,BusCommonditySortingMapper sortingMapper) {
        this.commodityMapper = commodityMapper;
        this.orderMapper = orderMapper;
        this.sortingMapper = sortingMapper;
    }

    @Override
    public void run() {
        BusCommondityExample example = new BusCommondityExample();
        BusCommondityExample.Criteria criteria = example.createCriteria();
        List<BusCommondity> list = commodityMapper.selectByExample(example);//所有商品
        for(BusCommondity commondity:list){
            Integer commodityCode = commondity.getCommondityCode();
            Integer MostPopular = orderMapper.getTotalSoldPast(commodityCode,"Over72Hour");
            Integer TotalSold = orderMapper.getTotalSoldPast(commodityCode,"Over12Month");
            Double AverageSalePrice = orderMapper.getAverageSalePricePast(commodityCode,"Over12Month");
            BusCommonditySorting temp = sortingMapper.selectSortingByCommodityCode(commodityCode);
            if(temp!=null){
                temp.setMostPopular(MostPopular);
                temp.setTotalSold(TotalSold);
                temp.setAverageSalePrice(AverageSalePrice);
                sortingMapper.updateByPrimaryKeySelective(temp);
            }else{
                BusCommonditySorting sorting = new BusCommonditySorting();
                sorting.setCommondityCode(commodityCode);
                sorting.setMostPopular(MostPopular);
                sorting.setTotalSold(TotalSold);
                sorting.setAverageSalePrice(AverageSalePrice);
                sortingMapper.insertSelective(sorting);
            }
        }
    }
}
