package com.xa.mapper;

import com.xa.pojo.Phlabel;
import com.xa.pojo.PhlabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhlabelMapper {
    int countByExample(PhlabelExample example);

    int deleteByExample(PhlabelExample example);

    int deleteByPrimaryKey(Integer laid);

    int insert(Phlabel record);

    int insertSelective(Phlabel record);

    List<Phlabel> selectByExample(PhlabelExample example);

    Phlabel selectByPrimaryKey(Integer laid);

    int updateByExampleSelective(@Param("record") Phlabel record, @Param("example") PhlabelExample example);

    int updateByExample(@Param("record") Phlabel record, @Param("example") PhlabelExample example);

    int updateByPrimaryKeySelective(Phlabel record);

    int updateByPrimaryKey(Phlabel record);
}