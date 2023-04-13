package com.course.syntax;

import java.util.Scanner;
public class StepFour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = 0;
        while (age <= 0 || age > 140) {
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
            if (age <= 0 || age > 140) {
                System.out.println("Invalid age. Please enter a value between 1 and 140.");
            }
        }
        System.out.println("Success! Your age is " + age);
    }
}

        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                System.out.println(i);
                if (i < 0) {
                    System.out.println("Error: the number must be positive.");
                }
                if (i % 2 == 0) {
                    System.out.println(i + " the number is even");
                } else if (i % 3 == 0) {
                    System.out.println(i + " the number is multiple to 3");
                } else {
                    System.out.println(i);
                }
            }
        }

    }
}

