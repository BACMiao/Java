package io;

import java.io.File;

/**
 * Created by King on 2016/2/23.
 */
public class FileUtils {
    public static void listDirectory(File dir){
        if (!dir.exists()){
            throw new IllegalArgumentException("目录" + dir + "不存在");
        }
        else if (dir.isFile()){
            throw new IllegalArgumentException(dir + "不是目录");
        }
        else {
            File[] files = dir.listFiles();//返回的是直接子目录(文件)的抽象
            if (files!=null&&files.length>0) {
                for (File file : files) {
                    if (file.isDirectory()){
                        listDirectory(file); //递归
                    }
                    else {
                        System.out.println(file);
                    }
                }
            }
        }
    }
}
