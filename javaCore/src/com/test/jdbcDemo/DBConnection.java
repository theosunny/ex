package com.test.jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Administrator on 2017/8/9 0009.
 */
public class DBConnection {
    private static final String DRIVER ="org.gjt.mm.mysql.Driver";
    private static final String URL ="jdbc:mysql://localhost:3306/kf";
    private static final String USER ="fanyy";
    private static final String PASSWORD ="fanyy";
    private static Connection connection;
    private DBConnection(){
    }
    public static Connection getInstance(){
        try {
           Class.forName(DRIVER);
           connection= DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(0);
        }
        return connection;
    }
}
