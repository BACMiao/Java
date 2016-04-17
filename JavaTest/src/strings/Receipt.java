package strings;

import java.util.Formatter;

/**
 * Created by King on 2016/2/5.
 */
public class Receipt {
    private Formatter f = new Formatter(System.out);
    public void printTitle(){
        f.format("%-15s %5s %10s\n","Item", "Qty", "Price");
        System.out.printf("%-15s %5s %10s\n","----", "---", "-----");
    }
    public void print(String name, int qty, double price){
        f.format("%-15.15s %5d %10.2f\n",name, qty, price);
    }
    public static void main(String[] args){
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Peas", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
    }
}
