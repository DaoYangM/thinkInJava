package top.daoyang.innerclasses.exercise;

interface T20 {
    void f();

    class T21 {
        void d() {
            System.out.println("T20.d");
        }
    }
}

public class E20 implements T20 {
    @Override
    public void f() {
        System.out.println("f()");
    }

    public static void main(String[] args) {
        T20.T21 t21 = new T20.T21();
        t21.d();
    }
}
