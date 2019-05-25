package com.xa.controller;

import com.xa.pojo.Users;
import com.xa.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("/User")
    public List<Users> getAllUser(){

        return iUserService.getAllUser();
    }
}
