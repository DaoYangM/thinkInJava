package top.daoyang.innerclasses.exercise;

public class Outer {
    private String s;

    public Outer(String s) {
        this.s = s;
    }

    class Inner {
        @Override
        public String toString() {
            return s;
        }
    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer("Hello").getInner();
        System.out.println(inner);
    }
}

class Test {
    Outer.Inner inner = new Outer("1").new Inner();
}
