package org.erusu.jhtp.chapter15.exercises._1502;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class C_NewMast {

    private static String fileContents;
    public static void main(String[] args) {
        readFile();
        writeFile();
        outputFile();
    }

    public static void outputFile() {
        try {
            Scanner newMasterContent = new Scanner(
                Paths.get("src/org/erusu/jhtp/chapter15/exercises/_1502/newmast.txt")
            );

            System.out.printf(newMasterContent.nextLine());

            newMasterContent.close();
        } catch(IOException fileDoesntExist) {
            System.err.printf("File doesn't exist");
        }
    }

    public static void readFile() {
        try {
            Scanner newMasterContent = new Scanner(
                Paths.get("src/org/erusu/jhtp/chapter15/exercises/_1502/newmast.txt")
            );

            fileContents = newMasterContent.nextLine();

            newMasterContent.close();
        } catch(IOException fileDoesntExist) {
            System.err.printf("File doesn't exist");
        }
    }

    public static void writeFile() {
        try {
            Formatter outNewMaster = new Formatter(
                "src/org/erusu/jhtp/chapter15/exercises/_1502/newmast.txt"
            );

            outNewMaster.format("%s %s", fileContents, "TESTING WHY THIS DOESNT WORK");

            outNewMaster.close();
        } catch(FileNotFoundException noFile) {
            System.err.printf("No file found");
        }
    }
}
