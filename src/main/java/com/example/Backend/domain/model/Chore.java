package com.example.Backend.domain.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "chore")
public class Chore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long choreid;

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

    public Chore(Long choreid, Long advertiserId, Long workerId, String description, int getEstimatedTime, int estimatedWage, String status) {
        this.choreid = choreid;
        this.advertiserId = advertiserId;
        this.workerId = workerId;
        this.description = description;
        this.getEstimatedTime = getEstimatedTime;
        this.estimatedWage = estimatedWage;
        this.status = status;
    }

    public Chore() {
    }

    public Long getChoreid() {
        return choreid;
    }

    public void setChoreid(Long id) {
        this.choreid = id;
    }

    public Long getAdvertiserId() {
        return advertiserId;
    }

    public void setAdvertiserId(Long advertiserId) {
        this.advertiserId = advertiserId;
    }

    public Long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Long workerId) {
        this.workerId = workerId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getGetEstimatedTime() {
        return getEstimatedTime;
    }

    public void setGetEstimatedTime(int getEstimatedTime) {
        this.getEstimatedTime = getEstimatedTime;
    }

    public int getEstimatedWage() {
        return estimatedWage;
    }

    public void setEstimatedWage(int estimatedWage) {
        this.estimatedWage = estimatedWage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
