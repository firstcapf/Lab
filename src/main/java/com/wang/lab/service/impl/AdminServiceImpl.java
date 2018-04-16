package com.wang.lab.service.impl;

import com.wang.lab.dao.AdminDao;
import com.wang.lab.entity.Admin;
import org.springframework.stereotype.Service;
import com.wang.lab.service.AdminService;

import javax.annotation.Resource;
import java.util.List;

@Service("adminService")
public class AdminServiceImpl implements AdminService{

    @Resource
    private AdminDao adminDao;

    @Override
    public List<Admin> adminlist() {
        return adminDao.adminlist();
    }
}
