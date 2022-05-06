package com.springmongodb.springmongodb.resources;

import java.util.List;
import java.util.stream.Collectors;

import com.springmongodb.springmongodb.domain.User;
import com.springmongodb.springmongodb.dto.UserDto;
import com.springmongodb.springmongodb.services.UserServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "users")
public class UserResource {

    @Autowired
    private UserServices service;

    @GetMapping
    public ResponseEntity<List<UserDto>> findAll() {
        List<User> users = service.findAll();
        List<UserDto> usersDto = users.stream().map(x -> new UserDto(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(usersDto);
    }
}
