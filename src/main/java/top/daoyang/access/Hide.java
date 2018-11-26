package top.daoyang.access;

class Homer {
    char doh(char c) {
        System.out.println("doh(char)");
        return c;
    }

    float doh(float f) {
        System.out.println("doh(float)");
        return f;
    }
}

class Milhouse {}

class Bart extends Homer {
    void doh(Milhouse m) {
        System.out.println("Milhouse");
    }

    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse());
    }
}