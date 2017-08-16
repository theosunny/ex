package com.test.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Administrator on 2017/8/7 0007.
 * 实例化有参构造方法测试
 */
class Person1{

    private String name;
    private int age ;
    private  int sex;

    @Override
    public String toString() {
        return "Perso{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
    //有参数构造方法
    public Person1(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
public class InstanceDemo2 {
    public static void main(String[] args){
        try {
            Class<?> c1 = Class.forName("com.test.reflect.Person1");
            Constructor<?> constructor[] = null;//声明构造方法的数组
            constructor = c1.getConstructors();//得到所有的构造方法
            try {
                //向构造方法传递参数，此方法使用可变参数接收，并实例化对象 ,为0 表示取第一个构造方法，
                //可以看到比较复杂，所以最好留一个无参构造方法
                Person1 p1 = (Person1) constructor[0].newInstance("测试1",12,1);
                System.err.println("输出对象"+p1);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
