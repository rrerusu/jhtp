package org.erusu.jhtp.chapter8.exercises._810;

public class TrafficTest {
    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values())
            System.out.printf("%-10s%10.2f%n", light, light.getDuration());
    }
}