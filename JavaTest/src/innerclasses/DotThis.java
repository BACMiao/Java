package innerclasses;

/**
 * Created by King on 2016/2/2.
 */
public class DotThis {
    void f(){
        System.out.println("DotThis.f()");
    }
    public class Inner{
        public DotThis outer(){
            return DotThis.this;//访问外层类对象,就可以使用外层类名.this来访问
        }
        public void outer2(){
            DotThis.this.f();
        }
        public void outer3() {
            f();
        }
    }
    public Inner inner(){
        return new Inner();
    }
    public static void main(String[] args){
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
        dti.outer2();
        dti.outer3();
    }
}
