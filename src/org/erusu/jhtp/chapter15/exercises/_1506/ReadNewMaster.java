package org.erusu.jhtp.chapter15.exercises._1506;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadNewMaster {
    public static void main(String[] args) {
        List<Account> newAccounts = new ArrayList<>();
        try {
            ObjectInputStream newMasterReader = new ObjectInputStream(
                Files.newInputStream(Paths.get(
                    "src/org/erusu/jhtp/chapter15/exercises/_1506/newmast.ser"
                ))
            );

            while(true) {
                newAccounts.add((Account) newMasterReader.readObject());
            }
        } catch(EOFException endOfFile) {
            System.out.printf("");
        } catch(IOException fileDoesNotExist) {
            System.err.printf("File does not exist.  Exiting");
        } catch(ClassNotFoundException wrongFile) {
            System.err.printf("Wrong file. Exiting");
        }

        System.out.printf("%s", newAccounts.toString());

        try {
            Scanner logContent = new Scanner(Paths.get(
                "src/org/erusu/jhtp/chapter15/exercises/_1506/log.txt"
            ));

            while(true) {
                System.out.printf("\n%s", logContent.nextLine());
            }
        } catch(NoSuchElementException endOfFile) {
            System.out.printf("");
        } catch(IOException fileNotFound) {
            System.err.printf("File not found");
        }
    }
}