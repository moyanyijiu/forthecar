package com.xa.controller;

import com.xa.pojo.User;
import com.xa.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping("/")
    public ModelAndView toIndex(){
        return new ModelAndView("index.htm");
    }

    @GetMapping("/User")
    public List<User> getAllUser(){

        return iUserService.getAllUser();
    }
}
