package com.test.thread;

/**
 * 卖票的线程。
 * 不加人sychronized
 * 则会出现值为-1的情况因为别人已经在操作这条记录了。
 * Created by Administrator on 2017/7/28 0028.
 */
public class TicketDemo implements Runnable {
    private  int ticket = 10 ;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (ticket>0){
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("卖票的票数剩余"+ticket--);;
            }
        }
    }
    public static void main(String[] args){
        TicketDemo t = new TicketDemo();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
    }
}
