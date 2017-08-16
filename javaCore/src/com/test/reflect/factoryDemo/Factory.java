package com.test.reflect.factoryDemo;

import sun.security.jca.GetInstance;

/**
 * Created by Administrator on 2017/8/8 0008.
 */
public class Factory {
    public static Object getInstance(Object obj, String classname) {
        try {
            Class<?> c = Class.forName(classname);
            obj = (Object)c.newInstance() ;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return obj ;
    }

}
