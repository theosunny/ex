package com.test.thread;

/**
 * 卖票的线程。
 * 加人sychronized 同步代码块则
 * 则不会出现值为-1的情况因为当前只能有一个进程占用
 * 也可以直接将关键字放在方法上
 * Created by Administrator on 2017/7/28 0028.
 */
public class TicketDemoSynchronized implements Runnable {
    private int ticket = 10;

    @Override
    public void run() {
//        this.saleTicket(); 可以直接加锁在方法上
        for (int i = 0; i < 100; i++) {
            synchronized (this) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("卖票的票数剩余" + ticket--);
                }
            }
        }
    }
    public  synchronized void saleTicket(){
            for (int i = 0; i < 100; i++) {
                    if (ticket > 0) {
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("卖票的票数剩余" + ticket--);
                    }
        }
    }


    public static void main(String[] args) {
        TicketDemoSynchronized t = new TicketDemoSynchronized();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
    }
}
