package oop;

import java.additional.syntax.Child;

import exceptions.PhoneNumberValidation;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        User user = new User("John Doe", "johnDoe@gmail.com", Roles.RoleType.ADMIN);
        user.setPhoneNumber("+12345678");
        Address billingAddress = new Address("Great Britain", "London", "Glasgow St.", "1A", "02104");
        user.setBillingAddress(billingAddress);

        user.addCard("4142567898764567", "02/24", "123", Card.CardType.VISA);
        user.addCard("41425678723764567", "02/28", "123", Card.CardType.MASTERCARD);
        ArrayList<Card> cards = user.getCards();

        System.out.println(cards);

        Manager manager = new Manager("First Manager", "fm@gmail.com", Roles.RoleType.CUSTOMER, "Local Manager");
        manager.setResponsibilityDistrict("Obolonskyi district");
        manager.setWorkPhoneNumber("+123876876");


        User user2 = new User("Dan Brown", "db@gmail.com", Roles.RoleType.VIEWER);
        Address billingAddress1 = new Address("Ukraine", "Kyiv", "Khreschatyk", "1", "09154");
        user2.setBillingAddress(billingAddress1);

        User user3 = new User("Test", "Test", "r@k.com", Roles.RoleType.MAIN_CUSTOMER);
        User user4 = new User("Test1", "Test1", "t@o.com", Roles.RoleType.MAIN_CUSTOMER);

        user.printInfo();
        user2.printInfo();
        user4.printInfo();
        manager.printInfo();
        user.printCardsList();

        Child child = new Child();

        System.out.println(child);

    }

}
