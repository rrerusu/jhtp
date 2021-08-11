package org.erusu.jhtp.chapter16.exercises._1618;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Character> chars = new LinkedList<>(
            Arrays.asList(new Character[]
                {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'}
            )
        ),
            reverseChars = new LinkedList<>(
                Arrays.asList(new Character[chars.size()])
            );
        
        Collections.copy(reverseChars, chars);
        Collections.reverse(reverseChars);

        System.out.printf("List: %s\nReverse list: %s",
            chars.toString(),
            reverseChars.toString());
    }
}