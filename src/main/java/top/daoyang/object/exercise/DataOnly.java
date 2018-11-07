package top.daoyang.object.exercise;

public class DataOnly {
    int i;
    double d;
    float c;
    boolean b;

    public static void main(String[] args) {
        DataOnly dataOnly = new DataOnly();
        dataOnly.i = 0;
        dataOnly.d = 10d;
        dataOnly.b = true;
        dataOnly.c = 0.0f;

        System.out.println(dataOnly.c);
    }
}