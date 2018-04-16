package com.wang.lab.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;


//@RestController
@Controller
public class Hello {

    @RequestMapping("/")
    public String hello(Map<String,Object> model)

    {

        model.put("username","zhangsan");
        model.put("pass","input password！");
      //  return "user/useradd";

        return "main/login";
    }

    @RequestMapping("/list")
    public String list()
    {

        return "hello list";
    }



}
