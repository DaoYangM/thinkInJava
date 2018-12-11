package top.daoyang.holding.exercise;

import java.util.*;

public class E12 {
    public static void main(String[] args) {
        List<Integer> a1 = new ArrayList<>(10);
        List<Integer> a2 = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            a1.add(i);
        }

        ListIterator<Integer> lIterator = a1.listIterator(a1.size());
        while (lIterator.hasPrevious()) {
            a2.add(lIterator.previous());
        }

        System.out.println(a2);
    }
}