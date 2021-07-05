package org.erusu.jhtp.chapter11.exercises._1116;

public class PolymorphicExceptionHandling {
    public static void main(String[] args) {
        System.out.printf("Catching exception superclass catches exception subclass?\n\n");

        try {
            throwExceptionC();
        } catch(ExceptionA superExce) {
            System.out.printf("Exception handled by ExceptionA: %s", superExce.getMessage());
        }
    }

    public static void throwExceptionC() throws ExceptionC {
        throw new ExceptionC();
    }
}