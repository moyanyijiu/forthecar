package com.xa.mapper;

import com.xa.pojo.Phservice;
import com.xa.pojo.PhserviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhserviceMapper {
    int countByExample(PhserviceExample example);

    int deleteByExample(PhserviceExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Phservice record);

    int insertSelective(Phservice record);

    List<Phservice> selectByExample(PhserviceExample example);

    Phservice selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Phservice record, @Param("example") PhserviceExample example);

    int updateByExample(@Param("record") Phservice record, @Param("example") PhserviceExample example);

    int updateByPrimaryKeySelective(Phservice record);

    int updateByPrimaryKey(Phservice record);
}