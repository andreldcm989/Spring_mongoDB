package com.springmongodb.springmongodb.services;

import java.util.List;
import java.util.Optional;

import com.springmongodb.springmongodb.domain.User;
import com.springmongodb.springmongodb.repository.UserRepository;
import com.springmongodb.springmongodb.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
