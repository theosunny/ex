package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/8/16 0016.
 * 增强类
 */
@Aspect
public class MyBook {
    //前置增强注解实现
    @Before(value = "execution(* com.spring.aop.Book.*(..))")
    public void before1(){
        System.out.println("前置增强");
    }
    //前置增强
    @After(value = "execution(* com.spring.aop.Book.*(..))")
    public void after1(){
        System.out.println("后置通知");
    }

    //环绕增强 advice
    //proceedingJoinPoint,可以调用被增强方法
    @Around(value = "execution(* com.spring.aop.Book.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("方法之前执行");
        //执行被增强方法
        proceedingJoinPoint.proceed(new String[]{"s"});
        System.out.println("方法之后执行");
    }

}
