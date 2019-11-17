package Cp_10.Code;

public class Factories {
    public static void serviceConsumer(ServiceFactory factory){
        Service s=factory.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implentation1.factory);
        serviceConsumer(Implentation2.factory);
    }
}
interface Service{
    void method1();
    void method2();
}
interface ServiceFactory{
    Service getService();
}

class Implentation1 implements Service{
    private Implentation1(){}


    @Override
    public void method1() {
        System.out.println("implementation1 method1");
    }

    @Override
    public void method2() {
        System.out.println("implementation1 method2");
    }
    public static ServiceFactory factory=new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implentation1();
        }
    };
}
class Implentation2 implements Service{
    @Override
    public void method1() {
        System.out.println("implentation2 method1");
    }

    @Override
    public void method2() {
        System.out.println("implentation2 method2");
    }

    private Implentation2(){}

    public static ServiceFactory factory=new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implentation2();
        }
    };
}

