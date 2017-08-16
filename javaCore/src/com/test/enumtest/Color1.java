package com.test.enumtest;

/**
 * Created by Administrator on 2017/8/4 0004.
 *为枚举对象赋值方式1
 *
 * */
public enum Color1 {
    RED("红色"),GREEN("绿色"),BLACK("黑色");   //定义枚举的3个类型
    private String name ; //设置name属性
    //定义构造方法
    Color1(String name) {
        setName(name);
        //设置名字
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
class Test1{
    public static void main(String[] args){
        System.out.println(Color1.BLACK);//输出枚举参数
        //循环输出
        for (Color1 c: Color1.values()
                ) {
            System.err.println(c);//输出枚举值
            System.err.println("返回枚举常量的序号"+c.ordinal());
            System.err.println("返回枚举常量的名称"+c.name()+"（自己定义的名称:"+c.getName()+")");

        }
    }
}
