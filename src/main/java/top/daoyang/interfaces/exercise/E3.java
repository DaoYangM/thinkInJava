package top.daoyang.interfaces.exercise;

public abstract class E3 {
    public abstract void print();

    public E3() {
        print();
    }
}

class E3Imp extends E3 {
    private int a = 10;

    @Override
    public void print() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        E3Imp e3Imp = new E3Imp();
        e3Imp.print();
    }
}
