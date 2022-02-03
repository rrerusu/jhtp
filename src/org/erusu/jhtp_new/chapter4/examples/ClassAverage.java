package org.erusu.jhtp_new.chapter4.examples;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while(gradeCounter <= 10) {
            System.out.printf("Enter grade: ");
            int grade = input.nextInt();
            total += grade;
            gradeCounter++;
        }

        int average = total / 10;

        System.out.printf("\nTotal of all 10 grades is %d\n", total);
        System.out.printf("Class average is %d\n", average);

        input.close();
    }
}