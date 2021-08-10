package org.erusu.jhtp.chapter16.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms1 {
    public static void main(String[] args) {
        Character[] letters = {'P', 'C', 'M'};
        List<Character> list = Arrays.asList(letters);
        System.out.printf("list contains: \n");
        output(list);

        Collections.reverse(list);
        System.out.printf("\nAfter calling reverse, list contains:\n");
        output(list);

        Character[] lettersCopy = new Character[3];
        List<Character> copyList = Arrays.asList(lettersCopy);

        Collections.copy(copyList, list);
        System.out.printf("\nAfter copying, copyList contains:\n");
        output(copyList);

        Collections.fill(list, 'R');
        System.out.printf("\nAfter calling fill, list contains:\n");
        output(list);
    }

    private static void output(List<Character> listRef) {
        System.out.printf("The list is: ");
        for(Character element : listRef) {
            System.out.printf("%s ", element);
        }

        System.out.printf("\nMax: %s", Collections.max(listRef));
        System.out.printf("\nMin: %s\n", Collections.min(listRef));
    }
}