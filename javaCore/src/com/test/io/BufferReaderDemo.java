package com.test.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2017/7/31 0031.
 * bufferReader 缓冲读取流，类似于从缓冲区读取数据，所有输入数据都放在缓冲区，且只能接受字符流。所以必须用inputStreamReader转换
 */
public class BufferReaderDemo {
    public static void main(String[] args){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入");
        String in =null;
        try {
            in = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.err.println(in);
    }
}
