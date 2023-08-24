package com.edubridge.onlinelapstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edubridge.onlinelapstore.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
