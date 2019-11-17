package Cp_10.Code;

public class DotNew {
    public class Inner{}

    public static void main(String[] args) {
        DotNew dotNew=new DotNew();
        Inner dni=dotNew.new Inner();
    }
}
