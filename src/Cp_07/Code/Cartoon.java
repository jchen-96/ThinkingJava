package Cp_07.Code;

class Art{
    Art(){
        System.out.println("art constructor");
    }
}
class Drawing extends Art{
    Drawing(){
        System.out.println("drawing constructor");
    }
}



public class Cartoon extends Drawing {
    public Cartoon(){
        System.out.println("cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon x=new Cartoon();
    }
}
