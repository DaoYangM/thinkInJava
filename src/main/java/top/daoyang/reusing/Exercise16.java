package top.daoyang.reusing;

import top.daoyang.reusing.exercise.Exercise15;

public class Exercise16 extends Exercise15 {
    public static void main(String[] args) {
        Exercise16 a = new Exercise16();
        a.test();    
    }

    @Override
    protected void test() {
        System.out.println("16");
    }
}