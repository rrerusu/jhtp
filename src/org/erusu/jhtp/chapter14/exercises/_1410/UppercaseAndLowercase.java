package org.erusu.jhtp.chapter14.exercises._1410;

import java.util.Scanner;

public class UppercaseAndLowercase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String mystr;

        System.out.printf("Enter a string: ");
        mystr = input.nextLine();

        System.out.printf("Uppercase String: %s\nLowercase String: %s",
            mystr.toUpperCase(), mystr.toLowerCase());

        input.close();
    }
}