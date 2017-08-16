package com.test.annotationDemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2017/8/9 0009.
 定义注解
 */
@Retention(RetentionPolicy.RUNTIME)//定义保存范围，出现在源文件(.java)和编译后文件(.class)。同时也在虚拟机中
@Target(ElementType.TYPE)//定义只能出现在类、接口、或者枚举声明 ，可以参考ElementType说明
public @interface MyTargetAnnotation {
    public String key() default "LXH";
    public String value() default "李兴华";
}
