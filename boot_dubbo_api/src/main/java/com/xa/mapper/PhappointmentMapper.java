package com.xa.mapper;

import com.xa.pojo.Phappointment;
import com.xa.pojo.PhappointmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhappointmentMapper {
    int countByExample(PhappointmentExample example);

    int deleteByExample(PhappointmentExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Phappointment record);

    int insertSelective(Phappointment record);

    List<Phappointment> selectByExample(PhappointmentExample example);

    Phappointment selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") Phappointment record, @Param("example") PhappointmentExample example);

    int updateByExample(@Param("record") Phappointment record, @Param("example") PhappointmentExample example);

    int updateByPrimaryKeySelective(Phappointment record);

    int updateByPrimaryKey(Phappointment record);
}