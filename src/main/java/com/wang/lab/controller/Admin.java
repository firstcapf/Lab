package com.wang.lab.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wang.lab.service.AdminService;

import javax.annotation.Resource;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/admin")
public class Admin {

    @Resource
    private  AdminService adminService;


    @RequestMapping("/list")
    public List<com.wang.lab.entity.Admin> listadmin()
    {

        return adminService.adminlist();

    }
}
