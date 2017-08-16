package com.test.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * Created by Administrator on 2017/8/7 0007.
 *
 * 以person3为例 测试反射的方法
 * 取得全部接口，取得全部父类，取得全部构造方法
 * */
public class GetInterfaceDemo {
    public static void main(String[] args){
            try {
                Class<?> c1 = Class.forName("com.test.reflect.Person3");
                //得到所有的接口
                Class<?> c[] =c1.getInterfaces();
                for (int i = 0; i < c.length; i++) {
                    System.out.println("得到各个接口的名称"+c[i].getName()); //打印是china接口
                }
               //取得父类
                Class<?> c3 = c1.getSuperclass();
                System.out.println(c3);//父类是object
                //取得全部构造方法
                Constructor<?> cons[] = c1.getConstructors();
                for (int i = 0; i < cons.length; i++) {
//                    System.err.println("打印构造方法"+cons[i]);//可以直接获取，也可像下面这么写

                    Class<?>  p[] = cons[i].getParameterTypes();//得到构造方法的参数类型
                    System.out.print("构造方法");
//                    System.out.print(cons[i].getModifiers()+" ");//得到修饰符 打印后发现是1，这是因为java中方法的修饰符是数字表示的比如1是public，如果需要知道真实含义需要转移修饰符
                    System.out.print(Modifier.toString(cons[i].getModifiers())+" ");//还原权限
                    System.out.print(cons[i].getName());
                    System.out.print("(");
                    for (int j = 0; j <p.length ; j++) {
                        System.out.print(p[j].getName()+" arg" + i );//循环打印参数类型
                        if (j<p.length-1){
                            System.out.print(",");
                        }
                    }
                    System.out.println("){}");
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

    }
}
