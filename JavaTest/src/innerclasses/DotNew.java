package innerclasses;

/**
 * Created by King on 2016/2/2.
 * 想要直接创建内部类的对象，必须使用外部类的对象来创建该内部类的对象，
 * 在拥有外部类对象之前是不可能创建内部类对象的（嵌套类（静态内部类）除外）
 */
public class DotNew {
    public class Inner{}
    public static void main(String[] args){
        DotNew d = new DotNew();
        DotNew.Inner di = d.new Inner();
//        DotNew.Inner di2 = new DotNew.Inner();//ERROR
    }
}
