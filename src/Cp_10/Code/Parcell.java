package Cp_10.Code;



public class Parcell {
    class Contents{
        private int i;
        public int value(){
            return i;
        }
    }
    class Destination{
        private String label;
        Destination(String whereTo){
            label=whereTo;
        }
        String readLabel(){
            return label;
        }
    }
    public void ship(String dest){
        Contents contents=new Contents();
        Destination d=new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcell p=new Parcell();
        p.ship("tasmania");
    }
}
