package top.daoyang.holding.exercise;

import java.util.PriorityQueue;
import java.util.Random;

public class E28 {
    public static void main(String[] args) {
        Random random = new Random(47);
        PriorityQueue<Double> doublePriorityQueue = new PriorityQueue<>();

        for (int i = 0; i < 10; i++) {
            doublePriorityQueue.offer(i + random.nextDouble());
        }

        while (!doublePriorityQueue.isEmpty()) {
            System.out.println(doublePriorityQueue.poll());
        }
    }
}
