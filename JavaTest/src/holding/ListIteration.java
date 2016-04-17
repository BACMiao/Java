package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by King on 2016/2/3.
 */
public class ListIteration {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(12,11,10,9,8,7,6,5,4));
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()){
            System.out.print(it.next() + "," +it.nextIndex() + "," +it.previousIndex() + ";  ");
        }
        System.out.println();
        while (it.hasPrevious())
            System.out.print(it.previous()+" ");
        System.out.println();
        System.out.print(list);
    }
}
