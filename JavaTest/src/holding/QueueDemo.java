package holding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by King on 2016/2/3.
 */
public class QueueDemo {
    public static void printQ(Queue queue){
        while (queue.peek()!=null)//peek()在不移除情况下返回队头，队列为空时返回null
            System.out.print(queue.remove() + " ");//remove()移除并返回队头
        System.out.println();
    }
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<Integer>();
        Random rand = new Random(47);
        for (int i=0; i<10; i++){
            queue.offer(rand.nextInt(i+10));//offer()将一个元素插入到队尾
        }
        printQ(queue);
        Queue<Character> qc = new LinkedList<Character>();
        for (char c : "Brontosaurus".toCharArray())
            qc.offer(c);
        printQ(qc);
    }
}
