package Cp_10.Code;

class WithInner{
    class Inner{}
}

public class InheritInner  extends WithInner.Inner{
    InheritInner(WithInner withInner){
        withInner.super();
    }

    public static void main(String[] args) {
        WithInner wi=new WithInner();
        InheritInner ir=new InheritInner(wi);
    }
}
