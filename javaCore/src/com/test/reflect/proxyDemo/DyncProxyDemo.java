package com.test.reflect.proxyDemo;

/**
 * Created by Administrator on 2017/8/8 0008.
 * 动态代理测试。
 */
public class DyncProxyDemo {
    public static void main(String[] args){
     MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
    Subject subject = (Subject) myInvocationHandler.bind(new RealSubject());
     String subjectStr =    subject.say("动态代理测试",22);
     System.err.println(subjectStr);
    }
}

