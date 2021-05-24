package org.erusu.jhtp.chapter8.exercises._814;

public class Date {
    private int year;
    private int month;
    private int day;
    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final String[] months = {"", "January", "Feburary", "March",
        "April", "May", "June",
        "July", "August", "September",
        "October", "November", "December"};

    // constructors
    public Date(int m, int d, int y) {
        year = y;
        month = m;
        day = d;
    }

    public Date(String m, int d, int y) {
        int monthIndx = 1;
        while(! m.equals(months[monthIndx])) {
            monthIndx++;
        }
        month = monthIndx;
        day = d;
        year = y;
    }

    public Date(int d, int y) {
        int monthIndx = 1;
        int m = 0;
        while(d > daysPerMonth[monthIndx]) {
            d -= ((monthIndx == 2 && year % 4 == 0) ? 29 : daysPerMonth[monthIndx]);
            m++;
            monthIndx++;
        }
        day = d;
        month = m;
        year = y;

    }

    // toStrings
    public String toStringSlash() {
        return String.format("%s/%s/%s", (month / 10 == 0 ? "0" + month : month), (day / 10 == 0 ? "0" + day : day), year);
    }

    public String toStringWord() {
        return String.format("%s %s, %s", months[month], day, year);
    }

    public String toStringDays() {
        int days = day;

        if(month >= 2 && year % 4 == 0)
            days++;

        for(int m = 1; m < month; m++) {
            days += daysPerMonth[m];
        }
        return String.format("%s %s", ((days / 100 == 0) ? (days / 10 == 0 ? "00" + days : "0" + days) : days), year);
    }
}
