package org.erusu.jhtp.chapter8.exercises._814;

public class DateTest {
    public static void main(String[] args) {
        Date myDate = new Date(5, 16, 2021);
        Date myDate2 = new Date("March", 17, 2019);
        Date myDate3 = new Date(100, 2015);

        System.out.printf("Slashes: %s%nDate: %s%nDays: %s%n", myDate.toStringSlash(), myDate.toStringWord(), myDate.toStringDays());
        System.out.printf("%n%nSlashes: %s%nDate: %s%nDays: %s%n", myDate2.toStringSlash(), myDate2.toStringWord(), myDate2.toStringDays());
        System.out.printf("%n%nSlashes: %s%nDate: %s%nDays: %s%n", myDate3.toStringSlash(), myDate3.toStringWord(), myDate3.toStringDays());
    }
}