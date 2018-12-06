package top.daoyang.innerclasses;

public interface ClassInInterface {
    void howdy();

    class Test implements ClassInInterface {

        @Override
        public void howdy() {
            System.out.println("Howwdy!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
