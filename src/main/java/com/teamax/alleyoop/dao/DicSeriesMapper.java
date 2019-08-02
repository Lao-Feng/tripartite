package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.DicSeries;
import com.teamax.alleyoop.entity.DicSeriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DicSeriesMapper {
    long countByExample(DicSeriesExample example);

    int deleteByExample(DicSeriesExample example);

    int deleteByPrimaryKey(Integer seriesCode);

    int insert(DicSeries record);

    int insertSelective(DicSeries record);

    List<DicSeries> selectByExample(DicSeriesExample example);

    DicSeries selectByPrimaryKey(Integer seriesCode);

    int updateByExampleSelective(@Param("record") DicSeries record, @Param("example") DicSeriesExample example);

    int updateByExample(@Param("record") DicSeries record, @Param("example") DicSeriesExample example);

    int updateByPrimaryKeySelective(DicSeries record);

    int updateByPrimaryKey(DicSeries record);

    @Select("select * from `dic_series` where `BrandCode`=#{brand}")
    List<DicSeries> getSeriesListByBrand(@Param("brand")Integer brand);
}