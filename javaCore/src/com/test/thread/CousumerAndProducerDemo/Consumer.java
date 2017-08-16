package com.test.thread.CousumerAndProducerDemo;

/**
 * Created by Administrator on 2017/7/28 0028.
 */
public class Consumer implements Runnable {
    private  Info info =null;

    public Consumer(Info info) {
        this.info = info;
    }

    @Override
    public void run() {
        boolean flag = false;
        for (int i = 0; i < 30; i++) {
            if (flag){
                System.out.print(this.info.getName());
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("     "+this.info.getContent());
                System.out.println("");
            }else {
                System.out.print(this.info.getName());
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("     "+this.info.getContent());
                System.out.println("");
            }
        }
    }
}
