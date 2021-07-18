package org.erusu.jhtp.chapter14.exercises._1412;

import java.util.Scanner;


public class SearchAllLettersInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final char[] enAlphabet = "abcdefghijklnopqrstuvwxyz".toCharArray();
        final int[] letterOccurence = new int[26];
        String myStr;

        System.out.printf("Enter a string: ");
        myStr = input.nextLine();

        for(int index = 0; index < enAlphabet.length; index++) {
            letterOccurence[index] = calcNumOccurences(myStr, enAlphabet[index]);
            System.out.printf("%s: %s\n", enAlphabet[index], letterOccurence[index]);
        }

        input.close();
    }

    public static int calcNumOccurences(String str, char ch) {
        int occCounter = 0,
            currentIndx = -1;

        str = str.toLowerCase();
        
        do {
            currentIndx = str.indexOf(ch, currentIndx + 1);

            if(currentIndx != -1)
                occCounter++;
        } while(currentIndx != -1);

        return occCounter;
    }
}