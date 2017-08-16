package com.test.annotationDemo;

import java.lang.annotation.Documented;

/**
 * Created by Administrator on 2017/8/9 0009.
 */
@Documented //定义文档注释,定义了documented以后，就会在生成javadoc文件的时候，带有方法说明等信息
public @interface MyDocumentAnnotation {
    public String key();
    public String value();
}
