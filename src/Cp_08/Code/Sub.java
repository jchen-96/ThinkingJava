package Cp_08.Code;

class Super{
    public int field=0;
    public int getField(){
        return field;
    }
}


public class Sub extends Super{
    public int field=1;
    public int getField(){
        return field;
    }

    public int getSuperField(){
        return super.getField();
    }
    public static void main(String[] args) {
        Super sup=new Sub();
        System.out.println(sup.field);//这里输出的值是0而不是1
        System.out.println(sup.getField());

        Sub sub=new Sub();
        System.out.println(sub.field);
        System.out.println(sub.getField());
        System.out.println(sub.getSuperField());
    }
}
