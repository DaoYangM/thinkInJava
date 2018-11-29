package top.daoyang.polymorphism;

import java.util.ArrayList;

class Useful {
    public void f() {}
    public void g() {}
}

class MoreUseful extends Useful {
    public void f() {}
    public void g() {}
    public void e() {}
}
public class RTTI {

    public static void main(String[] args) {
        Useful[] x = {
                new Useful(),
                new MoreUseful()
        };

        x[0].f();
        x[1].g();

        ((MoreUseful)x[1]).e();
        ((MoreUseful)x[0]).e();
        new ArrayList<>();
    }
}
