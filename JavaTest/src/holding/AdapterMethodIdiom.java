package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by King on 2016/2/3.
 */

class ReversibleArrayList<T> extends ArrayList<T>{
    public ReversibleArrayList(Collection<T> c){
        super(c);
    }
    public Iterable<T> reversed(){
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size()-1;
                    @Override
                    public boolean hasNext() {
//                        System.out.print("nnnnnnn");
//                        System.out.print(current);
                        return current>-1;
                    }

                    @Override
                    public T next() {
//                        System.out.print("mmmmmmm");
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

public class AdapterMethodIdiom {
    public static void main(String[] args){
        ReversibleArrayList<String> ral = new ReversibleArrayList<>(Arrays.asList("To be or not to be".split(" ")));
        for (String s : ral){
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : ral.reversed()){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
