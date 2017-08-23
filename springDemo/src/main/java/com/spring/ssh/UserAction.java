package com.spring.ssh;

import com.opensymphony.xwork2.ActionSupport;
import com.spring.ssh.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/8/16 0016.
 */
public class UserAction extends ActionSupport{
    private  UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String execute() throws Exception {
//        System.out.println("action");
//        ApplicationContext app  = new ClassPathXmlApplicationContext("spring-context.xml");
//        UserService service = (UserService) app.getBean("userService");
//        service.say();
        System.out.println("--------action---------");
        userService.add();
        return "success";
    }

    public void login(HttpServletRequest request, HttpServletResponse response){


    }
}
