package oop;

import interfaces.PrintInfo;

import java.util.ArrayList;
import java.util.List;

public class Broker implements PrintInfo {
    private String name;
    private String email;
    private String phoneNumber;
    private List<User> clients;

    public Broker(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<User> getClients() {
        return clients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addClient(User client) {
        clients.add(client);
    }

    public void removeClient(User client) {
        clients.remove(client);
    }

    @Override
    public void printInfo() {
        System.out.println ("Name: " + name + " Email: " + email + " Phone Number ");
    }

    @Override
    public String userData() {
        return null;
    }
}
