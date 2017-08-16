package com.test.io;

import java.io.*;

/**
 * Created by Administrator on 2017/7/31 0031.
 * 字符流，文件写入。
 */
public class FileReaderDemo {

    public static void main(String[] args){
        //1:使用file找文件
        File f = new File("c:"+File.separator+"IOTest"+File.separator+"io.txt");
        try  {
            //通过子类实例化父类对象
            Reader opt = new FileReader(f);
            int temp = 0 ;
            int len = 0 ;
            char c[] = new  char[1024] ;
            //读写操作
            while ((temp=opt.read())!=-1){

                c[len] = (char) temp;
                len++;
            }
            //关闭流
            opt.close();
            System.out.print(new String(c,0,len));
        }catch (Exception e){

        }
    }
}
