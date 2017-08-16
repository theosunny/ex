package com.test.enumtest;

/**
 * Created by Administrator on 2017/8/4 0004.
 * 枚举类可以实现接口，但是接口中都是抽象的类，所以枚举中每个对象都要实现接口中方法
 */
public enum  Color3 implements Print{
    RED {
        @Override
        public String getColor() {
            return  "红色";
        }
    },BLACK {
        @Override
        public String getColor() {
            return  "黑色";
        }
    }
}

class ColorImpl {
    public static void main(String[] args){
        for (Color3 c: Color3.values()
             ) {
            System.err.println(c.name()+":"+c.getColor());

        }
    }
}