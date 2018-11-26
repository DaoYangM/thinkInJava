package top.daoyang.reusing;

public class SpaceShip extends SpaceShipControls {
    private String name;
    private SpaceShip(String name) {
        this.name = name; 
    }

    @Override
    public String toString() {
        return name;
    }

    public void forward() {
        System.out.println("SpaceShip " + name + " forward");
    }

    public static void main(String[] args) {
        SpaceShip spaceShip = new SpaceShip("NSEA Protector");
        spaceShip.forward();
    }
}