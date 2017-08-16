package com.test.enumtest;

/**
 * Created by Administrator on 2017/8/4 0004.
 * enum :关键字可以定义枚举 表示java.lang.Enum类型;即使用enum声明的枚举类型就相当于定义一个类，
 * 而此类默认继承java.lang.Enum
 */
public enum  Color {  //定义枚举类型
  RED,GREEN,BLACK;   //定义枚举的3个类型

}
class Test{
    public static void main(String[] args){
     System.out.println(Color.BLACK);//输出枚举参数
        //循环输出
        for (Color c: Color.values()
             ) {
            System.err.println(c);//输出枚举值
            System.err.println("返回枚举常量的序号"+c.ordinal());
            System.err.println("返回枚举常量的名称"+c.name());

        }
    }
}