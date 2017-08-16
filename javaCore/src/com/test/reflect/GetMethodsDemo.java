package com.test.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by Administrator on 2017/8/7 0007.
 *1、得到全部方法的信息
 *2、得到全部的属性信息
 * */
public class GetMethodsDemo {
    public static void main(String[] args){
        try {
            Class<?> c1 = Class.forName("com.test.reflect.Person3");
            Method me[] = c1.getMethods();
            //得到全部的方法信息
            for (int i = 0; i < me.length; i++) {
                System.out.print(Modifier.toString(me[i].getModifiers())+" "); //取得修饰符
                Class<?> returntype = me[i].getReturnType();//取得返回值
                System.out.print(returntype);///取得返回值
                System.out.print(" "+me[i].getName());//取得名称
                Class<?> paramTypes[] = me[i].getParameterTypes();
                System.out.print("(");
                //输出参数信息 类似（String 1，int 1）
                for (int j = 0; j < paramTypes.length; j++) {
                    System.out.print(paramTypes[j] +" arg"+j ); //打印参数类型
                    if(j<paramTypes.length-1){
                        System.out.print(",");
                    }

                }
                System.out.print(")");
                Class<?> exceps[] = me[i].getExceptionTypes();
                //输出异常信息
                if(exceps.length>0){

                    System.out.print(" throws ");
                }
                for (int j = 0; j < exceps.length; j++) {
//                    System.out.print( exceps[j].getName());
                    System.out.print( exceps[j].getSimpleName()); //取得简化异常名称。
                    if(j<exceps.length-1){
                        System.out.print(",");
                    }
                }
                System.out.println(";");
            }

            //得到本类的属性信息
            Field fields[] = c1.getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                Class<?> r = fields[i].getType(); //取得属性的类型
                System.out.print("本类属性：");
                System.out.print(Modifier.toString(fields[i].getModifiers())); //得到属性修饰符并且转译
                System.out.print(" "+r.getName());
                System.out.println(" "+fields[i].getName());
                System.out.println("");
            }

            //得到父类的公共属性信息
            Field pfields[] = c1.getFields();
            for (int i = 0; i < pfields.length; i++) {
                Class<?> r = pfields[i].getType(); //取得属性的类型
                System.out.print("父类属性：");
                System.out.print(Modifier.toString(pfields[i].getModifiers())); //得到属性修饰符并且转译
                System.out.print(" "+r.getName());
                System.out.println(" "+pfields[i].getName());
                System.out.println("");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
