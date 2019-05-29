package com.xa.service;

import com.xa.pojo.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUser();

    User getOneUser(User user);

}
