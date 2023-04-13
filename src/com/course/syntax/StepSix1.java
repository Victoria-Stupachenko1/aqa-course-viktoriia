package com.course.syntax;

import java.util.Scanner;

public class StepSix1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the string:");
        String string1 = scanner.nextLine();

        System.out.println(string1.toUpperCase().replaceAll("\\s", "" ));

    }
}
