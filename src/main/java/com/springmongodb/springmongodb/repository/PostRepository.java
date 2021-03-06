package com.springmongodb.springmongodb.repository;

import java.util.List;

import com.springmongodb.springmongodb.domain.Post;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String>  {
    
    List<Post> findByTitleContainingIgnoreCase(String text);
}
