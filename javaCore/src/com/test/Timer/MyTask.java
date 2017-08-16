package com.test.Timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2017/7/31 0031.
 */
public class MyTask extends TimerTask {

    @Override
    public void run() {
        System.out.println(System.currentTimeMillis());
    }
    public static void main(String[] args){
        Timer timer = new Timer();
        timer.schedule(new MyTask(),new Date(),2000); //一秒后开始，2秒后重复

    }
}
