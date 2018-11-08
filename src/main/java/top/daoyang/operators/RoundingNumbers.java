package top.daoyang.operators;

public class RoundingNumbers {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;

        System.out.println("(int)above: " + Math.round(above));
        System.out.println("(int)below: " + Math.round(below));
        System.out.println("(int)fabove: " + Math.round(fabove));
        System.out.println("(int)fbelow: " + Math.round(fbelow));

    }
}