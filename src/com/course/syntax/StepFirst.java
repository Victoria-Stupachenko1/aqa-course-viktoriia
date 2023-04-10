package com.course.syntax;

import java.util.Scanner;

public class StepFirst {
    public static void main(String[] args) {
    //    byte a = 1;
    //    short b = 20346;
     //   int c = 247;
     //   long d = 123456789;
     //   float e = 4.8f;
     //   double f = 34.876d;
     //   char letter = 'W';
     //   boolean result = true;

     //   System.out.println("StepFirst.main");
     //   System.out.println(a + ", " + b + ", " + c +", " + d + ", " + e + ", " + f +", " + letter + ", " + result);

            System.out.print("Введите любое целое число от 1 до 10: ");
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
            }

        }
    }

