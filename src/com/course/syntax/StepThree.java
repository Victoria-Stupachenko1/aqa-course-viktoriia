package com.course.syntax;

import java.util.Scanner;

public class StepThree {
    public static void main(String[] args) {
    /*    System.out.print("Введите любое целое число от 1 до 10: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number >= 10) {
            System.out.println("Your number " + number + " is invalid");
        }
        if (number <= 10 && number > 0) {
            System.out.println("This number " + number + " is better");
        }
        if (number == 0) {
            System.out.println("This number " + number + " is not that good as a previous one");
        } else {
            System.out.println("You've entered " + number);
        } */

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a double value: ");
                double num = scanner.nextDouble();

                if (num % 2 == 0) {
                    System.out.println(num + " is even.");
                } else {
                    System.out.println(num + " is odd.");
                }

                scanner.close();

    }

    }
