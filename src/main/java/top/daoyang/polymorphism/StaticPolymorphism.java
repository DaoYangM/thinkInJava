package top.daoyang.polymorphism;

class StaticSuper {
    public static void staticGet() {
        System.out.println("Base staticGet()");
    }

    public String dynamicGet() {
        return "Base dynamicGet";
    }
}

class StaticSub extends StaticSuper {
    public static void staticGet() {
        System.out.println("Derived staticGet()");
    }
    public String dynamicGet() {
        return "Derived dynamicGet";
    }
}
public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup = new StaticSub();
        System.out.println(sup.dynamicGet());
        sup.staticGet();
    }
}
