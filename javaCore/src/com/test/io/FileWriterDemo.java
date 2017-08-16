package com.test.io;

import java.io.*;

/**
 * Created by Administrator on 2017/7/31 0031.
 * 字符流，文件写入。
 */
public class FileWriterDemo {

    public static void main(String[] args){
        //1:使用file找文件
        File f = new File("c:"+File.separator+"IOTest"+File.separator+"io.txt");
        try  {
            //通过子类实例化父类对象
            Writer opt = new FileWriter(f,true);
            String str = "hrll";
            opt.write(str);
            opt.flush();
            //关闭流
            opt.close();
        }catch (Exception e){

        }
    }
}
