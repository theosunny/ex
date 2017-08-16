package com.test.thread;

/**
 * Created by Administrator on 2017/7/28 0028.
 * 死锁就是A进程等待B进程完成，B进程等待C进程完成、C进程等待A进程完成，这样两个线程之间相互等待时间过长，造成死锁
 *
 */
public class DeadLockDemo implements  Runnable{
    private  static  Lisi lisi = new Lisi();
    private  static Zhangsan zhangsan = new Zhangsan();
    private boolean flag = false;
    @Override
    public void run() {
        if (flag) {
            synchronized (zhangsan){
                zhangsan.say();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lisi){
                    zhangsan.get();
                }
            }
        }else {
            synchronized (lisi){
                lisi.say();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (zhangsan){
                    lisi.get();
                }
            }
        }
    }

    public static void main(String[] args){
        DeadLockDemo lockDemo1 = new DeadLockDemo();
        DeadLockDemo lockDemo2 = new DeadLockDemo();
        lockDemo1.flag=true;
        lockDemo2.flag=false;
        new Thread(lockDemo1).start();
        new Thread(lockDemo2).start();
    }
}
