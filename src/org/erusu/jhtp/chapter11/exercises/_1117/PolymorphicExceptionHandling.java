package org.erusu.jhtp.chapter11.exercises._1117;

import java.io.IOException;

public class PolymorphicExceptionHandling {
    public static void main(String[] args) {
        for(int counter = 1; counter <= 10; counter++) {
            try {
                throwExceptions(counter);
            } catch (Exception e) {
                System.out.printf("%d: %s\n", counter, e.getMessage());
            }
        }
    }

    public static void throwExceptions(int excepNum)
    throws ExceptionA, ExceptionB, NullPointerException, IOException, Exception {
        switch (excepNum){
            case 1:
                throw new ExceptionA();
            case 2:
                throw new ExceptionB();
            case 3:
                throw new NullPointerException("Pointing to null");
            case 4:
                throw new IOException("IO exception");
            default:
                throw new Exception(String.format("%dth exception", excepNum));
        }
    }
}