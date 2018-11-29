package top.daoyang.polymorphism;

public interface Rodent {
    void eat();
}

class Mouse implements Rodent {
    public void eat() {
        System.out.println("Mouse.eat()");
    }
}

class Cerbil implements Rodent {
    public void eat() {
        System.out.println("Gerbil.eat()");
    }
}

class Hamster implements Rodent {
    public void eat() {
        System.out.println("Hamster.eat()");
    }
}

class Test {
    static void rodentEat(Rodent[] rodents) {
        for (Rodent r :
                rodents) {
            r.eat();
        }
    }
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Cerbil(),
                new Hamster(),
        };
        rodentEat(rodents);
    }
}
