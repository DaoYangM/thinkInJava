package top.daoyang.reusing;

class Gizmo {
    public void spin() {}
}

public class FinalArguments {
    void with(final Gizmo g) {
        // You can't cahnge reference of g;
    }

    void without(Gizmo g) {
        g = new Gizmo();
        g.spin();
    }

    int g(final int i) {
        // return i+1;
        return i + 1;
    }
}