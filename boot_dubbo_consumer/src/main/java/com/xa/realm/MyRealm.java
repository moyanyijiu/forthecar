package com.xa.realm;


import com.xa.pojo.User;
import com.xa.service.IUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;


public class MyRealm extends AuthorizingRealm {
    @Resource
    IUserService iUserService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException{
        SimpleAuthenticationInfo info = null;
        UsernamePasswordToken uk = (UsernamePasswordToken) token;
        String username = uk.getUsername();
        char[] password1 = uk.getPassword();
        System.out.println(username);
        String password = new String(password1);
        User user = new User();
        user.setUname(username);
        user.setUpassword(password);
        User user1 = iUserService.getOneUser(user);
        System.out.println(user1+"realm====================");
        if (user1!=null){
            info = new SimpleAuthenticationInfo(username,password,getName());
        }else {
            throw new AuthenticationException("shiro验证查询数据库结果为空！！！");
        }
        return info;
    }
}
