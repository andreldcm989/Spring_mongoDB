package com.springmongodb.springmongodb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.springmongodb.springmongodb.domain.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> users = new ArrayList<>();
        User maria = new User("1", "Maria Brown", "maria@gmail.com");
        User alex = new User("2", "Alex Green", "alex@gmail.com");
        users.addAll(Arrays.asList(maria, alex));
        return ResponseEntity.ok().body(users);
    }
}
