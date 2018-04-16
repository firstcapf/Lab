package com.wang.lab.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lab")
public class lab {

    @RequestMapping("lablist")
    public String lablist()
    {
        return "lablist";
    }

    @RequestMapping("labadd")
    public String labadd()
    {
        return "labadd";
    }
}
