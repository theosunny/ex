package com.spring.jdbcTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

/**
 * Created by Administrator on 2017/8/16 0016.
 */
public class JdbcTemplateDemo {
    @Autowired
    private  static JdbcTemplate jdbcTemplate;
    public static void main(String[] args){
        ApplicationContext app=new ClassPathXmlApplicationContext("spring-jdbc.xml");
        JdbcTemplate jdbcTemplate=(JdbcTemplate)app.getBean("jdbcTemplate");
        String sql = "SELECT * FROM  t_user ";
        RowMapper<T_User> mapper = new BeanPropertyRowMapper<T_User>(T_User.class);
         List<T_User> list = jdbcTemplate.query(sql,mapper);
        for (T_User user:list
             ) {
            System.out.println(user);
        }
    }

}
