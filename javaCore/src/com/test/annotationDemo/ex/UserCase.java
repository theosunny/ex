package com.test.annotationDemo.ex;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/8/9 0009.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface UserCase {
    public String userid();
    public String desc() default "no Desc";

}
