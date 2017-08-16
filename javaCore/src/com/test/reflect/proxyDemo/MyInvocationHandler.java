package com.test.reflect.proxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/8/8 0008.
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object obj ;
    public Object bind(Object obj) {
       this.obj = obj;
       return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),this);//取得代理对象
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object temp =method.invoke(this.obj,args);
        return temp;
    }
}
