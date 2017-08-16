package com.test.thread.CousumerAndProducerDemo.newCode;

/**
 * Created by Administrator on 2017/7/28 0028.
 */
public class TestCandP {
    public static void main(String[] args){
        Info info = new Info();
        new Thread(new Producer(info)).start();
        new Thread(new Consumer(info)).start();
    }
}
