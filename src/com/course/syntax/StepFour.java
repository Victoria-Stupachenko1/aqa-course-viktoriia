package com.course.syntax;

import java.util.Scanner;

public class StepFour {
        public static int findLargestDivisor(int num) {
        int largestDivisor = num - 1;
        while (largestDivisor > 0) {
            if (num % largestDivisor == 0) {
                return largestDivisor;
            }
            largestDivisor--;
        }
        return -1; // If no divisor is found
    }
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            int largestDivisor = findLargestDivisor(num);
            if (largestDivisor == -1) {
                System.out.println("No divisor found for " + num);
            } else {
                System.out.println("Largest divisor of " + num + " is " + largestDivisor);
            }

            Scanner scanner1 = new Scanner(System.in);
            int age = 0;
            while (age <= 0 || age > 140) {
                System.out.print("Enter your age: ");
                age = scanner1.nextInt();
                if (age <= 0 || age > 140) {
                    System.out.println("Invalid age. Please enter a value between 1 and 140.");
                }
            }
            System.out.println("Success! Your age is " + age);
                }
            }

