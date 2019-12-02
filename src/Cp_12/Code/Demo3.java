package Cp_12.Code;

class MyException extends Exception{
    public MyException(){}
    public MyException(String msg){
        super(msg);
    }
}

public class Demo3 {
    public static void main(String[] args) {
        try {
            test();
        } catch (MyException e) {
            System.out.println("catch my exception");;
            e.printStackTrace();
        }
    }

    public static void test() throws MyException{
        try {
            int i=10/0;
            System.out.println("i="+i);
        } catch (ArithmeticException e) {
            throw new MyException("this is MyException");
        }
    }
}



