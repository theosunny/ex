package com.test.annotationDemo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/8/9 0009.
  继承注解测试
 */
public class MyInheritDemo {
    public static void main(String[] args) throws Exception{
        Class<?> c = Class.forName("com.test.annotationDemo.Stu");
        Annotation annotation[] =c.getAnnotations();
        for (Annotation a:annotation  //输出全部注解
             ) {
            System.err.println(a);
        }
        if(c.isAnnotationPresent(MyInheritAnnotation.class)){
            MyInheritAnnotation m = c.getAnnotation(MyInheritAnnotation.class);
            System.err.println("name="+m.name()); //说明继承了person类的注解
        }
    }
}
