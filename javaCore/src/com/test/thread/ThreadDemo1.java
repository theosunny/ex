package com.test.thread;

/**
 * 继承thread类
 * Created by Administrator on 2017/7/28 0028.
 */
public class ThreadDemo1 extends Thread{
    private  int t = 10 ;
    @Override
    public void run() {
        for (int i = 0 ;i <1000; i++) {
            if (t > 0) {
                System.err.println("票数还余" + t--);
            }
        }
    }
    public static void main(String[] args){
       new  ThreadDemo1().start();
        new  ThreadDemo1().start();
        new  ThreadDemo1().start();

    }
}
