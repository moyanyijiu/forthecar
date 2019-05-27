package com.xa.mapper;

import com.xa.pojo.Phcar;
import com.xa.pojo.PhcarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhcarMapper {
    int countByExample(PhcarExample example);

    int deleteByExample(PhcarExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Phcar record);

    int insertSelective(Phcar record);

    List<Phcar> selectByExample(PhcarExample example);

    Phcar selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Phcar record, @Param("example") PhcarExample example);

    int updateByExample(@Param("record") Phcar record, @Param("example") PhcarExample example);

    int updateByPrimaryKeySelective(Phcar record);

    int updateByPrimaryKey(Phcar record);
}