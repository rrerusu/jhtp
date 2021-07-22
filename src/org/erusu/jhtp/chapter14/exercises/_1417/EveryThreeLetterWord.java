package org.erusu.jhtp.chapter14.exercises._1417;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EveryThreeLetterWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word;

        System.out.printf("Enter a 5 letter word: ");
        word = input.next();

        System.out.printf("List of all 3 letter words: \n%s",
            genThreeLetterWords(word)).toString();

        input.close();
    }

    public static List<String> genThreeLetterWords(String fiveLetWord) {
        List<String> threeLetWords = new ArrayList<>();

        String threeLetWord;

        for(int index1 = 0; index1 < fiveLetWord.length(); index1++) {
            for(int index2 = 0; index2 < fiveLetWord.length(); index2++) {
                for(int index3 = 0; index3 < fiveLetWord.length(); index3++) {
                    threeLetWord = String.format("%c%c%c",
                        fiveLetWord.charAt(index1),
                        fiveLetWord.charAt(index2),
                        fiveLetWord.charAt(index3));

                    if(index2 != index1 &&
                        index3 != index2 &&
                        index3 != index1 &&
                        !threeLetWords.contains(threeLetWord))
                        threeLetWords.add(threeLetWord);
                }
            }
        }

        return threeLetWords;
    }
}