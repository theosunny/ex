package com.test.io;

import java.io.*;

/**
 * Created by Administrator on 2017/7/31 0031.
 */
public class InputStreamReaderDemo {
    public static void main(String[] args){
        File f = new File("c:"+ File.separator+"IOTest"+File.separator+"io.txt");
        Reader reader = null;

        try {
            reader=new InputStreamReader(new FileInputStream(f));

            char c[] =new char[1024];
            int len = reader.read(c);
            System.err.println(new String(c,0,len));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
