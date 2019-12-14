package Cp_14.Code;

class Candy{
    static {
        System.out.println("loading candy");
    }
}

class Gum{
    static {
        System.out.println("loading gum");
    }
}

class Cookie{
    static {
        System.out.println("loading cookie");
    }
}

public class SweepShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("after create candy");
        try {
//            这里的类路径要写完整的路径
            Class.forName("Cp_14.Code.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("couldn't find gum");
        }
        System.out.println("after class.forname(\"Gum\")");
        new Cookie();
        System.out.println("after create cookie");
    }
}



