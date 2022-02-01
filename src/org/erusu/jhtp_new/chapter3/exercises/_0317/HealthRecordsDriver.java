package org.erusu.jhtp_new.chapter3.exercises._0317;

import java.util.Scanner;

public class HealthRecordsDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HealthRecords myRecord;

        System.out.printf("Enter height in inches: ");
        int height = input.nextInt();
        System.out.printf("Enter weight in pounds: ");
        double weight = input.nextDouble();

        myRecord = new HealthRecords("Firstname", "male", "lastname", weight, 1, height, 1, 2001);

        System.out.printf("Your BMI: %.2f", myRecord.calcBMI());
        
        input.close();
    }
}