package oop;

import java.util.ArrayList;

public class User {
    private static int nextId = 1;
    // Private fields
    private int id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String phoneNumber;
    private Address billingAddress;
    private Address deliveryAddress;
    private ArrayList<Cards> cards;
    private Roles role;
    private String manager;

    // Constructors
    public User(String fullName, String email, String role) {
        this.id = nextId;
        this.fullName = fullName;
        this.email = email;
        this.role = new Roles (role);
        this.cards = new ArrayList<Cards>();
        nextId++;
    }

    public User(String firstName, String lastName, String email, String role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = new Roles (role);
        nextId++;
    }
    public void printUserInfo() {
        System.out.println (fullName + ", " + email + ", " + ", " + phoneNumber + ", " + billingAddress + ", " + deliveryAddress + ", " + role);
    }

    // Getters & Setters
    public void setId(int Id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.startsWith ("+")) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println ("Error: Phone number should start with '+'");
        }
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void addCard(String number, String expireDate, String cvv, String cardType) {
        Cards cards = new Cards (number, expireDate, cvv, cardType);
        this.cards.add (cards);
    }

    public void setManager(String manager) {
        this.manager = manager;
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

    public Address getBillingAddress() {
        return billingAddress;
    }

    public Roles getRole() {
        return role;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getManager() {
        return manager;
    }

    public ArrayList<Cards> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Cards> cards) {
        this.cards = cards;
    }

    // toString
    @Override
    public String toString() {
        return "Person {"
                + "id='" + id + '\''
                + ", First Name = " + firstName
                + ", Last Name = " + lastName
                + ", Full Name = " + fullName
                + ", Email = " + email
                + ", Phone Number = " + phoneNumber
                + ", Billing Address = " + billingAddress
                + ", Delivery Address = " + deliveryAddress
                + ", Cards = " + cards
                + ", Role = " + role
                + ", Manager = " + manager
                + '}';
    }

}
