package com.test.io;

import java.io.File;
import java.io.RandomAccessFile;

/**
 * Created by Administrator on 2017/7/31 0031.
 * 可以读取文件的内容
 */
public class RandomAccessFileDemo1 {
    public static void main(String[] args) throws  Exception{
        File f = new File("c:"+File.separator+"IOTest"+File.separator+"io.txt");
//        writeData(f);
        readData(f);
    }
    //向指定文件写入数据
    public static void  writeData(File f)  throws  Exception{
        RandomAccessFile raf = new RandomAccessFile(f,"rw");
        String name="zhangsan";
        int age=20;
        raf.writeBytes(name);
        raf.writeInt(age);
        name="lisi    ";
        age=21;
        raf.writeBytes(name);
        raf.writeInt(age);
        name="wangw   ";
        age=22;
        raf.writeBytes(name);
        raf.writeInt(age);
        raf.close();
    }
    //向指定文件写入数据
    public static void  readData(File f)  throws  Exception {
        RandomAccessFile raf = new RandomAccessFile(f,"r");
        String name = null;
        int age = 0;
        byte[] b = new byte[8];//准备空间读取姓名
        raf.skipBytes(12);
        for (int i = 0; i < b.length; i++) {
            b[i]=raf.readByte();
        }
        name =new String(b);
        age=raf.readInt();
        System.err.println("第二个人的姓名为："+name+",年纪为："+age);
        raf.seek(0);//文件头
        b = new byte[8];//准备空间读取姓名
//        raf.skipBytes(12);
        for (int i = 0; i < b.length; i++) {
            b[i]=raf.readByte();
        }
        name =new String(b);
        age=raf.readInt();
        System.err.println("第一个人的姓名为："+name+",年纪为："+age);
        b = new byte[8];//准备空间读取姓名
        //在进行这一段操作之后，文件指针已经指到第一个员工末尾了，所以你只要跳过12个字节就可到第三个员工的开头。
        raf.skipBytes(12);
        for (int i = 0; i < b.length; i++) {
            b[i]=raf.readByte();
        }
        name =new String(b);
        age=raf.readInt();
        System.err.println("第三个人的姓名为："+name+",年纪为："+age);
    }

}
