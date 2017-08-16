package com.test.io;

import java.io.IOException;

/**
 * Created by Administrator on 2017/7/31 0031.
 * 管道流主要在线程间进行通信。把输出流和输入流2个线程连接起来
 */
public class PipeStreamDemo  {
    public static void main(String[] args){
         Send send = new Send();
         Receive receive = new Receive();
        try {
            send.getPos().connect(receive.getPis());//将输出和输入连接起来
        } catch (IOException e) {
            e.printStackTrace();
        }
        new Thread(send).start();
        new Thread(receive).start();
    }
}
