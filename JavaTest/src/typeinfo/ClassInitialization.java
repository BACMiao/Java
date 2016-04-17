package typeinfo;

import java.util.Random;

/**
 * Created by King on 2016/2/10.
 */

class Initable{
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2{
    static int staticNonFinal = 147;
//    static final int staticNonFinal = 147;
    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3{
    static int staticNonFinal = 74;
    static {
        System.out.println("Initializing Initable3");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(47);
    public static void main(String[] args) throws Exception{
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");
        System.out.println(Initable.staticFinal);//编译期常量，不需要初始化就可读取
        System.out.println(Initable.staticFinal2);//将强制进行类的初始化
        System.out.println(Initable2.staticNonFinal);//如果一个域不是final，总是要在读取它之前，进行初始化
        Class initable3 = Class.forName("typeinfo.Initable3");//为了产生Class引用，Class.forName()立即进行初始化
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);
    }
}
