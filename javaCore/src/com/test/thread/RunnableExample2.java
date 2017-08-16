package com.test.thread;

/**
 * Created by Administrator on 2017/7/28 0028.
 */
public class RunnableExample2 implements Runnable {

    private int time  ;
    private String name  ;

    public RunnableExample2(String name, int time) {
        this.name=name;
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
        RunnableExample2 runnableExample2 =     new RunnableExample2("A",2000);
        RunnableExample2 runnableExample3 =   new RunnableExample2("B",3000);
        new Thread(runnableExample2).start();
        new Thread(runnableExample3).start();
    }
}
