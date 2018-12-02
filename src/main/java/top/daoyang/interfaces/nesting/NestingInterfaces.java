package top.daoyang.interfaces.nesting;

class A {
    interface B {
        void f();
    }

    public class BImp implements B {
        @Override
        public void f() {

        }
    }
    private class BImp2 implements B {
        @Override
        public void f() {

        }
    }

    public interface C {
        void f();
    }

    class CImp implements C {
        public void f() {}
    }
    private class CImp2 implements C {
        public void f() {}
    }

    private interface D {
        void f();
    }

    private class DImp implements D {
        public void f() {};
    }
    public class DImp2 implements D {
        public void f() {
            System.out.println("DImp2");
        }
    }
    public D getD() { return new DImp2();}

    private D dRed;
    public void receiveD(D d) {
        dRed = d;
        dRed.f();
    }
}

interface E {
    interface G {
        void f();
    }

    public interface H {
        void f();
    }

    void f();
}
public class NestingInterfaces {
    public class BImp implements A.B {
        public void f() {}
    }

    class CImp implements A.C {
        public void f() {}
    }

    class EImp implements E {
        public void f() {}
    }

    class EGImp implements E.G {
        public void f() {}
    }

    class EImp2 implements E {
        public void f() {}

        class EG implements E.G {
            public void f() {}
        }
    }

    public static void main(String[] args) {
        A a = new A();
        a.receiveD(a.getD());
    }
}