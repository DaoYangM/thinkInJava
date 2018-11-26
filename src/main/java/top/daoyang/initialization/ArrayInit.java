package top.daoyang.initialization;

import java.util.Arrays;

public class ArrayInit {

    public static void main(String[] args) {
        Integer[] a = { new Integer(1), new Integer(2)};

        Integer[] b = new Integer[] { new Integer(1), new Integer(2), 4, };

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}