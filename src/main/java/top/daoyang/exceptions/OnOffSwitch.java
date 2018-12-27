package top.daoyang.exceptions;

public class OnOffSwitch {
    private static Switch sw = new Switch();

    public static void f() throws OnOffException1, OnOffException2 {
    }

    public static void main(String[] args) {
        try {
            sw.on();
            f();
            sw.off();
        } catch (OnOffException2 | OnOffException1 onOffException2) {
            onOffException2.printStackTrace();
            sw.off();
        }
    }
}
