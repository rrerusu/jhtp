package org.erusu.jhtp.chapter11.exercises._1118;

import java.io.IOException;

public class CatchBlockOrderDemo {
    public static void throwExcep()
        throws IOException, Exception {
        throw new IOException("IO Exception");
    }

    public static void main(String[] args) {
        // try {
        //     throwExcep();
        // } catch (Exception e) {
        //     System.out.printf(e.getMessage());
        // } catch (IOException ioe) {
        //     System.out.printf(ioe.getMessage());
        // }
    }
}