package com.test.io;

import java.io.*;

/**
 * Created by Administrator on 2017/7/31 0031.
 * 将文件复制
 */
public class CopyFileDemo {
    public static void main(String[] args) throws Exception {
        String src = "c:" + File.separator + "IOTest" + File.separator + "io.txt";
        String des = "c:" + File.separator + "IOTest" + File.separator + "io1.txt";
        String arrs[] = {src, des};
//        copyFile(arrs);
        System.err.println(0.00023*365);
    }

    public static void copyFile(String args[]) throws Exception {
        if (args.length != 2) { //判断是否是2个参数
            System.err.println("输入参数不正确");
            System.exit(-1);
//        return;
        }
        File f1 = new File(args[0]);//源文件路径
        File f2 = new File(args[1]);//目标文件路径

        InputStream is = new FileInputStream(f1);
        OutputStream os = new FileOutputStream(f2);
        int r = 0;
        int len = 0;
        if (os != null && is != null) {
            while ((r = is.read()) != -1) {
                os.write(r);
            }
        }
        os.flush();
        os.close();
        is.close();
    }
}
