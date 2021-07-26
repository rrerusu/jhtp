package org.erusu.jhtp.chapter15.examples;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateSequentialFile {
    private static ObjectOutputStream output;

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }

    public static void openFile() {
        try {
            output = new ObjectOutputStream(Files.newOutputStream(
                Paths.get("src/org/erusu/jhtp/chapter15/examples/clients.ser")
            ));
        } catch(IOException myIOException) {
            System.err.printf("Error opening file.  Terminating.\n");
            System.exit(1);
        }
    }

    public static void addRecords() {
        Scanner input = new Scanner(System.in);

        System.out.printf("%s\n%s\n? ",
            "Enter account number, first name, last name and balance.",
            "Enter end-of-file indicator to end input.");
            
        while(input.hasNext()) {
            try {
                Account record = new Account(
                    input.nextInt(), input.next(), input.next(), input.nextDouble());

                output.writeObject(record);
            } catch (NoSuchElementException myElementException) {
                System.err.printf("Invalid input.  Please try again.\n");
                input.nextLine();
            } catch (IOException myIOException) {
                System.err.printf("Error writing to file.  Terminating.\n");
                break;
            }

            System.out.print("? ");
        }

        input.close();
    }

    public static void closeFile() {
        try {
            if(output != null)
                output.close();
        } catch(IOException myIOException) {
            System.err.printf("Error closing file.  Terminating.\n");
        }
    }
}