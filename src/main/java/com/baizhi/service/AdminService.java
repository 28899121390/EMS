package com.baizhi.service;

import com.baizhi.entity.Admin;

public interface AdminService {
    void save(Admin admin);
    Admin queryByUsernameAndPassword(String name,String password);
}
