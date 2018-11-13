package top.daoyang.initialization.exercise;

public class Exercise14 {
    static int i = 10;
    
    static {
        b = 20;
    }
    static int b;
    
    public static void main(String[] args) {
        System.out.println(Exercise14.b);
    }
}