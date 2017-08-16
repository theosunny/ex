package com.test.annotationDemo;

/**
 * Created by Administrator on 2017/8/9 0009.
 */
public class SimpleBeanTwo {
    @SuppressWarnings("unchecked")
    @Deprecated
    //使用自定义注解并且设定值
    @MyDefaultAnnotationReflect(key = "test",value = "测试")
    public String toString(){
        return "测试1" ;
    }
}
