package com.test.io;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by Administrator on 2017/7/31 0031.
 * 字符集问题
 */
public class CharSetDemo {
   public static void main(String[] args) throws Exception{
     /*  //得到当前系统编码
        System.err.println(System.getProperty("file.encoding"));
    //模拟乱码的产生
       File f = new File("c:"+File.separator+"IOTest"+File.separator+"io1.txt");
       FileOutputStream os = new FileOutputStream(f);
       byte b[] = "这个".getBytes("ISO8859-1");

       String c=new String(b,"ISO8859-1" );
       c= new String(b, "utf-8");
       System.out.println(c);
       os.write(c.getBytes());
       os.close();*/
       String localChartSet = System.getProperty("file.encoding");
       System.out.println("localChartSet>>>>"+localChartSet);   //查看本地默认字符集

       String  str ="aaaa中文的";
       byte[] gbkbt = str.getBytes("ISO8859-1");
       byte[] utfbt = str.getBytes("GBK");
       byte[] bt = str.getBytes();

       String  gbkstr= new String(gbkbt, "ISO8859-1");  //string 与byte[] 转换时字符集要保持一致
       String  utfstr= new String(utfbt, "GBK");
       str= new String(bt);

       System.out.println("gbkstr>>>>"+gbkstr);
       System.out.println("utfstr>>>>"+utfstr);
       System.out.println("str>>>>"+str);


       gbkstr= new String(gbkbt, "gbk");   //转换时字符集要保持一致 否则中文会出乱码
       utfstr= new String(utfbt, "GB2312");
       str= new String(bt, "GB2312");
       System.out.println("gbkstr>>>>"+gbkstr);
       System.out.println("utfstr>>>>"+utfstr);
       System.out.println("str>>>>"+str);
   }

}
