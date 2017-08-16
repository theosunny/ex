package com.test.enumtest;

import java.util.EnumSet;

/**
 * Created by Administrator on 2017/8/4 0004.
 * EnumSet是继承set的所以数据不能重复
 */
public class EnumSetDemo1 {
    public static void main(String[] args){
        EnumSet<Color> set =EnumSet.allOf(Color.class); //将枚举的对象全部设置到Set中
        //验证只能放一个枚举类型到集合中
        set=EnumSet.of(Color.RED);//其实打印是一个red参数
        print(set);
    }
    public static void print(EnumSet<Color> set){
        for (Color c:set){
            System.err.println(c);
        }
    }
}

