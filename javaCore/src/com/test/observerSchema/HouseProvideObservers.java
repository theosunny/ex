package com.test.observerSchema;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2017/7/31 0031.
 */
public class HouseProvideObservers implements Observer {
    private String name ;

    public String getName() {
        return name;
    }

    public HouseProvideObservers(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof  String){//判断参数类型
            System.out.print(this.name+"观察到价格为：");
            System.err.println(arg.toString());
        }
    }
}
