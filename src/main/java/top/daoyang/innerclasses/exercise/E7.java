package top.daoyang.innerclasses.exercise;

public class E7 {

    private String a;

    private void test() {
    }

    class Test {
        private int s;
        void change() {
            a = "10";
            test();
        }
    }

    public Test getTest() {
        return new Test();
    }

    public static void main(String[] args) {
        E7 e7 = new E7();
        e7.getTest().change();
        System.out.println(e7.a);
    }
}
