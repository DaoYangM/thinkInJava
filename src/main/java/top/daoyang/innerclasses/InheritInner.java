package top.daoyang.innerclasses;

class WithInner {
    class Inner {}
}


public class InheritInner extends WithInner.Inner {
    InheritInner(WithInner withInner) {
        withInner.super();
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
