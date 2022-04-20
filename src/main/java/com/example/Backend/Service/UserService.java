package com.example.Backend.Service;

import com.example.Backend.domain.model.User;
import com.example.Backend.domain.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User add(User user) {
        return userRepository.save(user);
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(long id) {
        return userRepository.findById(id);
    }

    public void deleteAllUsers() {
        userRepository.deleteAll();
    }

    public void deleteWithId(long id) {userRepository.findById(id);}

    public User updateUser(User user) {
        return userRepository.save(user);
    }

}
