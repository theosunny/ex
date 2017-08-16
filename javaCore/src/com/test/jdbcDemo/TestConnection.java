package com.test.jdbcDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Administrator on 2017/8/9 0009.
 */
public class TestConnection {
   private static Connection conn = DBConnection.getInstance();
    public static void main(String[] args){
//        insertData();//新增数据
//        updateData();//更新数据
//          deleteData();//删除数据
//          getQueryData();
//        insertDataBypre();
        writeClobData();
    }

    /**
     * 新曾数据，静态sql
     */
    public  static void insertData(){
        Statement statement = null;
        String sql = "INSERT INTO T_USER(ID,USERNAME,PASSWORD,SEX) VALUES(2,'FAN',123,'男')";
        try {
                conn.setAutoCommit(false);
            statement = conn.createStatement();
            statement.executeUpdate(sql);
            conn.commit();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
    }
    /**
     * 修改数据，静态sql
     */
    public static void updateData(){
        Statement statement = null;
        String sql = "UPDATE T_USER SET USERNAME='FANYY' WHERE ID=2";
        try {
            conn.setAutoCommit(false);
            statement = conn.createStatement();
            statement.executeUpdate(sql);
            conn.commit();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
    }
    /**
     * 删除数据，静态sql
     */
    public static void deleteData(){
        Statement statement = null;
        String sql = "DELETE FROM T_USER  WHERE ID=1 ";
        try {
            conn.setAutoCommit(false);
            statement = conn.createStatement();
            statement.executeUpdate(sql);
            conn.commit();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
    }

    /**
     * 通过resultset得到查询结果集
     */
    public static void getQueryData(){
        String sql = "select * from t_user" ;
        try {
            ResultSet set = conn.createStatement().executeQuery(sql);
            while (set.next()){
                System.err.println("id:"+set.getInt("ID")+",USERNAME:"+set.getString("USERNAME"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * 新曾数据，动态预处理sql
     */
    public  static void insertDataBypre(){
        PreparedStatement  statement = null;
        String sql = "INSERT INTO T_USER(ID,USERNAME,PASSWORD,SEX,BIRTHDATE) VALUES(?,?,?,?,?) ";
        try {
            conn.setAutoCommit(false);
            statement = conn.prepareStatement(sql);
            statement.setString(1,"4");
            statement.setString(2,"我是动态插入测试数据");
            statement.setString(3,"password");
            statement.setString(4,"男");
            java.util.Date date = new java.util.Date();
            SimpleDateFormat sdf = new SimpleDateFormat();
            java.sql.Date date1 =  new Date(date.getTime());
            statement.setDate(5,date1);
            statement.executeUpdate();
            conn.commit();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
    }

    /**
     * 写入文本文件
     */
    public  static void writeClobData(){
        {
            PreparedStatement  statement = null;
            String sql = "INSERT INTO T_USER(ID,USERNAME,PASSWORD,SEX,TEXT,BIRTHDATE) VALUES(?,?,?,?,?,?) ";
            try {
                conn.setAutoCommit(false);
                statement = conn.prepareStatement(sql);
                statement.setString(1,"5");
                statement.setString(2,"我是插入Clob测试数据");
                statement.setString(3,"clob");
                statement.setString(4,"男");
                File f = new File("c:"+File.separator+"IOTest"+File.separator+"io.txt");
                FileInputStream fis = new FileInputStream(f);
                statement.setAsciiStream(5,fis,(int)f.length());
                java.util.Date date = new java.util.Date();
                SimpleDateFormat sdf = new SimpleDateFormat();
                java.sql.Date date1 =  new Date(date.getTime());
                statement.setDate(6,date1 );
                statement.executeUpdate();
                conn.commit();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.exit(0);
                }
            }
        }
    }
}
