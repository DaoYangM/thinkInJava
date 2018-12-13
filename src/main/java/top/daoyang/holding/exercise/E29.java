package top.daoyang.holding.exercise;

import java.util.Comparator;
import java.util.PriorityQueue;

class Student extends Object {}

public class E29 {
    public static void main(String[] args) {
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(Object::hashCode));
        priorityQueue.offer(new Student());
        priorityQueue.offer(new Student());
    }
}
