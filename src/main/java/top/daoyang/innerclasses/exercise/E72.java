package top.daoyang.innerclasses.exercise;

public class E72 {
    private String test;

    private void t() {

    }

    class T {
        public void change() {
            test = "123";
        }
    }

    public T getT() {
        return new T() {
            @Override
            public void change() {
                System.out.println("Change");
                super.change();
            }
        };
    }

    public static void main(String[] args) {
        E72 e72 = new E72();
        e72.getT().change();
    }
}
