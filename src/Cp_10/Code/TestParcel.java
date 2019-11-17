package Cp_10.Code;

public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p=new Parcel4();
        Contents c=p.contents();
        Destination d=p.destination("test");
    }
}
class Parcel4{
    private class PContents implements Contents{
        private int i=11;
        @Override
        public int value() {
            return i;
        }
    }
    protected  class PDestination implements Destination{
        private String label;
        @Override
        public String readLabel() {
            return label;
        }

        private PDestination(String whereto){
            label=whereto;
        }
    }

    public Destination destination(String s){
        return new PDestination(s);
    }
    public Contents contents(){
        return new PContents();
    }
}


interface Destination{
    String readLabel();
}
interface Contents{
    int value();
}
