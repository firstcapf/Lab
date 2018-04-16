package com.wang.lab.controller;


import com.wang.lab.entity.User;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class user {

    List<User>  users=new ArrayList<User>();

    @RequestMapping("/useradd")

    @ApiImplicitParam(name="username",value="用户名称",dataType="String", paramType = "query")

    public List<User> useradd(HttpServletRequest request)
    {

        String uname=request.getParameter("username");
        String upass=request.getParameter("password");

        User user=new User();
        user.setUsername(uname);
        user.setPassword(upass);
        user.setRemark("new user");
        users.add(user);

        return users;

    }









    @RequestMapping("/usersearchebyid")
    public User usersearchebyid()
    {

        User user=new User();
        user.setUsername("zhangshan");
        user.setPassword("123456");
        user.setRemark("hello this is test");

        return user;

    }

    @RequestMapping("/userlist")
    public List<User> userlist()
    {
        return  users;
    }

    @RequestMapping("/userdel")
    public String userdel()
    {
        return "hello userdel!";
    }
}
