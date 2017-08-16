package com.test.reflect;


class X{

}
/**
 * Created by Administrator on 2017/8/7 0007.
 */
public class GetClassDemo2 {
public static void main(String[] args){
 Class<?> c1 = null;
 Class<?> c3 = null;
 Class<?> c2 = null;
    try {
        c1 = Class.forName("com.test.reflect.X"); //最常用格式
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    c2=new X().getClass();  //通过object方法实例化
    c3 =X.class;  //通过类.class方法实例化
    System.err.println(c1.getName());
    System.err.println(c2.getName());
    System.err.println(c3.getName());
}
}
