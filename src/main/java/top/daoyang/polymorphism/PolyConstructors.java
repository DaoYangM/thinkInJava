package top.daoyang.polymorphism;

class Glyph {

    static {
        System.out.println("Glyph.static");
    }

    public Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }

    public void draw() {
        System.out.println("Glyph.draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    static {
        System.out.println("RoundGlyph.static");
    }

    public RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.Constructor() " + radius);
    }
    @Override
    public void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    private int s = 10;
    public RectangularGlyph() {
        System.out.println("RectangularGlyph constructor" + s);
    }

    @Override
    public void draw() {
        System.out.println("RectangularGlyph.draw()" + s);
    }
}
public class PolyConstructors {
    public static void main(String[] args) {
        new RectangularGlyph();
    }
}
