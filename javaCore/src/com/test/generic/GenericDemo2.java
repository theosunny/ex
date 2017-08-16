package com.test.generic;

/**
 * Created by Administrator on 2017/7/28 0028.
 */
public class GenericDemo2  {
    public static void fun(
            GenericDemo1<?> info){
        System.err.println("泛型内容为"+info.getT());

    }
public static void main(String[] args){
//    GenericDemo1 genericDemo1 = new GenericDemo1("2");
//    fun(genericDemo1);

}

}
