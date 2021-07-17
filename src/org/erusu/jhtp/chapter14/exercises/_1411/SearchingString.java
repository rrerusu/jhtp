package org.erusu.jhtp.chapter14.exercises._1411;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchingString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char searchChar;
        String mystr;

        System.out.printf("Enter string: ");
        mystr = input.nextLine();
        System.out.printf("Enter character to search for: ");
        searchChar = input.next().charAt(0);

        System.out.printf("\nLocations where %s shows up: %s",
            searchChar, Arrays.toString(searchForChar(mystr, searchChar)));

        input.close();
    }

    public static int[] searchForChar(String str, char ch) {
        List<Integer> charIndexes = new ArrayList<>();

        int charIndexesArr[],
            index = -1;
        
        str = str.toLowerCase();

        do {
            index = str.indexOf(ch, index + 1);

            if(index != -1)
                charIndexes.add(index);
        } while(index != -1);

        charIndexesArr = new int[charIndexes.size()];
        for(int transferIndx = 0; transferIndx < charIndexesArr.length; transferIndx++) {
            charIndexesArr[transferIndx] = charIndexes.get(transferIndx).intValue();
        }

        return charIndexesArr;
    }
}