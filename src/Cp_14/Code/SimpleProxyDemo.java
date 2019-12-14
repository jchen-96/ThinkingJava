package Cp_14.Code;

interface InterFace{
    void doSomething();
    void somethingElse(String arg);
}
class RealObject implements InterFace{
    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("something else "+arg);
    }
}

class SimpleProxy implements InterFace {
    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("something else"+arg);
        interFace.doSomething();
    }

    private InterFace interFace;

    public SimpleProxy(InterFace interFace){
        this.interFace=interFace;
    }
}

public class SimpleProxyDemo{
    public static void consumer(InterFace i){
        i.doSomething();
        i.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}





