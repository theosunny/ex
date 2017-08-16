package com.test.generic;

/**
 * Created by Administrator on 2017/7/28 0028.
 */
public class GenericDemo1<T> {//此处可以是任意的类型。T是type的简称
    private T t ; //变量类型由外部指定

    public T getT() { //返回值类型由外部决定
        return t;
    }

    public GenericDemo1(T t) {
        this.t = t;
    }

    public void setT(T t) {
        this.t = t;
    }
    public static void main(String[] args){
        GenericDemo1<String> t = new GenericDemo1<>("11");
        t.setT("12");
        System.err.println(t.getT());
    }
}
