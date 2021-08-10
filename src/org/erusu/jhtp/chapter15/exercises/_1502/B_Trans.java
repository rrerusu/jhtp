package org.erusu.jhtp.chapter15.exercises._1502;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class B_Trans {
    public static void main(String[] args) throws IOException{
        Scanner inTransaction = new Scanner(Paths.get(
            "src/org/erusu/jhtp/chapter15/exercises/_1502/trans.txt"
        ));

        System.out.printf("Content of trans.txt: %s", inTransaction.nextLine());
        inTransaction.close();
    }
}