package com.example.Backend.domain.model;

public class Location {
    private String streetName;
    private String streetNumber;
    private String bus;
    private String postalCode;
    private String city;
    private long userID;

    public Location(String streetName, String streetNumber, String bus, String postalCode, String city, long userID) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.bus = bus;
        this.postalCode = postalCode;
        this.city = city;
        this.userID = userID;
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
