package org.erusu.jhtp.chapter11.exercises._1121;

import java.io.IOException;

public class OuterScope {
    public static void main(String[] args) {
        try {
            throwExcep();
        } catch(IOException ioe) {
            System.out.printf(ioe.getMessage());
        }
    }

    public static void throwExcep()
        throws IOException{
        try {
            throw new IOException("IO Issue");
        } catch(NullPointerException npe) {
            System.out.printf(npe.getMessage());
        }
    }
}