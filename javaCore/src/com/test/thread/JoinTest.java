package com.test.thread;

/**
 * Created by Administrator on 2017/7/28 0028.
 */
public class JoinTest implements  Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.err.println(Thread.currentThread().getName()+ "运行 "+ i );
        }
    }
    public static void main(String[] args) throws InterruptedException {
       JoinTest j = new JoinTest();
       Thread t = new Thread(j,"A");
       t.start();
       for (int i=0;i<50;i++){
           if (i>10){
               t.join();
           }
           System.err.println("main线程运行 " + i);
       }
    }
}
