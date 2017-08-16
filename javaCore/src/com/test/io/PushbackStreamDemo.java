package com.test.io;

import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;

/**
 * Created by Administrator on 2017/7/31 0031.
 * 回退流
 */
public class PushbackStreamDemo {
    public static void main(String[] args){
     String str = "www.bb.com";
        try   {
            ByteArrayInputStream bis = new ByteArrayInputStream(str.getBytes());
            PushbackInputStream pis = new PushbackInputStream(bis);
            System.err.println("读取后的数据为");
            int temp = 0 ;
            int len = 0 ;
            while ((temp=pis.read())!=-1){
                if (temp=='.'){
                    pis.unread(temp);//回退缓冲区
                    temp=pis.read();//空出此数据
                    System.err.println("退回数据为"+(char)temp);
                }else {
                    System.err.println((char)temp);
                }
            }
        }catch(Exception e){

        }
    }
}
