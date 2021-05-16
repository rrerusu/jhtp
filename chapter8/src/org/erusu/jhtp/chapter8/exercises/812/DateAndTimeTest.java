package org.erusu.jhtp.chapter8.exercises._812;

import org.erusu.jhtp.chapter8.exercises._807.Time2;
import org.erusu.jhtp.chapter8.exercises._808.Date;

public class DateAndTimeTest {
    public static void main(String[] args) {
        DateAndTime mydt = new DateAndTime(new Date(12, 31, 2999), new Time2(23, 59, 58));

        System.out.printf("mydt: %s%nmydt universal: %s", mydt.toString(), mydt.toUniversalString());

        mydt.nextMoment();
        System.out.printf("mydt: %s%nmydt universal: %s", mydt.toString(), mydt.toUniversalString());

        mydt.nextMoment();
        System.out.printf("mydt: %s%nmydt universal: %s", mydt.toString(), mydt.toUniversalString());
        
    }
}