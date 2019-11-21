package Cp_11.Code;

import java.util.*;

public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> c=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Integer[] moreInts={6,7,8,9,10};
        c.addAll(Arrays.asList(moreInts));
//        效率非常高的方式
        Collections.addAll(c,11,12,13,14,15);
        Collections.addAll(c,moreInts);
        List<Integer> list=Arrays.asList(16,17,18,19,20);//这种情况下，底层是数组，大小不可以改变
        list.set(1,99);
//        list.add(21);
        for(Integer i:list)
            System.out.print(i+",");
    }
}
