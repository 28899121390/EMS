package com.baizhi.service;

import com.baizhi.entity.Empl;

import java.util.List;

public interface EmplService {
    void save(Empl empl);
    void delete(Integer id);
    void update(Empl empl);
    Empl queryOne(Integer id);
    List<Empl> queryAll();
}
