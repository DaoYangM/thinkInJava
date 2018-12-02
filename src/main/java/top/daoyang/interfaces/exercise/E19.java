package top.daoyang.interfaces.exercise;

interface IPlayable {
    void play();
}

class Coin implements IPlayable {

    @Override
    public void play() {
        System.out.println("Playing Coin");
    }
}

class Dice implements IPlayable {

    @Override
    public void play() {
        System.out.println("Playing Dice");
    }
}

interface IPlayableFactory {
    IPlayable getPlayable();
}

class CoinFactory implements IPlayableFactory {

    @Override
    public IPlayable getPlayable() {
        return new Coin();
    }
}

class DiceFactory implements IPlayableFactory {

    @Override
    public IPlayable getPlayable() {
        return new Dice();
    }
}

public class E19 {
    public static void play(IPlayableFactory iPlayableFactory) {
        IPlayable playable = iPlayableFactory.getPlayable();
        playable.play();
    }

    public static void main(String[] args) {
        play(new CoinFactory());
        play(new DiceFactory());
    }
}
