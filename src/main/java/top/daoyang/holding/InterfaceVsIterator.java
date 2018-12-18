package top.daoyang.holding;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class InterfaceVsIterator {
    public static void display(Iterator<Integer> it) {
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        System.out.println();
    }

    public static void display(Collection<Integer> it) {
        for (Integer i:
             it) {
            System.out.printf(i + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        display(list);
        display(list.iterator());
    }
}
