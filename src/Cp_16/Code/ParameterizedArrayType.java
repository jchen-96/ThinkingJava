package Cp_16.Code;

public class ParameterizedArrayType {
    public static void main(String[] args) {
        Integer[] ints={1,2,3,4,5};
        Double[] doubles={1.1,1.2,1.3,1.4,1.6};

        Integer[] ints2=new ClassParameter<Integer>().f(ints);
        Double[] doubles1=new ClassParameter<Double>().f(doubles);

        ints2=MethodParameter.f(ints);
        doubles1=MethodParameter.f(doubles);
    }
}

class ClassParameter<T>{
    public T[] f(T[] arg){
        return arg;
    }
}
class MethodParameter{
//    这里的泛型必须放在T这里
    public static<T> T[] f(T[] arg){
        return arg;
    }
}