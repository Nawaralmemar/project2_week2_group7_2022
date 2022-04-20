package com.example.Backend.domain.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "chore")
public class Chore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "advertiser.missing")
    private Long advertiserId;

    private Long workerId;

    @NotBlank(message = "description.missing")
    private String description;

    @NotBlank(message = "time.missing")
    private int getEstimatedTime;

    @NotBlank(message = "wage.missing")
    private int estimatedWage;

    @NotBlank(message = "status.missing")
    private String status;

//TODO Create getters and setters!




}
