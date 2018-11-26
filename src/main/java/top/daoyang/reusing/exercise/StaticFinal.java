package top.daoyang.reusing.exercise;

public class StaticFinal {
    public static final int a;
    public final int b;

    static {
        a = 0;
    }
    
    {
        b = 29;
    }
}