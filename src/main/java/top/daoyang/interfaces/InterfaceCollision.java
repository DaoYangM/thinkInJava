package top.daoyang.interfaces;

interface I1 { void f();}

interface I2 {
    int d = 0;
    void f(int i);
}

interface I3 { int f();}

class C {
    public int f() {
        return 1;
    }
}

class C2 implements I1, I2 {

    @Override
    public void f() {
    }

    @Override
    public void f(int i) {

    }
}

class C3 extends C implements I2 {

    @Override
    public void f(int i) {

    }
}

class C4 extends C implements I3 {

}

//class C5 extends C implements I1 {
//
//}
public class InterfaceCollision {
}
