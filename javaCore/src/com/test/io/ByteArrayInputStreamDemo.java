package com.test.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Created by Administrator on 2017/7/31 0031.
 * 内存流,一般生成临时文件时候会使用。不需要像文件流那样每次执行完还要删除，内存流关闭内存，文件自动消失
 * 使用内存流操作，将大写字母转换成小写字母
 */
public class ByteArrayInputStreamDemo {
    public static void main(String[] args) throws  Exception{
        String str ="HTLLL";
        ByteArrayInputStream bis = new ByteArrayInputStream(str.getBytes());
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int len = 0;
        int temp = 0 ;
        while ((temp=bis.read())!=-1){
            char c = (char)temp;
            bos.write(Character.toLowerCase(c));
        }
        String newStr = bos.toString();
        System.err.println(newStr);
        bis.close();
        bos.flush();
        bos.close();

    }

}

