package com.xa.controller;

import com.xa.pojo.User;
import com.xa.service.IUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("/User")
    public List<User> getAllUser(){
        return iUserService.getAllUser();
    }

    @GetMapping("/login")
    public String userlogin(HttpServletRequest request){
        String username = request.getParameter("uname");
        String password = request.getParameter("upassword");
        System.out.println(username);
        System.out.println(password);
        User user1 = new User();
        user1.setUname(username);
        user1.setUpassword(password);

     /*   String code_input=request.getParameter("code");
        String code_image=(String) request.getSession().getAttribute("rand");*/
        /* if (code_input.equals(code_image)){*/
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            subject.login(token);
            User user = iUserService.getOneUser(user1);
            request.getSession().setAttribute("user",user);
            return "successful";
        }catch(Exception e){
            AuthenticationException au=(AuthenticationException)e;
            System.out.println(au.getMessage());
            return au.getMessage();
        }
    }

    @GetMapping("/user")
    public User getOneUser(HttpServletRequest request){
        User user = (User)request.getSession().getAttribute("user");
        return user;
    }


}
