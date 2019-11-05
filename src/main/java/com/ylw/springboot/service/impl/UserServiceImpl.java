package com.ylw.springboot.service.impl;

import com.ylw.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createUser(String uuid, String name, Integer age) {
        System.out.println("插入人员 name -> " + name + " age ->" + age);
        jdbcTemplate.update("insert into t_user(uuid,name,age) values(?,?,?);", uuid, name, age);
    }
}
