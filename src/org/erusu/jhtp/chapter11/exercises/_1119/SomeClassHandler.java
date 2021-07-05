package org.erusu.jhtp.chapter11.exercises._1119;

public class SomeClassHandler {
    public static void main(String[] args) {
        try {
            SomeClass mySomeClass = new SomeClass();
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
    }
}