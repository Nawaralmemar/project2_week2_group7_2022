package com.example.Backend.domain.controller;


import com.example.Backend.domain.model.User;
import com.example.Backend.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/user")
public class UserRestController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public Iterable<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") long id) {
        userService.deleteWithId(id);
    }

    @PostMapping("/add")
    public Iterable<User> add(@Valid @RequestBody User user) {
        userService.add(user);
        return userService.getAllUsers();
    }
}