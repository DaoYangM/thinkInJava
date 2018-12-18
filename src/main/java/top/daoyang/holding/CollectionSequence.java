package top.daoyang.holding;

import java.util.AbstractCollection;
import java.util.Iterator;

public class CollectionSequence extends AbstractCollection<Integer> {
    private int[] data = new int[] { 1, 2, 3, 4, 5, 6, 7, 8};

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int i = 0;

            @Override
            public boolean hasNext() {
                return i < data.length;
            }

            @Override
            public Integer next() {
                return data[i++];
            }
        };
    }

    @Override
    public int size() {
        return data.length;
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        CollectionSequence collectionSequence = new CollectionSequence();
        InterfaceVsIterator.display(collectionSequence);
    }
}
