package Cp_14.Code;

interface HasBatteries{}

interface Waterproof{}

interface Shoots{}



public class ToyTest {
    static void printInfo(Class c){
        System.out.println("class name:"+c.getName()+" is interface?["+c.isInterface()+"]");
        System.out.println("simple name:"+c.getSimpleName());
        System.out.println("canonical name:"+c.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c=null;
        try {
            c=Class.forName("Cp_14.Code.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("can't find fancy toy");
        }

        printInfo(c);
        for(Class cc:c.getInterfaces()){
            printInfo(cc);
        }
        Class up=c.getSuperclass();
        Object o=null;

        try {
            o=up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("couldn't instantiate");
            e.printStackTrace();
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("can't access");
            e.printStackTrace();
            System.exit(1);
        }
        printInfo(o.getClass());


    }
}
class Toy{
    Toy(){}

    Toy(int i){}
}

class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots{
    FancyToy(){
        super(1);
    }
}


