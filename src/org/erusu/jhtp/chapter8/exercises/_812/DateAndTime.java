package org.erusu.jhtp.chapter8.exercises._812;

import org.erusu.jhtp.chapter8.exercises._807.Time2;
import org.erusu.jhtp.chapter8.exercises._808.Date;

public class DateAndTime {
    private Date date;
    private Time2 time;

    // constructor
    public DateAndTime(Date d, Time2 t) {
        date = new Date(d.getMonth(), d.getDay(), d.getYear());

        time = new Time2(t.getHour(), t.getMinute(), t.getSecond());
    }

    // increment time
    public void nextMoment() {
        if(time.tick())
            date.nextDay();
    }

    // accessor and modifier methods
    public Date getDate() {
        return date;
    }

    public Time2 getTime() {
        return time;
    }

    public void setDate(Date d) {
        date.setDay(d.getDay());
        date.setMonth(d.getMonth());
        date.setYear(d.getYear());
    }

    public void setTime(Time2 t) {
        time.setHour(t.getHour());
        time.setMinute(t.getMinute());
        time.setSecond(t.getSecond());
    }

    // toStrings
    public String toUniversalString() {
        return String.format("%s_%s", date.toString(), time.toUniversalString());
    }

    @Override
    public String toString() {
        return String.format("%s %s", date.toString(), time.toString());
    }
}
