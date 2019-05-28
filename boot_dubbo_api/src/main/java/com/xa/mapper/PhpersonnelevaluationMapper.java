package com.xa.mapper;

import com.xa.pojo.Phpersonnelevaluation;
import com.xa.pojo.PhpersonnelevaluationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhpersonnelevaluationMapper {
    int countByExample(PhpersonnelevaluationExample example);

    int deleteByExample(PhpersonnelevaluationExample example);

    int deleteByPrimaryKey(Integer feid);

    int insert(Phpersonnelevaluation record);

    int insertSelective(Phpersonnelevaluation record);

    List<Phpersonnelevaluation> selectByExample(PhpersonnelevaluationExample example);

    Phpersonnelevaluation selectByPrimaryKey(Integer feid);

    int updateByExampleSelective(@Param("record") Phpersonnelevaluation record, @Param("example") PhpersonnelevaluationExample example);

    int updateByExample(@Param("record") Phpersonnelevaluation record, @Param("example") PhpersonnelevaluationExample example);

    int updateByPrimaryKeySelective(Phpersonnelevaluation record);

    int updateByPrimaryKey(Phpersonnelevaluation record);
}