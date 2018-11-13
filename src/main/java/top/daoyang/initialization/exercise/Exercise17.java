package top.daoyang.initialization.exercise;

public class Exercise17 {
    public Exercise17(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Exercise17[] exercise17 = new Exercise17[10];
        for (int i = 0; i < exercise17.length; i++) {
            exercise17[i] = new Exercise17(String.valueOf(i));
        }
    }
}