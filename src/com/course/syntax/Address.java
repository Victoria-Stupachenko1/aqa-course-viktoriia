package com.course.syntax;

public class Address {
    // Private fields
    private static int nextId = 1;
    private int id;
    private String country;
    private String city;
    private String street;
    private String building;
    private int room;
    private String zipCode;

    // Constructor

    public Address(String country, String city, String street, String building, String zipCode) {
        this.id = nextId;
        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
        this.zipCode = zipCode;
        nextId++;
    }
    // getters & setters

    public int getId() {
        return id;
    }

    public void setCountry() {
        this.country = country;
    }

    public String country() {
        return country;
    }

    public void setCity() {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setStreet() {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setBuilding() {
        this.building = building;
    }

    public String getBuilding() {
        return building;
    }

    public void setRoom() {
        this.room = room;
    }

    public int getRoom() {
        return room;
    }

    public void setZipCode() {
        this.zipCode = zipCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "Address [country=" + country + ", city=" + city + ", street=" + street
                + ", building=" + building + ", zipCode=" + zipCode + "]";
    }


}
