package org.erusu.jhtp.chapter15.examples;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadSequentialFile {
    private static ObjectInputStream input;

    public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();
    }

    public static void openFile() {
        try {
            input = new ObjectInputStream(Files.newInputStream(
                Paths.get("src/org/erusu/jhtp/chapter15/examples/clients.ser")));
        } catch(IOException myIOException) {
            System.err.println("Error opening file.");
            System.exit(1);
        }
    }

    public static void readRecords() {
        System.out.printf("%-10s%-12s%-12s%10s\n",
            "Account", "First Name", "Last Name", "Balance");
        
        try {
            while(true) {
                Account record = (Account) input.readObject();

                System.out.printf("%-10d%-12s%-12s%10.2f\n", record.getAccount(),
                    record.getFirstName(), record.getLastName(), record.getBalance());
            }
        } catch(EOFException myEOFException) {
            System.out.printf("\nNo more records\n");
        } catch(ClassNotFoundException myClassNotFoundException) {
            System.err.printf("Invalid object type. Terminating.\n");
        } catch(IOException myIOException) {
            System.err.printf("Error reading from file. Terminating.\n");
        }
    }

    public static void closeFile() {
        try {
            if(input != null)
                input.close();
        } catch (IOException myIOException) {
            System.err.printf("Error closing file. Terminating.\n");
            System.exit(1);
        }
    }
}