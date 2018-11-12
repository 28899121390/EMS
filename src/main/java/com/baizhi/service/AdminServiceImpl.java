package com.baizhi.service;

import com.baizhi.dao.AdminDao;
import com.baizhi.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminDao adminDao;
    @Override
    public void save(Admin admin) {
        adminDao.save(admin);
    }

    @Override
    public Admin queryByUsernameAndPassword(String name, String password) {
        return adminDao.queryByUsernameAndPassword(name, password);
    }
}
