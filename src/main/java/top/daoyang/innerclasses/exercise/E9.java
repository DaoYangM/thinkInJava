package top.daoyang.innerclasses.exercise;

interface T {
    void f();
}
public class E9 {

    public T getT() {
        return new T() {
            @Override
            public void f() {
                System.out.println("f()");
            }
        };
    }
}
