package com.springmongodb.springmongodb.repository;

import com.springmongodb.springmongodb.domain.Post;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String>  {
    
}
