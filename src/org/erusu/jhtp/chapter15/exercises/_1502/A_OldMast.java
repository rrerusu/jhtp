package org.erusu.jhtp.chapter15.exercises._1502;

import java.nio.file.Paths;
import java.util.Scanner;
import java.io.IOException;

public class A_OldMast {
    public static void main(String[] args) throws IOException{
        Scanner inOldMaster = new Scanner(
            Paths.get("src/org/erusu/jhtp/chapter15/exercises/_1502/oldmast.txt"));
        
        System.out.printf("%s", inOldMaster.nextLine());
        inOldMaster.close();
    }
}