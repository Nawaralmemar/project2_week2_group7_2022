package com.example.Backend.Service;

import com.example.Backend.domain.model.Person;
import com.example.Backend.domain.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Person add(Person person) {
        return userRepository.save(person);
    }

    public Iterable<Person> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<Person> getUserById(long id) {
        return userRepository.findById(id);
    }

    public void deleteAllUsers() {
        userRepository.deleteAll();
    }

    public void deleteWithId(long id) {userRepository.findById(id);}

    public Person updateUser(Person person) {
        return userRepository.save(person);
    }

}
