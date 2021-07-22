package org.erusu.jhtp.chapter14.exercises._1420;

import java.util.Scanner;

public class CheckProtection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String checkAmt;

        System.out.printf("Enter check amt: ");
        checkAmt = input.next();

        System.out.printf("%s", String.format("%9s", checkAmt).replaceAll("\\s", "*"));

        input.close();
    }
}