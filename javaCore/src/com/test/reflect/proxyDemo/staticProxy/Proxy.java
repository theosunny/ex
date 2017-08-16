package com.test.reflect.proxyDemo.staticProxy;

import com.test.reflect.proxyDemo.Subject;

/**
 * Created by Administrator on 2017/8/8 0008.
 */
public class Proxy implements Subject {
    private Object obj ;
    @Override
    public String say(String name, int age) {
        Subject sub =   (Subject)obj;
        return sub.say("test",11);
    }

    public Proxy(Object obj) {
        this.obj=obj;
    }
}
