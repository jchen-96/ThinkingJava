package Cp_11.Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<T> c){
        super(c);
    }
    public Iterable<T> reverse(){
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current=size()-1;
                    @Override
                    public boolean hasNext() {
                        return current>-1;
                    }

                    @Override
                    public T next() {
                        return get(current--);
                    }
                    public void remove(){
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }


}
public class AdaptorMethodIdiom{
    public static void main(String[] args) {
        ReversibleArrayList<String> ral=new ReversibleArrayList<>(Arrays.asList("to be or not to be".split(" ")));
//        使用自己的迭代器
        for(String s:ral.reverse()){
            System.out.print(s+" ");
        }
        System.out.println();
        for(String s:ral){
            System.out.print(s+" ");
        }
        System.out.println();
    }



}
