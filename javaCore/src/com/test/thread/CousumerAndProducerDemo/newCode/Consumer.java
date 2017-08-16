package com.test.thread.CousumerAndProducerDemo.newCode;

/**
 * Created by Administrator on 2017/7/28 0028.
 */
public class Consumer implements Runnable {
    private Info info =null;

    public Consumer(Info info) {
        this.info = info;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            info.getInfo();

        }
    }
}
