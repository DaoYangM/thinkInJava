package top.daoyang.polymorphism.shape;

public class Shapes {
    private static RandomShapeGenerator randomShapeGenerator = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];
        for (int i = 0; i < 9; i++) {
            shapes[i] = randomShapeGenerator.next();
        }

        for (Shape shape:
             shapes) {
            shape.draw();
            shape.erase();
            shape.hei();
        }
    }
}
