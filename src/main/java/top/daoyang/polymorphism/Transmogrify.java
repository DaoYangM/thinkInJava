package top.daoyang.polymorphism;

class Actor {
    public void act() {}
}

class HappyActor extends Actor {
    @Override
    public void act() {
        System.out.println("HappyActor");
    }
}

class FoolActor extends Actor {
    @Override
    public void act() {
        System.out.println("FoolActor");
    }
}

class SadActor extends Actor {
    @Override
    public void act() {
        System.out.println("SadActor");
    }
}

class Stage {
    private Actor actor = new HappyActor();

    public void change(Actor actor) {
        this.actor = actor;
    }
    public void change2() {
        this.actor = new SadActor();
    }

    public void  performPlay() {
        actor.act();
    }
}
public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();

        stage.change(new FoolActor());
        stage.performPlay();

        stage.change2();
        stage.performPlay();
    }
}
