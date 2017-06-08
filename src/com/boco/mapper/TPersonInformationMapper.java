package com.boco.mapper;

import com.boco.po.TPersonInformation;
import com.boco.po.TPersonInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPersonInformationMapper {
    int countByExample(TPersonInformationExample example);

    int deleteByExample(TPersonInformationExample example);

    int deleteByPrimaryKey(String personId);

    int insert(TPersonInformation record);

    int insertSelective(TPersonInformation record);

    List<TPersonInformation> selectByExample(TPersonInformationExample example);

    TPersonInformation selectByPrimaryKey(String personId);

    int updateByExampleSelective(@Param("record") TPersonInformation record, @Param("example") TPersonInformationExample example);

    int updateByExample(@Param("record") TPersonInformation record, @Param("example") TPersonInformationExample example);

    int updateByPrimaryKeySelective(TPersonInformation record);

    int updateByPrimaryKey(TPersonInformation record);
}