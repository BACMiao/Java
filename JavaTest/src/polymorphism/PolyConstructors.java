package polymorphism;

/**
 * Created by King on 2016/1/31.
 *
 * 初始化的实际过程为：
 * 1.在其他任何事物发生前，将分配给对象的存储空间初始化为二进制的零
 * 2.调用基类构造器
 * 3.按声明顺序调用成员的初始化方法
 * 4.调用导出类构造器主体
 *
 */

class Glyph{
    void draw(){
        System.out.println("Glyph.draw()");
    }
    Glyph(){
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph{
    private int radius = 1;
    RoundGlyph(int r){
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph().radius = " + radius);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph.draw().radius = " + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args){
        new RoundGlyph(5);
    }
}

/**
 *output:
 *
 Glyph() before draw()
 RoundGlyph.draw().radius = 0
 Glyph() after draw()
 RoundGlyph.RoundGlyph().radius = 5
 *
 */
