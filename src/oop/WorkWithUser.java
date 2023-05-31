package oop;

import java.util.Scanner;

public class WorkWithUser {
    private Scanner scanner;

    public static void main(String[] args) {
        WorkWithUser workWithUser = new WorkWithUser();
        workWithUser.run();
    }

    public void run() {
        scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please, use a command add | print | exit!");

            switch (scanner.nextLine()) {
                case "add" -> {
                    System.out.println("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.println("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.println("Enter Email: ");
                    String email = scanner.nextLine();
                    User user = new User(firstName, lastName, email);
                    user.addUser();
                }
                case "print" -> {
                    User.printUsers();
                }
                default -> throw new IllegalStateException("Unexpected value: " + scanner.nextLine());

                case "exit" -> {
                    return;
                }

            }
        }
    }
}
