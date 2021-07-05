package org.erusu.jhtp.chapter11.exercises._1116;

public class ExceptionA extends Exception{
     public ExceptionA() {
        super("Exception class ExceptionA handled");
    }

    public ExceptionA(String exceptionClassLet) {
        super(exceptionClassLet);
    }
}