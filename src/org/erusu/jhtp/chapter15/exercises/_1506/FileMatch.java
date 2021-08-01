package org.erusu.jhtp.chapter15.exercises._1506;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class FileMatch {

    private static Formatter logOutput;
    private static ObjectInputStream input;
    private static ObjectOutputStream output;
    private static List<Account> accounts;
    private static List<Integer> unmatchedAccs;
    private static List<TransactionRecord> records;

    public static void main(String[] args) {
        final String oldMasterPath = "src/org/erusu/jhtp/chapter15/exercises/_1506/oldmast.ser",
            transPath = "src/org/erusu/jhtp/chapter15/exercises/_1506/trans.ser",
            newMasterPath = "src/org/erusu/jhtp/chapter15/exercises/_1506/newmast.ser",
            unmatchedPath = "src/org/erusu/jhtp/chapter15/exercises/_1506/log.txt";

        createAccountsList(oldMasterPath);
        createTransactionsList(transPath);

        System.out.printf("Accounts: %s\nRecords: %s",
            accounts,
            records);

        unmatchedAccs = new ArrayList<>();
        for(TransactionRecord record : records) {
            int index = findMatchingAccount(record);
            if(index > -1) {
                accounts.get(index).setBalance(
                    accounts.get(index).getBalance() + record.getTransactionAmount()
                );
            } else {
                unmatchedAccs.add(record.getAccountNumber());
            }
        }

        writeMasterFile(newMasterPath, accounts);
        closeOutput();
        writeLogFile(unmatchedPath, unmatchedAccs);
    }

    public static void closeOutput() {
        try {
            output.close();
        } catch(IOException unableToClose) {
            System.err.printf("\nUnable to close.  Ending program.");
        }
    }

    public static void createAccountsList(String path) {
        accounts = new ArrayList<>();
        try {
            input = new ObjectInputStream(Files.newInputStream(Paths.get(path)));

            while(true) {
                Account myAcc = (Account) input.readObject();

                accounts.add(myAcc);
            }
        } catch(EOFException endOfFile) {
            System.out.printf("");
        } catch(ClassNotFoundException noClassFound) {
            System.err.printf("Wrong object type.");
        } catch(IOException readingProblems) {
            System.err.printf("Reading problems.");
        }
    }

    public static void createTransactionsList(String path) {
        records = new ArrayList<>();
        try {
            input = new ObjectInputStream(Files.newInputStream(Paths.get(path)));

            while(true) {
                TransactionRecord myRecord = (TransactionRecord) input.readObject();

                records.add(myRecord);
            }
        } catch(EOFException endOfFile) {
            System.out.printf("");
        } catch(ClassNotFoundException noClassFound) {
            System.err.printf("Wrong object type.");
        } catch(IOException readingProblems) {
            System.err.printf("Reading problems.");
        }
    }

    public static int findMatchingAccount(TransactionRecord record) {
        for(int index = 0; index < accounts.size(); index++) {
            if(record.getAccountNumber() == accounts.get(index).getAccount())
                return index;
        }
        return -1;
    }

    public static void writeLogFile(String path, List<Integer> unmatchedList) {
        if(unmatchedList.size() > 0) {
            try {
                logOutput = new Formatter(path);
    
                for(Integer accNum : unmatchedList) {
                    logOutput.format(
                        "Unmatched transaction record for account number %d\n",
                            accNum
                    );
                }

                logOutput.close();
            } catch(IOException ioException) {
                System.err.printf("Unable to find file.  Exiting program.");
            }
        } else {
            System.out.printf("No unmatched items");
        }
    }

    public static void writeMasterFile(String path, List<Account> accs) {
        try {
            output = new ObjectOutputStream(Files.newOutputStream(Paths.get(path)));

            for(Account acc : accs) {
                output.writeObject(acc);
            }
        } catch(IOException ioException) {
            System.err.printf("Unable to find file.  Exiting program.");
        }
    }
}