package oop;

import java.util.ArrayList;

public class User {
    // Private fields
    private static int id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String phoneNumber; // s
    private Address billingAddress; //s
    private Address deliveryAddress; //s
    private ArrayList<Cards> cards = new ArrayList<> ( );  //s
    private Roles role;
    private Manager manager; // s

    // Constructors
    public User(String fullName, String email, String role) {
        this.fullName = fullName;
        this.firstName = fullName.split (" ")[0];
        this.lastName = fullName.split (" ")[1];
        this.email = email;
        this.role = new Roles (role);
        id++;
    }

    public User(String firstName, String lastName, String email, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = new Roles (role);
        id++;
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
                + '}';
    }

}
