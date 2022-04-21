package com.example.Backend.Service;

import com.example.Backend.domain.model.Chore;
import com.example.Backend.domain.model.ChoreRepository;
import com.example.Backend.domain.model.Location;
import com.example.Backend.domain.model.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public Location add(Location location) {
        return locationRepository.save(location);
    }

    public Iterable<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    public Optional<Location> getLocationById(long id) {
        return locationRepository.findById(id);
    }

    public void deleteAllLocations() {
        locationRepository.deleteAll();
    }

    public void deleteWithId(long id) {locationRepository.findById(id);}

    public Location updateLocation(Location location) {
        return locationRepository.save(location);
    }
}
