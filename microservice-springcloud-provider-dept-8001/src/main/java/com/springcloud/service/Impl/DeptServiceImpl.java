package com.springcloud.service.Impl;

import com.springcloud.dao.DeptDao;
import entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springcloud.service.DeptService;

import java.util.List;

/**
 * @author GongXings
 * @createTime 30 15:04
 * @description
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptDao deptDao;
    @Override
    public boolean addDept(Dept deptEntity) {
      return   deptDao.addDept(deptEntity);
    }

    @Override
    public Dept findById(Long deptNo) {
        return  deptDao.findById(deptNo);
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }
}