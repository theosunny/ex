package com.test.io;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * Created by Administrator on 2017/7/31 0031.
 * 管道输出流测试
 */
public class Send implements Runnable {
    private PipedOutputStream pos =null;

    public PipedOutputStream getPos() {
        return pos;
    }

    public void setPos(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        String str = "管道流测试";
        try {
            this.pos.write(str.getBytes());
            this.pos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public    Send(){
        this.pos=new PipedOutputStream();
    }
}
