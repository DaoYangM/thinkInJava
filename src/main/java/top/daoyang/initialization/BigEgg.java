package top.daoyang.initialization;

class Egg {
    private Yolk y;

    public Egg() {
        System.out.println("New Egg()");
        y = new Yolk();
    }
    protected class Yolk {
        public Yolk() {
            System.out.println("Egg.Yolk()");
        }
    }
}
public class BigEgg extends Egg {
    public BigEgg() {
        System.out.println("BigEgg");
    }

    public class Yolk {
        public Yolk() {
            System.out.println("BigEgg.Yolk()");
        }
    }

    public static void main(String[] args) {
        new BigEgg();
    }
}
