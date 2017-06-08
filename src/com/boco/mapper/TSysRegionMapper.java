package com.boco.mapper;

import com.boco.po.TSysRegion;
import com.boco.po.TSysRegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysRegionMapper {
    int countByExample(TSysRegionExample example);

    int deleteByExample(TSysRegionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TSysRegion record);

    int insertSelective(TSysRegion record);

    List<TSysRegion> selectByExample(TSysRegionExample example);

    TSysRegion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TSysRegion record, @Param("example") TSysRegionExample example);

    int updateByExample(@Param("record") TSysRegion record, @Param("example") TSysRegionExample example);

    int updateByPrimaryKeySelective(TSysRegion record);

    int updateByPrimaryKey(TSysRegion record);
}