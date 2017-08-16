package com.test.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by Administrator on 2017/7/31 0031.
 */
public class OutputStreamDemo {

    public static void main(String[] args){
        //1:使用file找文件
        File f = new File("c:"+File.separator+"IOTest"+File.separator+"io.txt");
        try  {
            //通过子类实例化父类对象
            OutputStream opt = new FileOutputStream(f,true);//加上true，代表直接向文件末尾追加内容
            String str = "\r\n hello"; //"\r\n" 是文件内容换行的意思
            //OutputStream只能写入字节数组
            //进行读写操作
            opt.write(str.getBytes());
            //关闭流
            opt.close();
        }catch (Exception e){

        }
    }
}
