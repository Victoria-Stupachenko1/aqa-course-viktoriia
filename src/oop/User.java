package oop;

import exceptions.CardTypeExceptions;
import exceptions.PhoneNumberValidation;
import interfaces.PrintInfo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User implements PrintInfo {
    // Private fields
    private static final String FILE_USERS = "users.csv";
    private static int id;
    private static Scanner scanner;
    private String firstName;
    private String lastName;
    private static String fullName;
    private String email;
    private String phoneNumber; // s
    private Address billingAddress; //s
    private Address deliveryAddress; //s
    private ArrayList<Card> cards = new ArrayList<>();  //s
    private Roles role;
    private Manager manager; // s
    private List<User> userList = new ArrayList<>();

    // 3. Interfaces & Enums Task 1 //  Constructors
    public User(String fullName, String email, Roles.RoleType role) {
        this.fullName = fullName;
        this.firstName = fullName.split(" ")[0];
        this.lastName = fullName.split(" ")[1];
        this.email = email;
        this.role = new Roles(role);
        id++;
    }

    public User(String firstName, String lastName, String email, Roles.RoleType role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.email = email;
        this.role = new Roles(role);
    }

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // 3. Interfaces & Enums Task 3
    public void printCardsList() {
        cards.forEach(card -> System.out.println("The list of cards: " + card.getNumber()));
    }


    // Getters & Setters

    public int getId() {
        return id;
    }

    // Step 1. Exceptions Task 1 and Task 2
    public void setPhoneNumber(String phoneNumber) {
        if (!phoneNumber.startsWith("+"))
        try {
                throw new PhoneNumberValidation("Phone number must start with '+'");
        } catch (PhoneNumberValidation e) {
            e.printStackTrace();
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void addCard(String number, String expireDate, String cvv, Card.CardType cardType) throws CardTypeExceptions {
        Card card = new Card(number, expireDate, cvv, cardType);
        cards.add(card);
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

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    // toString
    @Override
    public String toString() {
        return "Person {" + "id='" + id + '\'' + ", First Name = " + firstName + ", Last Name = " + lastName + ", Full Name = " + fullName + ", Email = " + email + ", Phone Number = " + phoneNumber + ", Billing Address = " + billingAddress + ", Delivery Address = " + deliveryAddress + ", Cards = " + cards + ", Role = " + role + '}';
    }

    @Override
    public void printInfo() {
        System.out.println(fullName + ", " + email + ", " + ", " + phoneNumber + ", " + billingAddress + ", " + deliveryAddress + ", " + role);
    }

    public void addUser() {
        try {
            FileWriter writer = new FileWriter(FILE_USERS, true);
            writer.append(this.userData() + "\n");
            System.out.println("User was successfully added");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printUsers() {
        try {
            FileReader fileReader = new FileReader(FILE_USERS);
            int character;
            StringBuilder line = new StringBuilder();

            while ((character = fileReader.read()) != -1) {
                if (character == '\n') {
                    System.out.println(line.toString());
                    line = new StringBuilder();
                } else {
                    line.append((char)character);
                }
            }

            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String userData() {
        return "User{" + "first Name='" + firstName + '\'' + ", last Name='" + lastName + '\'' + ", email='" + email + '\'' + '}';
    }


}

