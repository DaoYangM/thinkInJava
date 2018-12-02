package top.daoyang.interfaces;

interface Game { boolean move(); }
interface GameFactory { Game getGame(); }

abstract class AbstractGame implements Game {

    private int moves = 0;
    private final int count;
    public AbstractGame(int count) {
        this.count = count;
    }
    @Override
    public boolean move() {
        doSomething();
        return ++moves != count;
    }

    protected abstract void doSomething();
}
class Checkers extends AbstractGame {

    public Checkers(int count) {
        super(count);
    }

    @Override
    protected void doSomething() {
        System.out.println("Checkers do something");
    }
}

class CheckersFactory implements GameFactory {
    public Game getGame() {
        return new Checkers(4);
    }
}

class Chess extends AbstractGame {

    public Chess(int count) {
        super(count);
    }

    @Override
    protected void doSomething() {
        System.out.println("Chess do something");
    }
}

class ChessFactory implements GameFactory {

    @Override
    public Game getGame() {
        return new Chess(3);
    }
}
public class Games {
    public static void playGame(GameFactory factory) {
        Game game = factory.getGame();
        while (game.move()) {}
    }

    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }
}
