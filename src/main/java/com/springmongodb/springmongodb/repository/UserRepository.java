package com.springmongodb.springmongodb.repository;

import com.springmongodb.springmongodb.domain.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String>  {
    
}
