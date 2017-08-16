package com.test.thread.CousumerAndProducerDemo;

/**
 * Created by Administrator on 2017/7/28 0028.
 */
public class Producer implements Runnable {
    private  Info info =null;

    public Producer(Info info) {
        this.info = info;
    }

    @Override
    public void run() {
        boolean flag = false;
        for (int i = 0; i < 30; i++) {
            if (flag){
                synchronized (info) {
                    this.info.setName("李子" + i);
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    this.info.setContent("java讲师" + i);
                    flag = false;
                }
            }else {
                synchronized (info) {
                    this.info.setName("fyy" + i);
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    this.info.setContent("程序员" + i);
                    flag = true;
                }
            }
        }
    }
}
