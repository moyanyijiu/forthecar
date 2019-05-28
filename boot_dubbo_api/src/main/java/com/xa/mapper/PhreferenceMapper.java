package com.xa.mapper;

import com.xa.pojo.Phreference;
import com.xa.pojo.PhreferenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhreferenceMapper {
    int countByExample(PhreferenceExample example);

    int deleteByExample(PhreferenceExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(Phreference record);

    int insertSelective(Phreference record);

    List<Phreference> selectByExample(PhreferenceExample example);

    Phreference selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") Phreference record, @Param("example") PhreferenceExample example);

    int updateByExample(@Param("record") Phreference record, @Param("example") PhreferenceExample example);

    int updateByPrimaryKeySelective(Phreference record);

    int updateByPrimaryKey(Phreference record);
}