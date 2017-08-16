package com.test.annotationDemo;

/**
 * Created by Administrator on 2017/8/9 0009.
 */
@MyTargetAnnotation(key = "test",value = "测试") //因为MyTargetAnnotation的target是type所以只能定义在类上
public class TargetDemo {
}
