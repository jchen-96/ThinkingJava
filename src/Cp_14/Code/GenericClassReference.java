package Cp_14.Code;

public class GenericClassReference {
    public static void main(String[] args) {
//        说明这里是一个泛华的class对象
        Class intClass=int.class;

        Class<Integer> gengerClass=intClass;
        gengerClass=Integer.class;
//        illegal
        intClass=double.class;

//        gengerClass=double.class; illegal
    }
}
