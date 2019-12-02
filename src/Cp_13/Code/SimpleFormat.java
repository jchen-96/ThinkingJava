package Cp_13.Code;

public class SimpleFormat {
    public static void main(String[] args) {
        int x=5;
        double y=5.33322222;
        System.out.printf("Row 1:[%d %f]\n",x,y);
        System.out.format("Row 1:[%d %f]\n",x,y);
    }
}
