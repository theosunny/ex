package com.spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/8/16 0016.
 * 定义被增强的类
 */

public class Book {

    public void add(String s){
        System.out.println("add--" +s);
    }
}
