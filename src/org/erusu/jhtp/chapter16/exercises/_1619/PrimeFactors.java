package org.erusu.jhtp.chapter16.exercises._1619;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> primeFactors = new ArrayList<>();
        Set<Integer> pFactors;

        int num, testFactor = 2;

        System.out.printf("Enter number: ");
        num = input.nextInt();

        while(num > 1) {
            if(num % testFactor == 0) {
                if(!(num == testFactor && primeFactors.size() == 0))
                    primeFactors.add(testFactor);
                num /= testFactor;
            } else
                testFactor++;
        }

        pFactors = new TreeSet<>(primeFactors);

        System.out.printf("%s", (pFactors.size() == 0) ? "Your number is prime" :
            pFactors);

        input.close();
    }
}