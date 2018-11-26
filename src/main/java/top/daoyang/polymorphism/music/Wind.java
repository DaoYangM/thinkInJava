package top.daoyang.polymorphism.music;

public class Wind extends Instruments {

    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}
