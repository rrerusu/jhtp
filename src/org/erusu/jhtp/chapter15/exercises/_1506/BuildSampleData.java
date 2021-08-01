package org.erusu.jhtp.chapter15.exercises._1506;

import java.io.ObjectOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;

public class BuildSampleData {

    private static ObjectOutputStream output;

    public static void main(String[] args) {
        Account[] accounts = new Account[]{
            new Account(100, "Alan", "Jones", 348.17),
            new Account(200, "Mary", "Smith", 27.19),
            new Account(300, "Sam", "Sharp", 0.00),
            new Account(400, "Suzy", "Green", -14.22)
        };
        // TransactionRecord[] records = new TransactionRecord[]{
        //     new TransactionRecord(100, 27.14),
        //     new TransactionRecord(200, 62.11),
        //     new TransactionRecord(300, 100.56),
        //     new TransactionRecord(400, 82.17)
        // };
        TransactionRecord[] records = new TransactionRecord[]{
            new TransactionRecord(300, 83.89),
            new TransactionRecord(700, 80.78),
            new TransactionRecord(700, 1.53)
        };

        String oldMasterPath = "src/org/erusu/jhtp/chapter15/exercises/_1506/oldmast.ser",
            transPath = "src/org/erusu/jhtp/chapter15/exercises/_1506/trans.ser";

        writeMaster(accounts, oldMasterPath);
        writeTransactions(records, transPath);
    }

    public static void closeObjectOutputStream() {
        try {
            output.close();
        } catch(IOException closeError) {
            System.err.printf("Error closing, closing anyways");
        }
    }

    public static void writeMaster(Account[] myAccounts, String path) {
        try {
            output = new ObjectOutputStream(Files.newOutputStream(Paths.get(path)));

            for(Account acc : myAccounts) {
                output.writeObject(acc);
            }

            closeObjectOutputStream();
        } catch(IOException fileError) {
            System.err.printf("Error writing to oldmast.ser, closing anyways");
        } catch (NoSuchElementException myElementException) {
            System.err.printf("Invalid input.  This sucks.");
        } 
    }

    public static void writeTransactions(TransactionRecord[] myTransactions, String path) {
        try {
            output = new ObjectOutputStream(Files.newOutputStream(Paths.get(path)));

            for(TransactionRecord trans : myTransactions) {
                output.writeObject(trans);
            }

            closeObjectOutputStream();
        } catch(IOException fileError) {
            System.err.printf("Error writing to trans.ser, closing anyways");
        }
    }
}