package innerclasses;

/**
 * Created by King on 2016/2/2.
 */

interface Incrementable{
    void increment();
}

class Callee1 implements Incrementable{
    private int i = 0;

    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}

class MyIncrement{
    public void increment(){
        System.out.println("Other operation");
    }
    static void f(MyIncrement mi){
//        System.out.println("hhhhhhh");
        mi.increment();
    }
}

class Callee2 extends MyIncrement{
    private int i = 0;

    @Override
    public void increment() {
//        System.out.println("aaaaaaa");
        super.increment();
        i++;
        System.out.println(i);
//        System.out.println("nnnnnnn");
    }
    private class Closure implements Incrementable{
        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }
    Incrementable getCallbackReference(){
        return new Closure();
    }
}

class Caller{
    private Incrementable callbackReference;
    Caller(Incrementable cbh){
        callbackReference = cbh;
    }
    void go(){
        callbackReference.increment();
    }
}

public class CallBacks {
    public static void main(String[] args){
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);//Callee2向上传递MyIncrement,实际为调用Callee2中的incerment方法
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallbackReference());
        caller1.go();
        caller1.go();
        caller2.go();//实际有点像是Closure的对象
        caller2.go();
    }

}
