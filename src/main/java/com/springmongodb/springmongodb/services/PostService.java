package com.springmongodb.springmongodb.services;

import java.util.Optional;

import com.springmongodb.springmongodb.domain.Post;
import com.springmongodb.springmongodb.repository.PostRepository;
import com.springmongodb.springmongodb.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

}
