package com.course.syntax;

import java.util.Scanner;

public class StepSix3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("Enter a letter: ");
        char letter = scanner.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == letter) {
                count++;
            }
        }

            System.out.printf("The letter '%c' appears %d times", letter, count);

    }
}
