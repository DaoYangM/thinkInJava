package top.daoyang.exceptions.exercise;

/**
 * E1
 */
public class E1 {

    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Catch exception");
        } finally {
            System.out.println("Finally");
        }
    }
}