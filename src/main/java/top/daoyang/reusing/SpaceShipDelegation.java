package top.daoyang.reusing;

public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();
    
    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    public void back() {
        controls.back();
    }

    public void forward() {
        controls.forward();
    }
}