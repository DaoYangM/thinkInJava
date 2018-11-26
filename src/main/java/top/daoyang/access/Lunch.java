package top.daoyang.access;

class Soup1 {
    private Soup1() {}

    public static Soup1 makeSoup() {
        return new Soup1();
    }
}

class Soup2 {
    private Soup2() {}

    private static Soup2 ps1 = new Soup2();
    
    public static Soup2 access() {
        return ps1;
    }

    public void f() {}
}

class Soup3 {
    private Soup3() {}

    private static Soup3 soup3;

    public static Soup3 access() {
        if (soup3 == null) {
            synchronized(Soup3.class) {
                if (soup3 == null)
                    return new Soup3();
            }
        }
        return soup3;
    }

}
public class Lunch {
    
}