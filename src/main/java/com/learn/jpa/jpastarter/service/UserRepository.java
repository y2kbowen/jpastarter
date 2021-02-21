package com.learn.jpa.jpastarter.service;

import com.learn.jpa.jpastarter.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
