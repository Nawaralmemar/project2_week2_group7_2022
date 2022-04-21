package com.example.Backend.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "message")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long messageid;
    @NotBlank
    private long userID1;
    @NotBlank
    private long userID2;

    @NotBlank(message = "timestamp is required")
    private Time timeSent;

    @NotBlank(message = "Text is required")
    private String text;

    public Message(long userID1, long userID2, Time timeSent, String text) {
        this.userID1 = userID1;
        this.userID2 = userID2;
        this.timeSent = timeSent;
        this.text = text;
    }

       public Message() {

    }

    public long getUserID1() {
        return userID1;
    }

    public void setUserID1(long userID1) {
        this.userID1 = userID1;
    }

    public long getUserID2() {
        return userID2;
    }

    public void setUserID2(long userID2) {
        this.userID2 = userID2;
    }

    public Time getTimeSent() {
        return timeSent;
    }

    public void setTimeSent(Time timeSent) {
        this.timeSent = timeSent;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
