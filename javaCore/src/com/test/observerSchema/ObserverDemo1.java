package com.test.observerSchema;

/**
 * Created by Administrator on 2017/7/31 0031.
 *
 * 观察模式测试
 */
public class ObserverDemo1 {
    public static void main(String[] args){
        House house = new House("10000");
        HouseProvideObservers a = new HouseProvideObservers("购房者A");
        HouseProvideObservers b = new HouseProvideObservers("购房者B");

        HouseProvideObservers c = new HouseProvideObservers("购房者C");
        house.addObserver(a);
        house.addObserver(b);
        house.addObserver(c);
        System.err.println(house);
        house.setPrice("18");
        System.err.println(house);
    }
}
