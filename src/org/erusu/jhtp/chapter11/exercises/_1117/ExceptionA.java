package org.erusu.jhtp.chapter11.exercises._1117;

public class ExceptionA extends Exception{
     public ExceptionA() {
        super("ExceptionA thrown");
    }

    public ExceptionA(String exceptionClassLet) {
        super(exceptionClassLet);
    }
}