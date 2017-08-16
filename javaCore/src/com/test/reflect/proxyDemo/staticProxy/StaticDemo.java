package com.test.reflect.proxyDemo.staticProxy;

import com.test.reflect.proxyDemo.RealSubject;

/**
 * Created by Administrator on 2017/8/8 0008.
 */
public class StaticDemo {
    public static void main(String[] args){
        Proxy proxy = new Proxy(new RealSubject());
        System.err.println(proxy.say("1",2));
    }

}
