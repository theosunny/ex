package com.test.annotationDemo;

/**
 * Created by Administrator on 2017/8/9 0009.
 */
@MyDocumentAnnotation(key = "test",value = "测试")
public class SimpleBeanDocument {
    /**
     * 此方法在返回是输出信息
     */
    @MyDocumentAnnotation(key = "fanyy",value = "fanyy")
    public String toString(){
        return "documented测试";
    }
}
