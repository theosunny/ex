package com.test.thread;

/**
 * Created by Administrator on 2017/7/28 0028.
 */
public class ThreadExample1 extends Thread {

    private int time  ;

    public ThreadExample1(String name,int time) {
        super(name);
        this.time = time;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(this.time);
            System.err.println("thread"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new ThreadExample1("A",2000).start();
        new ThreadExample1("B",3000).start();
    }
}
