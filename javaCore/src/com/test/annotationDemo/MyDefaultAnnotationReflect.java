package com.test.annotationDemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2017/8/9 0009.
 定义注解
 */
@Target({ElementType.TYPE,ElementType.METHOD})//定义能同时出现在类、接口、枚举声明和方法中 ，可以参考ElementType说明
@Retention(RetentionPolicy.RUNTIME)//定义保存范围，出现在源文件(.java)和编译后文件(.class)。同时也在虚拟机中
public @interface MyDefaultAnnotationReflect {
    public String key() default "LXH";
    public String value() default "李兴华";
}
