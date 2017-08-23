package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/8/16 0016.
 */
public class TestAop {

    public static void main(String[] args){
        //基于注解方式
        ApplicationContext app = new ClassPathXmlApplicationContext("aop-annotation.xml");
        Book book =(Book)app.getBean("book");
        book.add("s");
    }
}
