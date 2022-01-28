package org.erusu.jhtp_new.chapter3.exercises._0314;

public class DateDriver {
    public static void main(String[] args) {
        Date someonesBday = new Date(10, 11, 2022);

        System.out.printf("Someone's birthday is %s", someonesBday.displayDate());
    }
}