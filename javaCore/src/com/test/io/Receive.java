package com.test.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by Administrator on 2017/7/31 0031.
 * 管道输ru流测试
 */
public class Receive implements Runnable {
    private PipedInputStream pis =null;

    public PipedInputStream getPis() {
        return pis;
    }

    public void setPis(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
       byte c[] = new byte[1024];
       int len=0;
        try {

           len= this.pis.read(c);
           System.out.println(new String(c,0,len));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Receive(  ){
        this.pis=new PipedInputStream();
    }
}
