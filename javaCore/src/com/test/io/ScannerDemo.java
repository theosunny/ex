package com.test.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/31 0031.
 */
public class ScannerDemo {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.err.println("请输入数据");
        System.err.println("输入数据为："+scanner.next());
        try {
            StringBuffer stringBuffer = new StringBuffer();
            Scanner fscanner = new Scanner(new File("c:"+File.separator+"IOTest"+File.separator+"io.txt"));//从文件读取
            if (fscanner.hasNext()){
                stringBuffer.append(fscanner.next()).append("\n");
            }
            System.err.println("从文件读取的数据为："+stringBuffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
