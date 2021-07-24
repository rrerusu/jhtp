package org.erusu.jhtp.chapter15.examples;

import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {
    private static Scanner input;

    public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();
    }

    public static void openFile() {
        try {
            input = new Scanner(Paths.get("src/org/erusu/jhtp/chapter15/examples/clients.txt"));
        } catch (IOException myIOException) {
            System.err.printf("Error opening file.  Terminating.\n");
            System.exit(1);
        }
    }

    public static void readRecords() {
        System.out.printf("%-10s%-12s%-12s%10s\n",
            "Account", "First Name", "Last Name", "Balance");
        
        try {
            while(input.hasNext()) {
                System.out.printf("%-10d%-12s%-12s%10.2f\n",
                    input.nextInt(), input.next(), input.next(), input.nextDouble());
            }
        } catch (NoSuchElementException myElementException) {
            System.err.printf("File improperly formed.  Terminating.\n");
        } catch(IllegalStateException myStateException) {
            System.err.println("Error reading from file.  Terminating.\n");
        }
    }

    public static void closeFile() {
        if (input != null)
            input.close();
    }
}