package com.test.reflect;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/8/7 0007.
 * 调用person3的sayHello ，SayChina方法测试
 */
public class InvokeSayChinaDemo {
    public static void main(String[] args) throws  Exception {
        Class<?> c = Class.forName("com.test.reflect.Person3");
        Person3 p = (Person3) c.newInstance();
        Method m = c.getMethod("sayChina");
        m.invoke(c.newInstance());
        //如果有参数，则需要传递参数
        Method m1 = c.getMethod("sayHello", String.class, int.class);
       String s = (String) m1.invoke(c.newInstance(),"22",11);
       System.err.println(s);
    }

}
