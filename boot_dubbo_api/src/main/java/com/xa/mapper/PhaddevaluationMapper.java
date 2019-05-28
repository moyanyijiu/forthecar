package com.xa.mapper;

import com.xa.pojo.Phaddevaluation;
import com.xa.pojo.PhaddevaluationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhaddevaluationMapper {
    int countByExample(PhaddevaluationExample example);

    int deleteByExample(PhaddevaluationExample example);

    int deleteByPrimaryKey(Integer aeid);

    int insert(Phaddevaluation record);

    int insertSelective(Phaddevaluation record);

    List<Phaddevaluation> selectByExample(PhaddevaluationExample example);

    Phaddevaluation selectByPrimaryKey(Integer aeid);

    int updateByExampleSelective(@Param("record") Phaddevaluation record, @Param("example") PhaddevaluationExample example);

    int updateByExample(@Param("record") Phaddevaluation record, @Param("example") PhaddevaluationExample example);

    int updateByPrimaryKeySelective(Phaddevaluation record);

    int updateByPrimaryKey(Phaddevaluation record);
}