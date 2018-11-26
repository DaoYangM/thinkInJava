package top.daoyang.polymorphism;

class Shared {
    private int refCount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("Creating " + this);
    }

    public void addRef() {
        this.refCount++;
    }

    protected void dispose() {
//        if (--refCount == 0)
//            System.out.println("Disposing " + this);
        --refCount;
    }

    @Override
    protected void finalize() throws Throwable {
        if (refCount == 0)
            System.out.println("GC happened");
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }
}

class Composing {
    private Shared shared;
    private static long count = 0;
    private final long id = count++;

    public Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    public void dispose() {
        System.out.println("disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing " + id;
    }
}
public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = {
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
        };

        for (Composing composing:
             composings) {
            composing.dispose();
        }
    }
}
