package com.example.Backend.domain.controller;


import com.example.Backend.Service.ChoreService;
import com.example.Backend.Service.LocationService;
import com.example.Backend.domain.model.Chore;
import com.example.Backend.domain.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/location")
public class LocationRestController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/all")
    public Iterable<Location> getAllLocations() {
        return locationService.getAllLocations();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") long id) {
        locationService.deleteWithId(id);
    }

    @PostMapping("/add")
    public Location addLocation(@Valid @RequestBody Location location) {
        return locationService.add(location);
    }
}
