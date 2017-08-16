package com.test.annotationDemo;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/8/9 0009.
 * 取得自定义的注解信息
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws Exception{
        Class<?> c = Class.forName("com.test.annotationDemo.SimpleBeanTwo");
        Method m = c.getMethod("toString");
        //判断元素是否存在注释
        boolean flag = m.isAnnotationPresent(MyDefaultAnnotationReflect.class);
        if (flag){
            MyDefaultAnnotationReflect an = m.getAnnotation(MyDefaultAnnotationReflect.class);
            String key = an.key();
            String value = an.value();
            System.err.println("key="+key+" ;value="+value);
        }
    }
}
