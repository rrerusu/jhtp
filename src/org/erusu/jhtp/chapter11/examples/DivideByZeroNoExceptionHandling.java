package org.erusu.jhtp.chapter11.examples;

import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {
    public static int quotient(int numerator, int denominator) {
        return numerator / denominator;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer numerator: ");
        int numerator = input.nextInt();
        System.out.print("Please enter an integer denominator: ");
        int denominator = input.nextInt();

        int result = quotient(numerator, denominator);
        System.out.printf("\nResult: %d / %d = %d\n",
        numerator, denominator, result);

        input.close();
    }
}