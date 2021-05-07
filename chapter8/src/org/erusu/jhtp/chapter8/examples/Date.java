package org.erusu.jhtp.chapter8.examples;

public class Date {
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int theMonth, int theDay, int theYear) {
        month = checkMonth(theMonth);
        year = theYear;
        day = checkDay(theDay);

        System.out.printf("Date object constructor of date %s%n", this);
    }

    private int checkMonth(int testMonth) {
        if (testMonth > 0 && testMonth <= 12)
            return testMonth;
        else
            throw new IllegalArgumentException("Month must be 1-12");
    }

    private int checkDay(int testDay) {
        if(testDay > 0 && testDay <= daysPerMonth[month])
            return testDay;

        if(month == 2 && testDay == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
            return testDay;
        
        throw new IllegalArgumentException("Day out-of-range for specified month and year");
    }

    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
 }