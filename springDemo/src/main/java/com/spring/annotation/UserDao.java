package com.spring.annotation;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/8/15 0015.
 */
@Component
public class UserDao {
    public void say(){
        System.out.println("dao");
    }
}
