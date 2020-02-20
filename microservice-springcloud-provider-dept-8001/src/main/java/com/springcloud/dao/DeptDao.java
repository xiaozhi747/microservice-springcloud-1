package com.springcloud.dao;

import entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface DeptDao {

    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();

}
