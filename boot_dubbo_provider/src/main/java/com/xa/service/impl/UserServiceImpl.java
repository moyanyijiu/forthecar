package com.xa.service.impl;

import com.xa.mapper.IUserMapper;
import com.xa.mapper.UserMapper;
import com.xa.pojo.User;
import com.xa.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements IUserService {
   @Resource
    private UserMapper iUserMapper;
    @Override
    public List<User> getAllUser() {
        return iUserMapper.selectByExample(null);
    }
}
