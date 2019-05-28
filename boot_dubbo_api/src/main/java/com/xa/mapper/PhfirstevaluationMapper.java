package com.xa.mapper;

import com.xa.pojo.Phfirstevaluation;
import com.xa.pojo.PhfirstevaluationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhfirstevaluationMapper {
    int countByExample(PhfirstevaluationExample example);

    int deleteByExample(PhfirstevaluationExample example);

    int deleteByPrimaryKey(Integer feid);

    int insert(Phfirstevaluation record);

    int insertSelective(Phfirstevaluation record);

    List<Phfirstevaluation> selectByExample(PhfirstevaluationExample example);

    Phfirstevaluation selectByPrimaryKey(Integer feid);

    int updateByExampleSelective(@Param("record") Phfirstevaluation record, @Param("example") PhfirstevaluationExample example);

    int updateByExample(@Param("record") Phfirstevaluation record, @Param("example") PhfirstevaluationExample example);

    int updateByPrimaryKeySelective(Phfirstevaluation record);

    int updateByPrimaryKey(Phfirstevaluation record);
}