package top.daoyang.innerclasses;

public class DotNew {
    public class Inner {}

    public static void main(String[] args) {
        DotNew.Inner inner = new DotNew().new Inner();
    }
}
