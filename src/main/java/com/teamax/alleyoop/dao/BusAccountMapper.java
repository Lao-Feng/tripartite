package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.A2;
import com.teamax.alleyoop.entity.BusAccount;
import com.teamax.alleyoop.entity.BusAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BusAccountMapper {
    long countByExample(BusAccountExample example);

    int deleteByExample(BusAccountExample example);

    int deleteByPrimaryKey(Integer accountCode);

    int insert(BusAccount record);

    int insertSelective(BusAccount record);

    List<BusAccount> selectByExample(BusAccountExample example);

    BusAccount selectByPrimaryKey(Integer accountCode);

    int updateByExampleSelective(@Param("record") BusAccount record, @Param("example") BusAccountExample example);

    int updateByExample(@Param("record") BusAccount record, @Param("example") BusAccountExample example);

    int updateByPrimaryKeySelective(BusAccount record);

    int updateByPrimaryKey(BusAccount record);

    @Select("select * from bus_account where EmailAddress = #{emailAddress}")
    BusAccount selectByEmailAddress(@Param("emailAddress") String emailAddress);

    @Select("select * from bus_account where EmailAddress = #{emailAddress} and AccountCode != #{accountCode}")
    BusAccount selectByEmailAddressOther(@Param("emailAddress") String emailAddress,@Param("accountCode") Integer accountCode);

    @Select("select * from bus_account where EmailAddress = #{emailAddress} and Password = #{password}")
    BusAccount selectByEmailAddressAndPassword(@Param("emailAddress") String emailAddress,@Param("password") String password);

    @Update("UPDATE `bus_account` SET `CommoditySizeFollowing` = CONCAT(ifNull(`CommoditySizeFollowing`,''),#{commoditySizeFollowing}) WHERE AccountCode = #{accountCode}")
    int updateFollowing(@Param("accountCode") Integer accountCode,@Param("commoditySizeFollowing") String commoditySizeFollowing);

    @Update("UPDATE `bus_account` SET `CommoditySizeFollowing` = REPLACE (`CommoditySizeFollowing`,#{commoditySizeFollowing}, '') WHERE AccountCode = #{accountCode}")
    int deleteFollowing(@Param("accountCode") Integer accountCode,@Param("commoditySizeFollowing") String commoditySizeFollowing);

    /**
     * 分类统计商品售卖信息
     * @param accountCode
     * @return
     */
    List<A2> getSellCount(@Param("accountCode") Integer accountCode);
}