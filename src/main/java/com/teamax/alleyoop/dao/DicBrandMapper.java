package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.A;
import com.teamax.alleyoop.entity.DicBrand;
import com.teamax.alleyoop.entity.DicBrandExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface DicBrandMapper {
    long countByExample(DicBrandExample example);

    int deleteByExample(DicBrandExample example);

    int deleteByPrimaryKey(Integer brandCode);

    int insert(DicBrand record);

    int insertSelective(DicBrand record);

    List<DicBrand> selectByExample(DicBrandExample example);

    DicBrand selectByPrimaryKey(Integer brandCode);

    int updateByExampleSelective(@Param("record") DicBrand record, @Param("example") DicBrandExample example);

    int updateByExample(@Param("record") DicBrand record, @Param("example") DicBrandExample example);

    int updateByPrimaryKeySelective(DicBrand record);

    int updateByPrimaryKey(DicBrand record);

    List<DicBrand> getMostPopularBrand(Integer category);

    /**
     * 获取品牌列表
     * @param params
     * @return
     */
    List<A> getBrandList(Map<String,Object> params);

    /**
     * 获取品牌下所有系列
     * @param brands
     * @return
     */
    List<A> getSeriesInBrand(@Param("brands")List<A> brands );

    @Update("UPDATE `dic_brand` SET `Picture01` = CONCAT(ifNull(`Picture01`,''),#{pictures}) WHERE BrandCode = #{brandCode}")
    int updatePic(@Param("brandCode") Integer brandCode,@Param("pictures") String pictures);

    @Update("UPDATE `dic_brand` SET `Picture01` = REPLACE (`Picture01`,#{picture}, '') WHERE BrandCode = #{brandCode}")
    int deletePic(@Param("brandCode") Integer brandCode,@Param("picture") String picture);

    @Select("select * from `dic_brand` where `CategoryCode`=#{category}")
    List<DicBrand> getBrandListByCategory(@Param("category")Integer category);
}