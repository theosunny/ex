package com.test.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by Administrator on 2017/7/31 0031.
 */
public class PrintStreamDemo1 {
    public static void main(String[] args){
//        System.setOut();
        try {
            PrintStream   ps = new PrintStream(new FileOutputStream(new File("c:"+File.separator+"IOTest"+File.separator+"io.txt")));
            ps.print("11");
            ps.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
