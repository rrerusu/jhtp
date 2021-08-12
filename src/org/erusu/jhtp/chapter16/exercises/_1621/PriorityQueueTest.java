package org.erusu.jhtp.chapter16.exercises._1621;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Double> queue = new PriorityQueue<>(Comparator.reverseOrder());

        queue.offer(3.2);
        queue.offer(9.8);
        queue.offer(5.4);

        System.out.printf("Polling from queue: ");

        while(queue.size() > 0) {
            System.out.printf("%.2f ", queue.peek());
            queue.poll();
        }
    }
}