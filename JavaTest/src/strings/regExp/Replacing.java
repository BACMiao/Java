package strings.regExp;


import com.sun.javafx.image.BytePixelSetter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by King on 2016/2/6.
 */
public class Replacing {
    static String s = "abcd3456sjg";
    public static void main(String[] args){
        System.out.println(s.replaceFirst("\\d","HH"));//把第一个数字替换成HH
        System.out.println(s.replaceAll("\\d", "？"));//把所有数字替换成？

        Pattern p = Pattern.compile("java", Pattern.CASE_INSENSITIVE);//指定一个CASE_INSENSITIVE（忽略大小写）常量来指定编译的规则
        Matcher m = p.matcher("java Java JAva JAVA jAva jAVA I love JAVa kdlsldk");
        //输出所有各种各样的java
//        while (m.find()){
//            System.out.println(m.group());
//        }
        //将所有java转换为JAVA
//        System.out.println(m.replaceAll("JAVA"));
        //将单数的转换为java，将双数的转换为JAVA
        StringBuffer buf = new StringBuffer();//构造一个其中不带字符的字符串缓冲区，初始容量为 16 个字符。
        int i = 0;
        while (m.find()){
            i++;
            if (i%2==0)
                m.appendReplacement(buf,"JAVA");//替换当前的
            else
                m.appendReplacement(buf,"java");
        }
        m.appendTail(buf);//将最后的kdlsldk添加到buf的最后
        System.out.println(buf);
    }
}
