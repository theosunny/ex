package com.test.reflect.proxyDemo;

/**
 * Created by Administrator on 2017/8/8 0008.
 * 类加载器测试
 * 一共3中类加载器：
 *  1.bootstrap ClassLoader C++实现的底层类加载器
 *  2.Extension ClassLoader 一般在jdk Ext Lib目录下的扩展类加载器
 *  3.APPClassLoader  加载classpath指定的类。用的比较多
 */
class Person{}
public class ClassLoaderDemo {
public static void main(String[] args){
      Person p = new Person();
      System.err.println("类加载器："+p.getClass().getClassLoader().getClass().getName());
}
}
