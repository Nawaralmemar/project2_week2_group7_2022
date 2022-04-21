package com.example.Backend.domain.model;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long locationid;

    @NotBlank(message = "streetName.missing")
    private String streetName;

    @NotBlank(message = "streetNumber.missing")
    private String streetNumber;

    @NotBlank(message = "bus.missing")
    private String bus;

    @NotBlank(message = "postalCode.missing")
    private String postalCode;

    @NotBlank(message = "city.missing")
    private String city;

    private long userID;

    public Location(long locationid, String streetName, String streetNumber, String bus, String postalCode, String city, long userID) {
        this.locationid = locationid;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.bus = bus;
        this.postalCode = postalCode;
        this.city = city;
        this.userID = userID;
    }

    public Location() {
    }

    public void setLocationid(long id) {
        this.locationid = id;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public long getLocationid() {
        return locationid;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getBus() {
        return bus;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public long getUserID(){ return userID;}

    public String getFullAddress() {
        return streetName + " " + streetNumber + " " + bus + " " + postalCode + " " + city + " " + userID;
    }

}
