package top.daoyang.exceptions.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * E3
 */
public class E3 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        try {

            list.get(1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException catch");
        }
    }
}