package top.daoyang.holding;

import java.util.Iterator;

class IntSequence {
    protected int[] data = {1, 2 ,3 ,4, 5, 6, 7, 8};
}

public class NonCollectionSequence extends IntSequence implements Iterator<Integer> {

    private int i;

    @Override
    public boolean hasNext() {
        return i < data.length;
    }

    @Override
    public Integer next() {
        return data[i++];
    }

    public static void main(String[] args) {
        NonCollectionSequence nonCollectionSequence = new NonCollectionSequence();
        InterfaceVsIterator.display(nonCollectionSequence);
    }
}
