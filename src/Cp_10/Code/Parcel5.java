package Cp_10.Code;

public class Parcel5 {
    public Destination destination(String s){
        class PDestination implements Destination{
            private String label;
            @Override
            public String readLabel() {
                return label;
            }

            private PDestination(String whereTo){
                label=whereTo;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p=new Parcel5();
        Destination destination=p.destination("test");
    }
}
