package top.daoyang.initialization;

public class AutoboxingVarargs {

    static void f(int ... args) {
        for (int var : args) {
            
            System.out.print(var + " "+ args.getClass());
            System.out.println(" length " + args.length);
        }
    }

    public static void main(String[] args) {
        f('a');
        f(1);
    }
}