package top.daoyang.polymorphism.music;

public class Music {
    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }

    static void tune(Instruments i) {
        i.play(Note.B_FLAT);
    }
}
