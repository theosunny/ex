package com.test.thread;

/**
 * Created by Administrator on 2017/7/28 0028.
 */
public class RunnableTestDemo implements  Runnable {
    private  int t = 10 ;
    @Override
    public void run() {
        for (int i = 0 ;i <1000; i++) {
            if (t > 0) {
                System.err.println("票数还余"+ Thread.currentThread().getName() + t--);
            }
        }
//        super.run();
    }
public static void main(String[] args){
    RunnableTestDemo t1 = new RunnableTestDemo();
    Thread a = new Thread(t1,"A");
    a.start();
    System.err.println("A线程是否活着"+a.isAlive());
    Thread b = new Thread(t1,"C");
    b.start();
    Thread c =  new Thread(t1,"B");
    c.start();
}
}
