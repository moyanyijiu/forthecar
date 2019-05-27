package com.xa.mapper;

import com.xa.pojo.Phodetails;
import com.xa.pojo.PhodetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhodetailsMapper {
    int countByExample(PhodetailsExample example);

    int deleteByExample(PhodetailsExample example);

    int deleteByPrimaryKey(Integer odid);

    int insert(Phodetails record);

    int insertSelective(Phodetails record);

    List<Phodetails> selectByExample(PhodetailsExample example);

    Phodetails selectByPrimaryKey(Integer odid);

    int updateByExampleSelective(@Param("record") Phodetails record, @Param("example") PhodetailsExample example);

    int updateByExample(@Param("record") Phodetails record, @Param("example") PhodetailsExample example);

    int updateByPrimaryKeySelective(Phodetails record);

    int updateByPrimaryKey(Phodetails record);
}