package com.test.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.Writer;
import java.io.OutputStreamWriter;
/**
 * Created by Administrator on 2017/7/31 0031.
 * 将字节输出流转换成字符输出流
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args){
        File f = new File("c:"+ File.separator+"IOTest"+File.separator+"io.txt");
        Writer writer = null;
        try {
            writer = new  OutputStreamWriter(new FileOutputStream(f));
            writer.write("/r/n hell");//使用字符流输出
            writer.close();
        }catch (Exception e){

        }
    }
}
