package top.daoyang.holding.exercise;

import java.util.*;

public class E14 {
    public static void main(String[] args) {
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new LinkedList<>();

        for (int i = 1; i < 10; i++) {
            a1.add(i);
        }

        ListIterator<Integer> itr = a1.listIterator();
        while (itr.hasNext()) {
            a2.add(a2.size() / 2, itr.next());
        }

        System.out.println(a2);
    }
}