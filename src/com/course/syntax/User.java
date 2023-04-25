package com.course.syntax;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String billingAddress;
    private String deliveryAddress;
    private List<String> cards = new ArrayList<>();
    private String role;
    private String manager;

    public User(String fullName, String email, String role) {
        this.fullName = fullName;
        this.email = email;
        this.role = role;

    }

    public void setphoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void addCard(String card) {
        cards.add(card);
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public int getId() {
        return id;
    }

    private void updateFullName() {
        fullName = firstName + " " + lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public String getRole() {
        return role;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getManager() {
        return manager;
    }

    public String getCards() {
        return cards.toString();
    }

    public String toString() {
        return "Person{"
                + "id='" + id + '\''
                + ", First Name = " + firstName
                + ", Last Name = " + lastName
                + ", Full Name = " + fullName
                + ", Email = " + email
                + ", Phone Number = " + phoneNumber
                + ", Billing Address = " + billingAddress
                + ", Delivery Address = " + deliveryAddress
                + ", Cards = " + cards.toString ()
                + ", Role = " + role
                + ", Manager = " + manager
                + '}';
    }
    public void printUserInfo() {
        System.out.println (firstName + lastName + fullName + email + phoneNumber + billingAddress + deliveryAddress + role);
    }
}
