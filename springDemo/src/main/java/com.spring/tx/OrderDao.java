package com.spring.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/8/17 0017.
 */
@Repository
public class OrderDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void moreMoney(){
     String sql = "update account set salary=salary+? where username =?";
        jdbcTemplate.update(sql,1000,"小王");
    }
    public void lessMoney(){
        String sql = "update account set salary=salary-? where username =?";
        jdbcTemplate.update(sql,1000,"小李");

    }
}
