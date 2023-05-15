package oop;

import exceptions.CardTypeExceptions;
import exceptions.PhoneNumberValidation;
import exceptions.UserNotFound;
import interfaces.Interface4Step5;
import interfaces.PrintInfo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User implements PrintInfo, Interface4Step5 {
    // Private fields
    final static String FILE_USERS = "users.csv";
    private static int id;
    private static Scanner scanner;
    private static String firstName;
    private static String lastName;
    private static String fullName;
    private static String email;
    private String phoneNumber; // s
    private Address billingAddress; //s
    private Address deliveryAddress; //s
    private ArrayList<Cards> cards = new ArrayList<> ( );  //s
    private Roles role;
    private Manager manager; // s
    private List<User> userList = new ArrayList<> ( );

    // 3. Interfaces & Enums Task 1 //  Constructors
    public User(String fullName, String email, Roles.RoleType role) {
        this.fullName = fullName;
        this.firstName = fullName.split (" ")[0];
        this.lastName = fullName.split (" ")[1];
        this.email = email;
        this.role = new Roles (role);
        id++;
    }

    public User(String firstName, String lastName, String email, Roles.RoleType role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.email = email;
        this.role = new Roles (role);
    }

    public User(String firstName, String lastName, String email) {
    }

    // 3. Interfaces & Enums Task 3
    public void printCardsList() {
        cards.forEach (card -> System.out.println ("The list of cards: " + card.getNumber ( )));
    }


    // Getters & Setters

    public int getId() {
        return id;
    }

    // Step 1. Exceptions Task 1 and Task 2
    public void setPhoneNumber(String phoneNumber) throws PhoneNumberValidation {
        try {
            if (!phoneNumber.startsWith ("+")) {
                throw new IllegalArgumentException ("Phone number must start with '+'");
            }
            this.phoneNumber = phoneNumber;
            System.out.println ("Phone number set successfully: " + phoneNumber);
        } catch (IllegalArgumentException e) {
            e.printStackTrace ( );
        }
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void addCard(String number, String expireDate, String cvv, Cards.CardType cardType) throws CardTypeExceptions {
        Cards card = new Cards (number, expireDate, cvv, cardType);
        cards.add (card);
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
        System.out.println (fullName + ", " + email + ", " + ", " + phoneNumber + ", " + billingAddress + ", " + deliveryAddress + ", " + role);
    }

    @Override
    public void addUser() {
        try {
            FileWriter writer = new FileWriter (FILE_USERS, true);
            writer.append (this.userData ( ) + "\n");
            System.out.println ("User was successfully added");
            writer.close ( );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }

    public static void printUsers() {
        try {
            FileReader fileReader = new FileReader (FILE_USERS);
            int character;
            StringBuilder line = new StringBuilder ( );

            while ((character = fileReader.read ( )) != -1) {
                if (character == '\n') {
                    System.out.println (line.toString ( ));
                    line = new StringBuilder ( );
                } else {
                    line.append ((char) character);
                }
            }

            fileReader.close ( );
        } catch (FileNotFoundException e) {
            e.printStackTrace ( );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }

    @Override
    public String userData() {
        return "User{" + "first Name='" + firstName + '\'' + ", last Name='" + lastName + '\'' + ", phoneNumber='" + phoneNumber + '\'' + ", email='" + email + '\'' + '}';
    }

    public static void main(String[] args) throws UserNotFound, IOException {
        while (true) {
            System.out.println ("Please, use a command add | print | exit!");
            scanner = new Scanner (System.in);
            switch (scanner.nextLine ( )) {
                case "add" -> {
                    System.out.println ("Enter First Name: ");
                    firstName = scanner.nextLine ( );
                    System.out.println ("Enter Last Name: ");
                    lastName = scanner.nextLine ( );
                    System.out.println ("Enter Email: ");
                    email = scanner.nextLine ( );
                    User user = new User (firstName, lastName, email);
                    user.addUser ( );
                    id++;
                }
                case "print" -> {
                    User.printUsers ( );
                }
                default -> throw new IllegalStateException ("Unexpected value: " + scanner.nextLine ( ));

                case "exit" -> {
                    return;
                }

            }
        }
    }
}

