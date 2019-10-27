package Cp_08.Code;

class Glyph{
    void draw(){
        System.out.println("glyph.draw()");
    }
    Glyph(){
        System.out.println("glyph() before draw()");
        draw();
        System.out.println("glyph() after draw()");
    }

}

class RoundGlyph extends Glyph{
    private int radius=1;
    RoundGlyph(int r){
        radius=r;
        System.out.println("roundglyph.roundglyph(),radius="+radius);
    }
    void draw(){
        System.out.println("roundglyph.draw().radius="+radius);
    }
}


public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
