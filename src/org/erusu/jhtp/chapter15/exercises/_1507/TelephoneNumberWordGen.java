package org.erusu.jhtp.chapter15.exercises._1507;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.FileNotFoundException;

public class TelephoneNumberWordGen {

    public static void main(String[] args) throws FileNotFoundException{
        PrintStream output = new PrintStream(
            "src/org/erusu/jhtp/chapter15/exercises/_1507/output.txt"
        );
        Scanner input = new Scanner(System.in);
        
        final String[] phoneChars = {"", "", "ABC",
            "DEF", "GHI", "JKL",
            "MNO", "PRS", "TUV",
            "WXY"};

        String charIndexes,
            phoneNum,
            phonePhrase = "";

        System.out.printf("Enter a phone number: ");
        phoneNum = input.nextLine().replaceAll("-", "");

        for(int counter = 0; counter < 2187; counter++) {
            charIndexes = genThreeBitNum(counter);
            for(int index = 0; index < phoneNum.length(); index++) {
                phonePhrase += 
                    "" + phoneChars[Character.getNumericValue(
                            phoneNum.charAt(index)
                        )].toCharArray()[Character.getNumericValue(
                            charIndexes.charAt(index)
                        )];
            }
            output.append(phonePhrase + "\n");
            phonePhrase = "";
        }

        output.close();
        input.close();
    }

    public static String genThreeBitNum(int num) {
        int base = 6;
        String baseThreeNum = "";

        while(base > 0) {
            baseThreeNum += "" + (int) (num / Math.pow(3, base));
            num %= Math.pow(3, base--);
        }

        return baseThreeNum + num;
    }
}