package com.test.io;

import java.io.File;

/**
 * Created by Administrator on 2017/7/31 0031.
 * 列出指定目录下所有的文件
 */
public class FileDemo2 {
    public static void print(File f){
        if (f!=null){
            if(f.isDirectory()){
                File[] fs = f.listFiles();
                if(fs!=null){
                    for (int i = 0; i < fs.length; i++) {
                        print(fs[i]);
                    }

                }
            }else{
                System.err.println(f);
            }

        }

    }
    public static void main(String[] args){
     File f = new File("C:"+File.separator+"movie");
     print(f);
    }
}
