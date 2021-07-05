package org.erusu.jhtp.chapter11.examples;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DivideByZeroWithExceptionHandling {
    public static int quotient(int numerator, int denominator) throws ArithmeticException {
        return numerator / denominator;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            try {
                System.out.print("Please enter an integer numerator: ");
                int numerator = input.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int denominator = input.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("\nResult: %d / %d = %d\n",
                numerator, denominator, result);
                continueLoop = false;
            } catch (InputMismatchException inputMismatch) {
                System.err.printf("\nException: %s\n", inputMismatch);
                input.nextLine();
                System.out.printf("You must enter integers.  Please try again.\n\n");
            } catch (ArithmeticException arExc) {
                System.err.printf("\nException: %s\n", arExc);
                System.out.printf("Zero is an invalid denominator.  Please try again.\n\n");
            }
        } while (continueLoop);

        input.close();
    }
}