package top.daoyang.interfaces.exercise;

interface Flyable {
    void fly();
}

interface Eatable {
    void eat();
}

interface Playable {
    void play();
}

interface Bird extends Flyable, Eatable, Playable {
    void ji();
}

abstract class AbstractJiBird implements Bird {
    @Override
    public void fly() {
        System.out.println("ab.fly()");
    }

    @Override
    public void eat() {
        System.out.println("ab.eat()");
    }

    @Override
    public void ji() {
        System.out.println("ab.ji()");
    }

    public abstract void play();
}

class RedJiBird extends AbstractJiBird {

    @Override
    public void play() {
        System.out.println("RedJiBird.play()");
    }
}
public class E14 extends AbstractJiBird {
    @Override
    public void play() {
        System.out.println("E14.paly()");
    }

    public static void play(Bird b) {
        b.play();
    }
    public static void main(String[] args) {
        RedJiBird redJiBird = new RedJiBird();
        E14 e14 = new E14();

        play(redJiBird);
        play(e14);
    }
}