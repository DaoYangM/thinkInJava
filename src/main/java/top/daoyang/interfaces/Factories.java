package top.daoyang.interfaces;

interface Service {
    void method1();
    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Implementation1 implements Service {
    public void method1() {}
    public void method2() {}
}

class ImplementationFactory implements ServiceFactory {
    public Service getService() { return new Implementation1(); }
}

class Implementation2 implements Service {
    public void method1() {}
    public void method2() {}
}

class ImplementationFactory2 implements ServiceFactory {
    public Service getService() {
        return new Implementation2();
    }
}
public class Factories {
    public static void serviceConsumer(ServiceFactory factory) {
        Service service = factory.getService();
        service.method1();
        service.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new ImplementationFactory());
        serviceConsumer(new ImplementationFactory2());
    }
}
