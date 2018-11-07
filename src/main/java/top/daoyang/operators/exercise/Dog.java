package top.daoyang.operators.exercise;

public class Dog {
    private String name;
    private String says;

    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.says = "Ruff!";
        spot.name = "spot";

        Dog scruffy = new Dog();
        scruffy.name = "scruffy";
        scruffy.says = "Wurf!";

        Dog g = spot;

        System.out.println("g == spot: " + (g == spot));
        System.out.println("g.equals(spot): " + g.equals(spot));
    }
}