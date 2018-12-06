package top.daoyang.innerclasses;

interface Selector {
    boolean end();

    Object current();

    void next();

    Sequence getSequence();
}

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object a) {
        if (next < items.length)
            items[next++] = a;
    }

    private class SequenceSelector implements Selector {
        private int i;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) i++;
        }

        @Override
        public Sequence getSequence() {
            return Sequence.this;
        }
    }

    public Selector reverseSelector() {
        return new ReverseSelector();
    }

    private class ReverseSelector implements Selector {
        private int i = items.length - 1;

        @Override
        public boolean end() {
            return i < 0;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            i--;
        }

        @Override
        public Sequence getSequence() {
            return Sequence.this;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(new Test(String.valueOf(i)));
        }
        Selector selector = sequence.reverseSelector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}

class Test {
    private String s;

    public Test(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}
