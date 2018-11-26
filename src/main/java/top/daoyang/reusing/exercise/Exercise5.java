package top.daoyang.reusing.exercise;

class A {
    public A(int i) {
        System.out.println("A constructor");
    }
}

class B {
    public B(int i) {
        System.out.println("A constructor");
    }
}

public class Exercise5 extends A {
    private B b = new B(11);

    public Exercise5() {
        super(11);
    }
    public static void main(String[] args) {
        Exercise5 x = new Exercise5();
    }
} 