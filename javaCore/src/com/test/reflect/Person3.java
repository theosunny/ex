package com.test.reflect;

/**
 * Created by Administrator on 2017/8/7 0007.
 */
interface  China{
    public static final String NATIONAL = "CHINA";
    public static final String AUTHOR = "FANYY";
    public void sayChina();
    public String sayHello(String name,int age);
}
public class Person3 implements China{
    private  String name;
    private int age;

    /**
     * 无参构造
     */
    public Person3() {

    }

    /**
     * 有一个参数的构造方法
     * @param name
     */
    public Person3(String name) {

        this.name = name;
    }

    /**
     * 有2个参数的构造
     * @param name
     * @param age
     */
    public Person3(String name, int age) {
        this(name);//调用name的构造方法
        this.age = age;
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

    @Override
    public void sayChina() {
        System.err.println("作者："+AUTHOR+"  国籍："+NATIONAL);
    }

    @Override
    public String sayHello(String name, int age) {
        return name+"你好，我今年"+age+"岁";
    }
}
