package com.baizhi.service;

import com.baizhi.dao.EmplDao;
import com.baizhi.entity.Empl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmplServiceImpl implements EmplService {
    @Autowired
    EmplDao emplDao;
    @Override
    public void save(Empl empl) {
        emplDao.save(empl);
    }

    @Override
    public void delete(Integer id) {
        emplDao.delete(id);
    }

    @Override
    public void update(Empl empl) {
        emplDao.update(empl);
    }

    @Override
    public Empl queryOne(Integer id) {
        return emplDao.queryOne(id);
    }

    @Override
    public List<Empl> queryAll() {
        return emplDao.queryAll();
    }
}
