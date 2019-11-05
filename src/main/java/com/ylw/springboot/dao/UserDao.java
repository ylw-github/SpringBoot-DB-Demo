package com.ylw.springboot.dao;

import com.ylw.springboot.bean.JPAUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<JPAUser, String> {
}
