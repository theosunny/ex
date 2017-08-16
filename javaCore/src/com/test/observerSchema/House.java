package com.test.observerSchema;

import java.util.Observable;

/**
 * Created by Administrator on 2017/7/31 0031.
 */
public class House extends Observable {
    private String price ;

    @Override
    public String toString() {
        return "House{" +
                "price='" + price + '\'' +
                '}';
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        //设置变化点
        super.setChanged();
        //通知所有人
        super.notifyObservers();
        this.price = price;
    }

    public House(String price) {

        this.price = price;
    }
}
