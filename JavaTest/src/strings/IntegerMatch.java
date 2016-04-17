package strings;

/**
 * Created by King on 2016/2/5.
 *
 * 1.如果想表示一位数字，那么正则表达式应该是\\d
 * 2.“可能有一个负号，后面跟着一位或多位数字”：-?\\d+
 * 3.竖直线|则表示或操作。
 *
 */
public class IntegerMatch {
    public static void main(String[] args){
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("+911".matches("-?\\d+"));
        System.out.println("+911".matches("(-|\\+)?\\d+"));
    }
}
