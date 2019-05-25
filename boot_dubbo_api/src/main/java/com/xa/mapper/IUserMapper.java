package com.xa.mapper;

import com.xa.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface IUserMapper {

    @Select("select * from user")
    List<User> getAllUser();
}
