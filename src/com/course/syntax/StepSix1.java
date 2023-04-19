package com.course.syntax;

import java.util.Scanner;

public class StepSix1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the string:");
        String string1 = scanner.nextLine();

        String result = string1.replaceAll("\\s+", "").toUpperCase();

        for (int i = 0; i < result.length(); i++) {
            System.out.println(result.charAt(i));


        }
    }
}
