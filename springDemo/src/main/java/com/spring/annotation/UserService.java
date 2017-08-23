package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/8/15 0015.
 */
@Component
public class UserService {

    @Autowired
    private UserDao userAao ;

    public void say(){
         userAao.say();
    }
}
