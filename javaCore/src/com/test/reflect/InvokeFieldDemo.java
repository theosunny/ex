package com.test.reflect;

import java.lang.reflect.Field;

/**
 * Created by Administrator on 2017/8/7 0007.
 * 访问field属性
 */
public class InvokeFieldDemo {
    public static void main(String[] args) throws Exception{
        Class<?> c = Class.forName("com.test.reflect.Person3");
        Object p =   c.newInstance();
        Field nameF = c.getDeclaredField("name");
        Field ageF =c.getDeclaredField("age");
        nameF.setAccessible(true); //将属性设置为可被外部访问
        ageF.setAccessible(true); //将属性设置为可被外部访问
        nameF.set(p,"zzs");
        ageF.set(p,11);
        System.out.print(nameF.get(p));
        System.out.print(ageF.get(p));
    }
}
