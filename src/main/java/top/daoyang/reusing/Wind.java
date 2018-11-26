package top.daoyang.reusing;

class Instrument {
    public String name;
    public void play() {}
    static void tune(Instrument i) {
        i.play();
    }
}

public class Wind extends Instrument {
    private int age;
    public static void main(String[] args) {
        Instrument flute = new Wind();
        Instrument.tune(flute);
    }
}