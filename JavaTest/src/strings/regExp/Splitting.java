package strings.regExp;

import java.util.Arrays;

/**
 * Created by King on 2016/2/5.
 * split()方法，其功能是“将字符串从正则表达式匹配的地方切开。”
 * 对比方法看holding包内的StackTest类9
 *
 */
public class Splitting {
    public static String knights = "Then, when you have found the shrubbery, you must " +
            "cut down the mightiest tree in the forest... " +
            "with... a herring!";
    public static void split(String regex){
        System.out.println(Arrays.toString(knights.split(regex)));
    }
    public static void main(String[] args){
        split(" ");
        split("\\W+");
        split("n\\W+");
    }
}
