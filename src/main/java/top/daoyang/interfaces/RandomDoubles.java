package top.daoyang.interfaces;

import java.util.Random;

public class RandomDoubles {
    private static Random rand = new Random(47);
    public double next() {
        return rand.nextInt();
    }

    public static void main(String[] args) {
        RandomDoubles randomDoubles = new RandomDoubles();
        for (int i = 0; i < 10; i++) {
            System.out.println(randomDoubles.next() + " ");
        }
    }
}
