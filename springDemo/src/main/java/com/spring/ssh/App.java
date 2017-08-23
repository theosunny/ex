package com.spring.ssh;

import org.hibernate.Session;

/**
 * Created by Administrator on 2017/8/17 0017.
 */
public class App {
    public static void main(String[] args){
        Session session    =HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        UserEntity user = new UserEntity();
        user.setId(1110);
        user.setUsername("leioolei");
        user.setPassword("system");
        session.save(user);
        session.getTransaction().commit();
        System.out.println("成功");
    }
}
