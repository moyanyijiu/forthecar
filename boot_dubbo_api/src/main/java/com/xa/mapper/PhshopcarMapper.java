package com.xa.mapper;

import com.xa.pojo.Phshopcar;
import com.xa.pojo.PhshopcarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhshopcarMapper {
    int countByExample(PhshopcarExample example);

    int deleteByExample(PhshopcarExample example);

    int deleteByPrimaryKey(Integer osid);

    int insert(Phshopcar record);

    int insertSelective(Phshopcar record);

    List<Phshopcar> selectByExample(PhshopcarExample example);

    Phshopcar selectByPrimaryKey(Integer osid);

    int updateByExampleSelective(@Param("record") Phshopcar record, @Param("example") PhshopcarExample example);

    int updateByExample(@Param("record") Phshopcar record, @Param("example") PhshopcarExample example);

    int updateByPrimaryKeySelective(Phshopcar record);

    int updateByPrimaryKey(Phshopcar record);
}