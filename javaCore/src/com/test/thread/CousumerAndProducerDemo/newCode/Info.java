package com.test.thread.CousumerAndProducerDemo.newCode;

import javax.swing.text.AbstractDocument;

/**
 * Created by Administrator on 2017/7/28 0028.
 */
public class Info {

    private  String name ="fanyy";


    private  String content ="程序员";
    private boolean flag =false;
    public synchronized void setInfo(String name,String content) {
        if (!flag){
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name = name;
        try {
            Thread.sleep(300);
        }catch (Exception e){
            e.printStackTrace();
        }
        this.content = content;
        flag=false ;
        super.notify();
    }

    public synchronized void getInfo() {
        if (flag){
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(300);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(name+"===>"+content);
        flag=true ;
        super.notify();

    }
}
