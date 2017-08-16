package com.test.reflect.proxyDemo;

/**
 * Created by Administrator on 2017/8/8 0008.
 */
public class RealSubject implements Subject {
    @Override
    public String say(String name, int age) {
        return "name:"+name+",age:"+age;
    }
}
