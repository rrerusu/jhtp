package org.erusu.jhtp.chapter11.exercises._1120;

public class RethrowExceptions {
    public static void main(String[] args) {
        try {
            someMethod();
        } catch(Exception excep) {
            System.out.printf(excep.getMessage());
        }
    }

    public static void someMethod()
        throws Exception{
        try {
            someMethod2();
        } catch (Exception e) {
            throw e;
        }
    }

    public static void someMethod2()
        throws Exception {
        throw new Exception("someMethod2() Exception");
    }
}