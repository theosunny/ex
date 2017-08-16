package com.test.enumtest;

/**
 * Created by Administrator on 2017/8/4 0004.
 * 枚举类定义抽象方法，这样只要每个参数实现抽象方法即可
 */
public enum Color4 {
    RED {

        public String getColor() {
            return  "红色";
        }
    },BLACK {

        public String getColor() {
            return  "黑色";
        }
    };
    public  abstract String getColor();
}

class Color4Impl {
    public static void main(String[] args){
        for (Color3 c: Color3.values()
                ) {
            System.err.println(c.name()+":"+c.getColor());

        }
    }
}
