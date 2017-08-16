package com.test.annotationDemo;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/8/9 0009.
 */
@Inherited //表示父类的注释可否被子类的继承
@Documented
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyInheritAnnotation {
    public String name() default "ff";
}
