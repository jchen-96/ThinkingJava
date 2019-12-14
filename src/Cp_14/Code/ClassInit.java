package Cp_14.Code;

import java.util.Random;

class Initable{
    static final int staticFinal=47;

    static final int staticFianl2=ClassInit.rand.nextInt(1000);
    static {
        System.out.println("init initable");
    }
}
class Initable2{
    static  int statiNonFianl=147;
    static {
        System.out.println("init initable2");
    }
}

class Initable3{
    static int staticNotFinal=74;
    static {
        System.out.println("init initable3");
    }
}


public class ClassInit {
    public static Random rand=new Random(47);

    public static void main(String[] args) throws Exception {
        Class initable=Initable.class;
        System.out.println("after creating initable ref");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFianl2);

        System.out.println(Initable2.statiNonFianl);
        Class initable3=Class.forName("Cp_14.Code.Initable3");
        System.out.println("after creating initable3 ref");
        System.out.println(Initable3.staticNotFinal);

    }
}
