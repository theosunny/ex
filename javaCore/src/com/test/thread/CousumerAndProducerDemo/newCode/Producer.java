package com.test.thread.CousumerAndProducerDemo.newCode;

/**
 * Created by Administrator on 2017/7/28 0028.
 */
public class Producer implements Runnable {
    private Info info =null;

    public Producer(Info info) {
        this.info = info;
    }

    @Override
    public void run() {
        boolean flag = false;
        for (int i = 0; i < 30; i++) {
            if (flag){
                info.setInfo("李子","讲师");
                flag=false;
            }else {
                info.setInfo("fanyy","程序员");
                flag=true;
            }
        }
    }
}
