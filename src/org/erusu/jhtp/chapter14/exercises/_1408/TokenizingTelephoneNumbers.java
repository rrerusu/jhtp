package org.erusu.jhtp.chapter14.exercises._1408;

import java.util.Scanner;

public class TokenizingTelephoneNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] numberSplit;

        System.out.printf("Enter phone number: ");

        /*
         * First "(" is split, leaving extra empty string at beginning of array.
         * All index must be +1 to access phone #
         */
        numberSplit = input.nextLine().split("\\D+"); 

        System.out.printf("Area code: %s\nNumber: %s",
            numberSplit[1], numberSplit[2] + numberSplit[3]);
        
        input.close();
    }
}