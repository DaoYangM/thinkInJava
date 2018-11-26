package top.daoyang.reusing;

class WithFinals {
    private final void f() {System.out.println("WithFinals.f()");}
    private void g() {System.out.println("WithFinals.g()");} // Also automatically "final"
    public void test() {
        g();
    }
}

class OverridingPrivate extends WithFinals {
    public final void f() {System.out.println("OverridingPrivate.f()");}
    public void g() {System.out.println("OverridingPrivate.g()");}
}

public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate overridingPrivate = new OverridingPrivate();
        overridingPrivate.test();
    }
}