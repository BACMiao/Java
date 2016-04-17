package innerclasses;

/**
 * Created by King on 2016/2/2.
 */

class D{}
abstract class E{}
class Z extends D{
    E makeE() {
        return new E(){};
    }
}

public class MultiImplementation {
    static void takeD(D d){}
    static void takeE(E e){}
    public static void main(String[] args){
        Z z = new Z();
        takeD(z);
        takeE(z.makeE());
    }
}
