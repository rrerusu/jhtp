package org.erusu.jhtp.chapter14.exercises._1421;

import java.util.Scanner;

public class WordEquivalentOfCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String checkVal[];

        System.out.printf("Enter check value: ");
        checkVal = input.next().split("[.]");

        System.out.printf("Word form of your number: %s", generateWordForm(checkVal));

        input.close();
    }

    public static String generateWordForm(String[] checkVal) {
        int wholeNum = Integer.parseInt(checkVal[0]);
        String wordForm = "";

        String doubleDigit[] = {"TWENTY", "THIRTY", "FOURTY", "FIFTY", "SIXTY",
                "SEVENTY", "EIGHTY", "NINETY"},
            singleDigit[] = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE",
                "SIX", "SEVEN", "EIGHT", "NINE"},
            teenDigit[] = {"TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN",
                "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN"};
        
        // Calculate hundreds
        if(wholeNum / 100 > 0) {
            wordForm += String.format("%s hundred ",
                singleDigit[wholeNum / 100]);
        }

        wholeNum %= 100;

        // Calculate tens and ones (handle 1x digits)
        if(wholeNum / 10 == 1) {
            wordForm += String.format("%s", teenDigit[wholeNum % 10]);
        } else {
            if(wholeNum / 10 > 1)
                wordForm += String.format("%s", doubleDigit[wholeNum / 10 - 2]);
                
            // Calculate ones
            wordForm += " " + ((wholeNum / 10 > 1 && wholeNum % 10 == 0) ? ""
                : singleDigit[wholeNum % 10]);
        }
        
        if(checkVal.length == 2)
            wordForm += String.format(" and %s/100", checkVal[1]);
        
        return wordForm;
    }
}