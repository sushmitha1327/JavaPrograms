package program;

import java.util.Scanner;

public class FactorialDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a non-negative integer: ");
            int num = sc.nextInt();
            if (num < 0)
                throw new IllegalArgumentException("Number must be non-negative.");
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + num + " is: " + fact);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Factorial calculation complete.");
            sc.close();
        }
    }
}
