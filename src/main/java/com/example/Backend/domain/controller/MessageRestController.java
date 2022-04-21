package com.example.Backend.domain.controller;

import com.example.Backend.Service.MessageService;
import com.example.Backend.domain.model.Message;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/message")
public class MessageRestController {

    private MessageService messageService;

    @GetMapping("/all")
    public Iterable<Message> getAllMessages() {
         return messageService.getAllMessages();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMessage(long id) {
        messageService.deleteWithId(id);
    }

    @PostMapping("/add")
    public Message addMessage(@Valid @RequestBody Message message) {
        return messageService.add(message);
    }

}
