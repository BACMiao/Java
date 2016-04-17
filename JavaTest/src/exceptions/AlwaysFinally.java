package exceptions;

/**
 * Created by King on 2016/2/4.
 *
 * 异常处理机制会在跳到更高一层的异常处理程序之前，执行finally语句，
 * 当涉及break和continue、return语句时，finally子句也会得到执行
 */

class FourException extends Exception {}

public class AlwaysFinally {
    public static void main(String[] args){
        System.out.println("Entering first try block");
        try {
            System.out.println("Entering second try block");
            try {
                throw new FourException();
            }finally {
                System.out.println("Finally in 2nd try block");
            }
        }catch (FourException e){
            System.out.println("Caught FourException in 1st try block");
        }finally {
            System.out.println("Finally in 1st try block");
        }
    }
}
