package innerclasses;

import java.util.Objects;

/**
 * Created by King on 2016/2/2.
 */

interface Selector{
    boolean end();
    Object current();//当前的
    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size){
        items = new Object[size];
    }
    public void add(Object x){
        if (next < items.length)
            items[next++] = x;//先赋值后++
       // System.out.print(next + " ");
    }

    private class SequenceSelector implements Selector{
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length)
                i++;
        }
    }

    public Selector selector(){
        return new SequenceSelector();
    }

    public static void main(String[] args){
        Sequence sequence = new Sequence(10);
        for (int i=0; i<10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while (!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
