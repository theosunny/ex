package com.test.reflect;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/8/7 0007.
 *
 * 演示调用set，get方法
 */
public class InvokeGetSetDemo {
public static void main(String[] args) throws  Exception {
    Class<?> c = Class.forName("com.test.reflect.Person3");
    Object p =   c.newInstance();
    setter(p,"name","fanyy",String.class);
    setter(p,"age",11,int.class);
    getter(p,"age");
    getter(p,"name");
}
public  static  void setter(Object obj ,String attr ,Object val ,Class<?> type) throws Exception{
    Method method = obj.getClass().getMethod("set"+inistr(attr),type);
    method.invoke(obj,val);
}
public  static  void getter(Object obj ,String attr) throws Exception{
    Method method = obj.getClass().getMethod("get"+inistr(attr));
    System.err.println(method.invoke(obj)); //接收方法的返回值
}
    private static String inistr(String attr) {
        return  attr.substring(0,1).toUpperCase()+attr.substring(1,attr.length());
    }
}
