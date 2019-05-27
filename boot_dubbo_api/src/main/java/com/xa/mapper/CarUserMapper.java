package com.xa.mapper;

import com.xa.pojo.CarUser;
import com.xa.pojo.CarUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarUserMapper {
    int countByExample(CarUserExample example);

    int deleteByExample(CarUserExample example);

    int deleteByPrimaryKey(Integer cuid);

    int insert(CarUser record);

    int insertSelective(CarUser record);

    List<CarUser> selectByExample(CarUserExample example);

    CarUser selectByPrimaryKey(Integer cuid);

    int updateByExampleSelective(@Param("record") CarUser record, @Param("example") CarUserExample example);

    int updateByExample(@Param("record") CarUser record, @Param("example") CarUserExample example);

    int updateByPrimaryKeySelective(CarUser record);

    int updateByPrimaryKey(CarUser record);
}