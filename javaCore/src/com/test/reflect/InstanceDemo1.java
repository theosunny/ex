package com.test.reflect;

/**
 * Created by Administrator on 2017/8/7 0007.
 * Class类的使用
 * 通过无参构造实例化对象
 */
class Person{
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
}
public class InstanceDemo1 {
    public static void main(String[] args){
     Class<?> c1 = null; //指定泛型
        try {
            //传入完整的实例化包路径
            c1 = Class.forName("com.test.reflect.Person");
            try {
                //实例化person对象，实例化的时候，一定要有无参构造方法。否则会报错
                Person obj = (Person) c1.newInstance();
                obj.setAge(11);
                obj.setName("ces");
                obj.setSex(1);
                System.out.println(obj);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
