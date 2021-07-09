package org.erusu.jhtp.chapter14.examples;

public class StringBuilderConstructors {
    public static void main(String[] args) {
        StringBuilder buffer1 = new StringBuilder(),
            buffer2 = new StringBuilder(10),
            buffer3 = new StringBuilder("hello");
        
        System.out.printf("buffer1 = \"%s\"\nbuffer2 = \"%s\"\nbuffer3 = \"%s\"\n",
            buffer1, buffer2, buffer3);
    }
}