package com.baizhi.dao;

import com.baizhi.entity.Admin;

public interface AdminDao {
    void save(Admin admin);
    Admin queryByUsernameAndPassword(String name,String password);
}
