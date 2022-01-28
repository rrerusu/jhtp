package org.erusu.jhtp_new.chapter3.exercises._0314;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public String displayDate() {
        return String.format("%d/%d/%d", month, day, year);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int d) {
        day = d;
    }

    public void setMonth(int m) {
        month = m;
    }

    public void setYear(int y) {
        year = y;
    }
}