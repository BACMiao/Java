package holding;

import java.util.Stack;

/**
 * Created by King on 2016/2/3.
 */
public class StackTest {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();
        for (String s:"My dog has fleas".split(" "))//split()方法是String类的一部分，它接受String类型的对象，
            stack.push(s);                          // 并以传递进来的参数作为边界，将该String对象分隔开，
                                                    //然后返回一个数组String[]。
        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }
}
