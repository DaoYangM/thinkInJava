package top.daoyang.reusing;

class Poppet {
    private int i;
    public Poppet(int i) {
        this. i = i;
    }
}

public class BlankFinal {
    private final int i = 0;
    private final int j;
    private final Poppet p; 
    public static final int d;
    
    static {
        d = 10;
    }
    public BlankFinal() {
        j = 1;
        p = new Poppet(1);
    }

    public BlankFinal(int x) {
        j = x;
        p = new Poppet(x);
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(11);
    }
}