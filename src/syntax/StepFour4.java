package syntax;

import java.util.Scanner;

public class StepFour4 {
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
