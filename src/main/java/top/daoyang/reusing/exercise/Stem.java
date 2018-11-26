package top.daoyang.reusing.exercise;

class Component1 {
    Component1() {
        System.out.println("Component1");
    }
}

class Component2 {
    Component2() {
        System.out.println("Component2");
    }
}
class Component3 {
    Component3() {
        System.out.println("Component3");
    }
}

class Root {
    private Component1 component1 = new Component1();
    private Component2 component2 = new Component2();
    private Component3 component3 = new Component3();

    public Root() {
        System.out.println("Root");
    }
}

public class Stem extends Root {
    public static void main(String[] args) {
        Stem x = new Stem();
    }
}