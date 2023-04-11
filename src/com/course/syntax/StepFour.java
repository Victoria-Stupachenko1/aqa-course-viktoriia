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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int largestDivisor = findLargestDivisor(num);
        if (largestDivisor == -1) {
            System.out.println("No divisor found for " + num);
        } else {
            System.out.println("Largest divisor of " + num + " is " + largestDivisor);
        }
    }
}
