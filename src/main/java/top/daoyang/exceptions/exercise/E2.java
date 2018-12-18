package top.daoyang.exceptions.exercise;

/**
 * E2
 */
public class E2 {

    public static void main(String[] args) {
        Object o = null;
        try {
            o.hashCode();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException catch");
        }
    }
}