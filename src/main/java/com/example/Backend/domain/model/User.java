package com.example.Backend.domain.model;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "password.missing")
    private String password;

    @NotBlank(message = "email.missing")
    @Email(message = "email.not.valid")
    private String email;

    @NotBlank(message = "firstName.missing")
    private String firstName;

    @NotBlank(message = "lastName.missing")
    private String lastName;

    @NotBlank(message = "phoneNumber.missing")
    private String phoneNumber;

    private int experience;
    private int rating;


    public User(long id ,String password, String email, String firstName, String lastName, String phoneNumber) {
        this.id = id;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.experience = 0;
    }

    public User() {

    }

    public long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public int getExperience() {
        return experience;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String getRank(int experience) {
        int result = experience / 50;
        if (result == 0) {
            return Ranks.ranks.NEWBIE.toString();
        } else if (result == 1) {
            return Ranks.ranks.JUNIOR.toString();
        } else if (result == 2) {
            return Ranks.ranks.SENIOR.toString();
        } else if (result == 3) {
            return Ranks.ranks.EXPERT.toString();
        } else {
            return Ranks.ranks.MASTER.toString();
        }
    }
}

