package org.erusu.jhtp.chapter8.exercises._808;

public class DateDriver {
    public static void main(String[] args) {
        Date myDate = new Date(1, 1, 2021);

        for(int day = 1; day <= 366; day++) {
            System.out.printf("%s%n", myDate.toString());
            myDate.nextDay();
        }
    }
}