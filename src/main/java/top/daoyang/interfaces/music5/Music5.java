package top.daoyang.interfaces.music5;

import top.daoyang.polymorphism.music.Note;

interface Instrument {
    int VALUES = 5;
    void adjust();
}

interface Playable {
    void play(Note n);
}
class Wind implements Instrument, Playable {

    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion implements Instrument, Playable {

    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    @Override
    public String toString() {
        return "Percussion";
    }
}

class Stringed implements Instrument, Playable {

    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    @Override
    public String toString() {
        return "Stringed";
    }
}

class Brass implements Instrument, Playable {

    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {

    @Override
    public String toString() {
        return "Woodwind" + VALUES;
    }
}

public class Music5 {
    static void tune(Playable i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Playable[] e){
        for (Playable i :
                e) {
            tune(i);
        }
    }
    public static void main(String[] args) {
        Playable[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };

        tuneAll(orchestra);
    }
}
