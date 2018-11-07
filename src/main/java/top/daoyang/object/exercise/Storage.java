package top.daoyang.object.exercise;

public class Storage {
    int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        Storage s = new Storage();
        System.out.println(s.storage("123"));
    }
}