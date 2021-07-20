package org.erusu.jhtp.chapter14.exercises._1415;

public class IntToChar {
    public static void main(String[] args) {
        for(int counter = 0; counter < 256; counter++) {
            System.out.printf("%03d: %c\n", counter, toChar(counter));
        }
    }

    public static char toChar(int num) {
        return (char) num;
    }
}