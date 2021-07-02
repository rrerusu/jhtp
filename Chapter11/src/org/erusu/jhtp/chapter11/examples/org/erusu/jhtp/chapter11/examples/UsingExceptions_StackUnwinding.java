package org.erusu.jhtp.chapter11.examples;

public class UsingExceptions_StackUnwinding {
    public static void main(String[] args) {
        try {
            method1();
        } catch(Exception exception) {
            System.err.printf("%s\n\n", exception.getMessage());
            exception.printStackTrace();

            StackTraceElement[] traceElements = exception.getStackTrace();

            System.out.printf("\nStack trace from getStackTrace:\n");
            System.out.println("Class\t\tFile\t\t\tLine\tMethod");

            for(StackTraceElement element : traceElements) {
                System.out.printf("%s\t%s\t%s\t%s\t",
                    element.getClassName(), element.getFileName(),
                    element.getLineNumber(), element.getMethodName());
            }
        }
    }

    public static void method1() throws Exception {
        method2();
    }

    public static void method2() throws Exception {
        method3();
    }

    public static void method3() throws Exception {
        throw new Exception("Exception thrown in method3");
    }
}