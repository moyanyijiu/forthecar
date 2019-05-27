package com.xa.mapper;

import com.xa.pojo.Phuserinfo;
import com.xa.pojo.PhuserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhuserinfoMapper {
    int countByExample(PhuserinfoExample example);

    int deleteByExample(PhuserinfoExample example);

    int deleteByPrimaryKey(Integer uiid);

    int insert(Phuserinfo record);

    int insertSelective(Phuserinfo record);

    List<Phuserinfo> selectByExample(PhuserinfoExample example);

    Phuserinfo selectByPrimaryKey(Integer uiid);

    int updateByExampleSelective(@Param("record") Phuserinfo record, @Param("example") PhuserinfoExample example);

    int updateByExample(@Param("record") Phuserinfo record, @Param("example") PhuserinfoExample example);

    int updateByPrimaryKeySelective(Phuserinfo record);

    int updateByPrimaryKey(Phuserinfo record);
}