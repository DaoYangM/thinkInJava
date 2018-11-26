package top.daoyang.initialization.exercise;

public class Exercise19 {
    static void s(String... args) {
        for (String var : args) {
            System.out.println(var);
        }
    }

    public static void main(String[] args) {
        s(new String[]{"1", "2", "3"});
        s("4", "5", "6");
    }
}