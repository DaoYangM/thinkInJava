package top.daoyang.initialization;

class Bird2 {
    public Bird2(int i) {}

    public Bird2(double d) {}
}

public class NoSynthesis {
    public static void main(String[] args) {
        Bird2 bird2 = new Bird2(1);
        Bird2 bird3 = new Bird2(1.0d);
    }
}