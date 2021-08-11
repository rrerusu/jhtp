package org.erusu.jhtp.chapter16.exercises._1617;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SumAndAverage {
    public static void main(String[] args) {
        List<Integer> randomNums = new LinkedList<>();

        int sum = 0;

        for(int counter = 0; counter < 25; counter++) {
            randomNums.add((int) (Math.random() * 101));
            sum += randomNums.get(counter);
        }

        Collections.sort(randomNums);

        System.out.printf("Random numbers: %s\nSum: %d\nAverage: %.2f\n",
            randomNums.toString(),
            sum,
            sum * 1.0 / randomNums.size());
    }
}