package top.daoyang.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

class ReversibleArrayList<T> extends ArrayList<T> {

    public ReversibleArrayList(Collection<T> collection) {
        super(collection);
    }

    public Iterable<T> reversed() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int index = size() - 1;
                    @Override
                    public boolean hasNext() {
                        return index >= 0;
                    }

                    @Override
                    public T next() {
                        T res = get(index);
                        index--;
                        return res;
                    }
                };
            }
        };
    }
}
public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> ral =
                new ReversibleArrayList<>(Arrays.asList("To be or not to be".split("")));

        for (String s :
                ral) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : ral.reversed())
            System.out.print(s + " ");

        Integer i = -129;
        Integer t = -129;

        System.out.println(i == t);

        // -128  127
    }
}
