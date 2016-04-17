package io;

import java.io.File;
import java.io.IOException;

/**
 * Created by King on 2016/2/23.
 */
public class FileUtilsTest {
    public static void main(String[] args) throws IOException{
        FileUtils.listDirectory(new File("E:\\computer\\Projects"));
    }
}
