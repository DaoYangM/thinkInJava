package top.daoyang.initialization;

public class Flower {
    int petalCount = 0;
    String s = "initial value";
    
    Flower(int petals) {
        petalCount = petals;
    }

    Flower(String s) {
        this.s = s;
    }

    Flower(String s, int petals) {
        this(petals);
        this.s = s;
        System.out.println("String & int args");
    }

    Flower() {
        this("h1", 47);
        System.out.println("default constructor (no args)");
    }

    void printPetalCount() {
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }
    public static void main(String[] args) {
        Flower flower = new Flower();
        flower.printPetalCount();   
    }
}