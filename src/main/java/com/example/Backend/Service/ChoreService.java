package com.example.Backend.Service;

import com.example.Backend.domain.model.Chore;
import com.example.Backend.domain.model.ChoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ChoreService {

    @Autowired
    private ChoreRepository choreRepository;

    public Chore add(Chore chore) {
        return choreRepository.save(chore);
    }

    public Iterable<Chore> getAllChores() {
        return choreRepository.findAll();
    }

    public Optional<Chore> getUserById(long id) {
        return choreRepository.findById(id);
    }

    public void deleteAllChores() {
        choreRepository.deleteAll();
    }

    public void deleteWithId(long id) {choreRepository.findById(id);}

    public Chore updateChore(Chore chore) {
        return choreRepository.save(chore);
    }
}
