package org.erusu.jhtp.chapter8.exercises._805;

public class Time1 {
    private int second;

    public void setTime(int s) {
        if(s >= 0) {
            second = s;
        } else {
            throw new IllegalArgumentException("second was out of range");
        }
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", (second / 3600), ((second % 3600) / 60), (second % 60));
    }
    
    public String toString() {
        return String.format("%d:%02d:%02d %s", (((second / 3600) == 0 || (second / 3600) == 12) ? 12 : (second / 3600) % 12), ((second % 3600) / 60), second, ((second / 3600) < 12 ? "AM" : "PM"));
    }
}