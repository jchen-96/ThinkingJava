package Cp_11.Code;

import java.util.ArrayList;

class Apple{
    private static long counter;
    private final long id=counter++;
    public long id(){
        return id;
    }
}
class Orange{}
public class ApplesAndOranges {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples=new ArrayList();
        for(int i=0;i<3;i++){
            apples.add(new Apple());
        }
        apples.add(new Orange());
        for(int i=0;i<apples.size();i++){
            ((Apple)apples.get(i)).id();
//            运行期才会抛出异常
        }
    }
}
