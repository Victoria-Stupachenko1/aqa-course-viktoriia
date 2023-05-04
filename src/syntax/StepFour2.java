package syntax;

import java.util.Scanner;

public class StepFour2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value to get factorial: ");
        int n = scanner.nextInt();
        System.out.println(Factorial(n));
    }
    public static int Factorial(int n) {
        int m = 1;
        for (int i = 1; i <= n; ++i) {
            m *= i;
        }
        return m;
    }
}
