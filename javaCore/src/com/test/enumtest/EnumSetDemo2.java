package com.test.enumtest;

import java.util.EnumSet;

/**
 * Created by Administrator on 2017/8/4 0004.
 * EnumSet是继承set的所以数据不能重复
 */
public class EnumSetDemo2 {
    public static void main(String[] args){
        //创建只能放入指定集合的枚举
        EnumSet<Color> set =EnumSet.noneOf(Color.class); //创建一个可以放入指定Color
       set.add(Color.GREEN);//增加内容
        print(set);//只会打印Green
        //复制内容
        EnumSet<Color> setNew =EnumSet.copyOf(set);
        System.err.println("---------");
        print(setNew);
    }
    public static void print(EnumSet<Color> set){
        for (Color c:set){
            System.err.println(c);
        }
    }
}

