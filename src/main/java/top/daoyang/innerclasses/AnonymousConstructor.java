package top.daoyang.innerclasses;

abstract class Base {
    public Base(int i) {
        System.out.println("Base constructor, i = " + i);
    }
    public void f() {
        System.out.println("In anonymous f()");
    }
}

public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {
                System.out.println("Instance initializer");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();

    }
}
