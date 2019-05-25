package com.xa.mapper;

import com.xa.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface IUserMapper {

    @Select("select * from users")
    List<Users> getAllUser();
}
