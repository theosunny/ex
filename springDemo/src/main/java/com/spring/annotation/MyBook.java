package com.spring.annotation;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Administrator on 2017/8/16 0016.
 * 增强类
 */
public class MyBook {
    //前置增强
    public void before1(){
        System.out.println("前置增强");
    }
    //前置增强
    public void after1(){
        System.out.println("后置通知");
    }

    //环绕增强 advice
    //proceedingJoinPoint,可以调用被增强方法
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("方法之前执行");
        //执行被增强方法
        proceedingJoinPoint.proceed(new String[]{"s"});
        System.out.println("方法之后执行");
    }

}
