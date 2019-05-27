package com.xa.mapper;

import com.xa.pojo.Phwoker;
import com.xa.pojo.PhwokerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhwokerMapper {
    int countByExample(PhwokerExample example);

    int deleteByExample(PhwokerExample example);

    int deleteByPrimaryKey(Integer wid);

    int insert(Phwoker record);

    int insertSelective(Phwoker record);

    List<Phwoker> selectByExample(PhwokerExample example);

    Phwoker selectByPrimaryKey(Integer wid);

    int updateByExampleSelective(@Param("record") Phwoker record, @Param("example") PhwokerExample example);

    int updateByExample(@Param("record") Phwoker record, @Param("example") PhwokerExample example);

    int updateByPrimaryKeySelective(Phwoker record);

    int updateByPrimaryKey(Phwoker record);
}