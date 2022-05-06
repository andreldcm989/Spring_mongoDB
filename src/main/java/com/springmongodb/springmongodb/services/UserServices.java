package com.springmongodb.springmongodb.services;

import java.util.List;

import com.springmongodb.springmongodb.domain.User;
import com.springmongodb.springmongodb.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    
    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    } 
}
