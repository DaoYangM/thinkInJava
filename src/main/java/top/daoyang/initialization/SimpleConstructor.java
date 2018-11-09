package top.daoyang.initialization;

class Rock {
    Rock() {
        System.out.print("Rock ");
    }

    Rock(int i) {
        System.out.print("Rock  " + i + " ");
    }
}

public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock(i);
        }
    }
}