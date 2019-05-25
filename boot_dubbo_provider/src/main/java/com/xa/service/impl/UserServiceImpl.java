package com.xa.service.impl;

import com.xa.mapper.IUserMapper;
import com.xa.pojo.User;
import com.xa.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {
   @Autowired
    private IUserMapper iUserMapper;
    @Override
    public List<User> getAllUser() {
        return iUserMapper.getAllUser();
    }
}
