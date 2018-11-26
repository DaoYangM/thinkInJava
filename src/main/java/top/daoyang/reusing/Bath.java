package top.daoyang.reusing;

class Soap {
    private String s;
    Soap() {
        System.out.println("Soap()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}

public class Bath {
    private String
        s1 = "Happy",
        s2 = "Happy",
        s3, s4;
    private Soap castille;
    private int i;
    private float toy;
    public Bath() {
        System.out.println("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap();
    }

    {
        i = 47;
    }

    public static void main(String[] args) {
        Bath b = new Bath();
    }
}