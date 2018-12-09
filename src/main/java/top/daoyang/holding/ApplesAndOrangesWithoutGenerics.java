package top.daoyang.holding;

import java.util.ArrayList;

class Apple {
    private static int count;
    private final long id = count++;
    public long id() { return id; }
}

class Orange {}

public class ApplesAndOrangesWithoutGenerics {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }

        for (int i = 0; i < 3; i++) {
            ((Apple)apples.get(i)).id();
        }
    }
}
