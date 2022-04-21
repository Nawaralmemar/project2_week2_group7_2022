package com.example.Backend.Service;

import com.example.Backend.domain.model.Message;
import com.example.Backend.domain.model.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MessageService {
    @Autowired
    private MessageRepository repository;

    public Message AddMessage(Message message){
        return repository.save(message);
    }

    public Message add(Message message) {
        return repository.save(message);
    }

    public Iterable<Message> getAllMessages() {
        return repository.findAll();
    }

    public Optional<Message> getMessageById(long id) {
        return repository.findById(id);
    }

    public void deleteAllMessage() {
        repository.deleteAll();
    }

    public void deleteWithId(long id) {repository.findById(id);}

    public Message updateMessage(Message message) {
        return repository.save(message);
    }

}
