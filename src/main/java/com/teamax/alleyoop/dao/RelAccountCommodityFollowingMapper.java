package com.teamax.alleyoop.dao;

import com.teamax.alleyoop.entity.RelAccountCommodityFollowing;
import com.teamax.alleyoop.entity.RelAccountCommodityFollowingExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RelAccountCommodityFollowingMapper {
    long countByExample(RelAccountCommodityFollowingExample example);

    int deleteByExample(RelAccountCommodityFollowingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RelAccountCommodityFollowing record);

    int insertSelective(RelAccountCommodityFollowing record);

    List<RelAccountCommodityFollowing> selectByExample(RelAccountCommodityFollowingExample example);

    RelAccountCommodityFollowing selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RelAccountCommodityFollowing record, @Param("example") RelAccountCommodityFollowingExample example);

    int updateByExample(@Param("record") RelAccountCommodityFollowing record, @Param("example") RelAccountCommodityFollowingExample example);

    int updateByPrimaryKeySelective(RelAccountCommodityFollowing record);

    int updateByPrimaryKey(RelAccountCommodityFollowing record);
}