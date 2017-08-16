package com.test.io;

import java.io.*;

/**
 * Created by Administrator on 2017/7/31 0031.
 */
public class InputStreamDemo {

    public static void main(String[] args){
        //1:使用file找文件
        File f = new File("c:"+File.separator+"IOTest"+File.separator+"io.txt");
        try  {
            //通过子类实例化父类对象
            InputStream opt = new FileInputStream(f);
            byte b[] = new byte[1024];
            int temp = 0 ;
            int len = 0 ;
            //进行读写操作
            while ((temp=opt.read())!=-1){
                b[len] = (byte) temp;
                len++;
            }
            //关闭流
            opt.close();
            System.err.println(new String(b,0,len));
        }catch (Exception e){

        }
    }
}
