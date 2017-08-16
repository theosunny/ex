package com.test.reflect;

import java.lang.reflect.Array;

/**
 * Created by Administrator on 2017/8/7 0007.
 */
public class InvokeArray {
    public static void main(String[] args){
     int a[] ={1,2,34};
     Class<?> c =a.getClass().getComponentType();
     System.err.println("类型"+c.getName()); //得到数组类型名称
       System.err.println("长度"+ Array.getLength(a));//得到数组长度
        System.err.println("第一个数组内容"+Array.get(a,0));
        Array.set(a,2,88); //设置第三个值
        System.err.println("第3个数组内容"+Array.get(a,2));
    }
}
