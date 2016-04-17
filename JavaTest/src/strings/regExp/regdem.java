package strings.regExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by King on 2016/2/6.
 */
public class regdem {
    public static void main(String[] args){
        Pattern p = Pattern.compile("[a-z]{3}");//先把编译后的结果赋给对象p，使程序运行速度加快
        Matcher m = p.matcher("fgh");//将fgh以及p匹配的结果传递给对象m，可以调用Matcher中更多方法
        System.out.println(m.matches());
        //以上三句（15-17）等效于下面这句
        System.out.println("fgh".matches("[a-z]{3}"));
        System.out.println("1------------");
        //边界匹配符
        System.out.println("hello sir".matches("^h.*"));//^一行的起始
        System.out.println("hello sir".matches(".*ir$"));//$一行的结束
        System.out.println("hello sir".matches("^h[a-z]{1,3}o\\b.*"));//\b词的边界（单词后的空白符）
        System.out.println("hellosir".matches("^h[a-z]{1,3}o\\b.*"));
        System.out.println("2------------");
        //matches_find_reset
        Pattern pa = Pattern.compile("\\d{3,5}");
        String s = "123-4566-11134-22";
        Matcher ma = pa.matcher(s);
        System.out.println(ma.matches());//调用matches方法，当匹配到第四个字符时发现不符合，就停止匹配，但前四个不会吐出来
        ma.reset();//让matches吐出吞下的，让ma回复原来的样子
        System.out.println(ma.find());//受到matches的影响
        System.out.println(ma.start() + "-" + ma.end());//start()方法是返回find()找到匹配的初始位置的索引值
        System.out.println(ma.find());                  //end()方法是返回find()不匹配的位置的索引值+1
        System.out.println(ma.start() + "-" + ma.end());
        System.out.println(ma.find());
        System.out.println(ma.start() + "-" + ma.end());
        System.out.println(ma.find());

        System.out.println(ma.lookingAt());
        System.out.println(ma.lookingAt());
        System.out.println(ma.lookingAt());
        System.out.println(ma.lookingAt());//每次都从字符串最开始的地方找
    }
}

