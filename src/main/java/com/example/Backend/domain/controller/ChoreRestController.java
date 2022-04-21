package com.example.Backend.domain.controller;


import com.example.Backend.Service.ChoreService;
import com.example.Backend.domain.model.Chore;
import com.example.Backend.domain.model.ChoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/chore")
public class ChoreRestController {

    @Autowired
    private ChoreService choreService;

    @GetMapping("/all")
    public Iterable<Chore> getAllChores() {
        return choreService.getAllChores();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") long id) {
        choreService.deleteWithId(id);
    }

    @PostMapping("/add")
    public Chore addChore(@Valid @RequestBody Chore chore) {
        return choreService.add(chore);
    }
}
