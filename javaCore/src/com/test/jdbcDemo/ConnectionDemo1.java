package com.test.jdbcDemo;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
/**
 * Created by Administrator on 2017/8/9 0009.
 */
public class ConnectionDemo1 {
    public static final String DRIVER ="org.gjt.mm.mysql.Driver";
    public static final String URL ="jdbc:mysql://localhost:3306/kf";
    public static final String USER ="fanyy";
    public static final String PASSWORD ="fanyy";

    public static void main(String[] args){
        Connection connection = null;
        try {
            Class.forName(DRIVER); //加载驱动程序
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
            System.err.println(connection);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
