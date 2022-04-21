package com.example.Backend.domain.controller;


import com.example.Backend.domain.model.Person;
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
    public Iterable<Person> getAllUsers(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") long id) {
        userService.deleteWithId(id);
    }

    @PostMapping("/add")
    public Iterable<Person> add(@Valid @RequestBody Person person) {
        userService.add(person);
        return userService.getAllUsers();
    }
}