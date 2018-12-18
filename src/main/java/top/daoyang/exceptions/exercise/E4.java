package top.daoyang.exceptions.exercise;

/**
 * E4
 */

class MyException extends Exception {
    private String msg;
    public MyException(String msg) {
        super(msg);
        this.msg = msg;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }
}

public class E4 {
    private static void g() throws MyException {
        throw new MyException("g()");
    }
    public static void main(String[] args) {
        try {
            g();
        } catch (MyException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMsg());
        }
    }
}