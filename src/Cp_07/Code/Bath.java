package Cp_07.Code;



class Soap{
    private String s;

    Soap(){
        System.out.println("soap()");
        s="constructed";
    }
    public String toString(){
        return s;
    }
}


public class Bath{
    private String s1="happy",s2="happy",s3,s4;
    private Soap castille;
    private int i;
    private float toy;

    public Bath(){
        System.out.println("inside bath()");
        s3="joy";
        toy=3.14f;
        castille=new Soap();
    }
    {i=47;}

    @Override
    public String toString(){
        if(s4==null)
            s4="joy";
        return
                "s1="+s1+"\n"+"s2="+s2+"\n"+"s3="+s3+"\n"+"s4="+s4+"\n"+
                        "toy="+toy+"\n"+
                        "castille="+castille;
    }

    public static void main(String[] args) {
        Bath b=new Bath();
        System.out.println(b);
    }
}