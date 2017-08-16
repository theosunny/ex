package com.spring.annotation;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/8/16 0016.
 */
public class App {
    public static Logger log = Logger.getLogger(App.class);
    public static void main(String[] args){
        ApplicationContext app = new ClassPathXmlApplicationContext("aop.xml");
        Book book = (Book)app.getBean("book");
        book.add("1");
        log.info("执行成功");
    }
}
