package com.test.io;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/7/31 0031.
 * File类，只对文件本身操作不对文件内容操作，如果操作文件内容是由RandomAccessFile
 */
public class FileDemo {
    public static void main(String[] args){
        File f = new File("C:\\IOTest");
        if (!f.exists()){
            f.mkdirs();
        }
        try {
            File f1 = new File("C:\\IOTest\\io.txt");
            File f2 = new File("C:\\IOTest\\io1.txt");
            f1.createNewFile();
            f2.createNewFile();
            //如果存在就删除
            if (f2.exists()){
                f2.delete();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
