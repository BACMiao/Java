package io;

import java.io.File;
import java.io.IOException;

/**
 * Created by King on 2016/2/22.
 */
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("E:\\computer\\la1234.txt");//File.separator设置分隔符
        System.out.println(file.exists());//exists()判断文件/文件夹是否存在
//        File file2 = new File("E:\\computer\\123");
//        System.out.println(file2.exists());
//        if (!file2.exists()){
//            file2.mkdir();//mkdir()创建文件夹，mkdirs()创建多级文件夹目录
//        }
//        else{
//            file2.delete();//delete()删除文件/文件夹
//        }
//        //是否是一个文件夹
//        System.out.println(file2.isDirectory());
//        //是否是一个文件
//        System.out.println(file.isFile());
//
//        File file3 = new File("E:\\computer\\123.txt");
//        if (!file3.exists()){
//            try {
//                file3.createNewFile();//createNewFile()创建文件
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }else {
//            file3.delete();
//        }
        System.out.println(file.getAbsolutePath());
        System.out.println(file);
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getName());
        System.out.println(file.getParent());//父文件夹的路径(toString)
        System.out.println(file.getParentFile());
    }
}
