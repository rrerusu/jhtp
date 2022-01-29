package org.erusu.jhtp_new.chapter3.exercises._0316;

import java.util.Scanner;

public class HeartRateTest {
    public static void main(String[] args) {
        HeartRates userInfo;
        Scanner input = new Scanner(System.in);

        // Get inputs for firstname, lastname, and date of birth
        System.out.printf("Enter first name: ");
        String firstName = input.next();
        System.out.printf("Enter last name: ");
        String lastName = input.next();
        System.out.printf("Enter day of month that you were born on: ");
        int day = input.nextInt();
        System.out.printf("Enter month (as number) that you were born on: ");
        int month = input.nextInt();
        System.out.printf("Enter year that you were born in: ");
        int year = input.nextInt();

        userInfo = new HeartRates(firstName, lastName, day, month, year);

        System.out.printf("Info:\n\nFirst name: %s\nLast name: %s\nDOB: %s\n",
            userInfo.getFirstName(), userInfo.getLastName(), userInfo.getDOB());
        System.out.printf("Age: %d\nMaximum Heart Rate: %d\nTarget Heart Rate: %.2f to %.2f",
            userInfo.calcAge(), userInfo.calcMaxHeartRate(), userInfo.calcTargetHeartRate()[0],
            userInfo.calcTargetHeartRate()[1]);

        input.close();
    }
}