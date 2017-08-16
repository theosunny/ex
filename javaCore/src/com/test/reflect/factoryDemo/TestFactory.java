package com.test.reflect.factoryDemo;

/**
 * Created by Administrator on 2017/8/8 0008.
 */
public class TestFactory {
    public static void main(String[] args){
     Fruit fruit = null;
     Fruit factory = (Fruit) Factory.getInstance(fruit,"com.test.reflect.factoryDemo.Apple");
     factory.eat();
    }
}
