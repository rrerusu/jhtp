package org.erusu.jhtp.chapter10.exercises._1012;

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

    // toStrings
    public String toStringSlash() {
        return String.format("%s/%s/%s", (getMonth() / 10 == 0 ? "0" + getMonth() : getMonth()),
			(getDay() / 10 == 0 ? "0" + getDay() : getDay()), getYear());
    }

    public String toStringWord() {
        return String.format("%s %s, %s", months[getMonth()], getDay(), getYear());
    }

    public String toStringDays() {
        int days = getDay();

        if(getMonth() >= 2 && getYear() % 4 == 0)
            days++;

        for(int m = 1; m < getMonth(); m++) {
            days += daysPerMonth[m];
        }
        return String.format("%s %s", ((days / 100 == 0) ? (days / 10 == 0 ? "00" + days : "0" + days) : days), getYear());
    }
}
