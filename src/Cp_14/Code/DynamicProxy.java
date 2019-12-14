package Cp_14.Code;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.*;


public class DynamicProxy {
    public static void consumer(InterFace i){
        i.doSomething();
        i.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject realObject=new RealObject();
        consumer(realObject);

        InterFace proxy=(InterFace)Proxy.newProxyInstance(InterFace.class.getClassLoader(),
                new Class[]{InterFace.class},
                new DynamicProxyHandler(realObject)
        );
        consumer(proxy);
    }
}
class DynamicProxyHandler implements InvocationHandler{
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("*** proxy: "+proxy.getClass()+" ,method "+method+",args:"+args);
        if(args!=null){
            for (Object arg:args){
                System.out.println(" "+arg);
            }
        }
        return method.invoke(proxied,args);
    }

    private Object proxied;

    public DynamicProxyHandler(Object proxied){
        this.proxied=proxied;
    }

}

