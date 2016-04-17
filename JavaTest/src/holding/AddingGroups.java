package holding;


import java.util.*;

/**
 * Created by King on 2016/2/2.
 *
 * 1.Arrays.asList()方法接受一个数组或是一个用逗号分隔的元素列表，并将其转为一个List对象。
 * 2.Collections.addAll()方法接受一个Collection对象，以及一个数组或是一个用逗号分隔的元
 * 素列表，将元素添加到Collection中。
 * 3.直接使用Arrays.asList()输出的值，直接将其赋给list对象，但在这种情况下，
 * Arrays.asList()括号内值的数就是数组长度。
 *
 */
public class AddingGroups {
    public static void main(String[] args){
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        Integer[] moreInts = {6,7,8,9,10};
        collection.addAll(Arrays.asList(moreInts));
//        for (Integer c:collection){
//            System.out.println(c + " ");
//        }
        Collections.addAll(collection, 11,12,13,14,15);
        Collections.addAll(collection,moreInts);
//        for (Integer c:collection){
//            System.out.println(c + " ");
//        }
        List<Integer> list = Arrays.asList(16,17,18,19,20);
//        for (Integer c:list){
//            System.out.println(c + " ");
//        }
        list.set(1,99);//把下标为1的元素修改为99。
        list.add(21);//error
    }
}
