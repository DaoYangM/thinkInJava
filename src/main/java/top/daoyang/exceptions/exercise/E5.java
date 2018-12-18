package top.daoyang.exceptions.exercise;

/**
 * E5
 */
public class E5 {

    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            try {
                throw new MyException("true");
            } catch (MyException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                i++;
            }
        }
        System.out.println("final");
    }
}