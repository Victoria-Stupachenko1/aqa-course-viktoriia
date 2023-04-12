package com.course.syntax;

import java.util.Scanner;

public class StepFour {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            if (i < 0) {
                System.out.println("Error: the number must be positive.");
            }
            if (i % 2 == 0) {
                System.out.print("The number is even ");
            }
                if (i % 3 == 0) {
                    System.out.println("The number is multiple to 3");
                } else {
                    System.out.println(i);
                }
            }   System.out.println();
        }
    }

