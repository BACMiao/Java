package io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * Created by King on 2016/2/23.
 */
public class refDemo {
    public static void main(String[] args) throws IOException{
        File file = new File("E:\\computer\\123.txt");
        if (!file.exists()){
            file.createNewFile();
        }

        RandomAccessFile ref = new RandomAccessFile(file, "rw");
        //指针的位置
        System.out.println(ref.getFilePointer());
        ref.write('A');
        System.out.println(ref.getFilePointer());
        int i = 123;
        ref.writeInt(i);
        System.out.println(ref.getFilePointer());
        String s = "天启";
        byte[] by = s.getBytes("utf-8");
        ref.write(by);
        System.out.println(ref.getFilePointer());
        //读文件，必须把指针移到头部
        ref.seek(0);
        byte[] buf = new byte[(int)ref.length()];
        ref.read(buf);
        System.out.println(Arrays.toString(buf));
        for (byte b : buf){
            System.out.println(Integer.toHexString(b & 0xff));
        }
        ref.close();
    }
}
