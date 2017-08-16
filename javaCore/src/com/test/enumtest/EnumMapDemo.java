package com.test.enumtest;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/8/4 0004.
 EnumMap是map的子类
 */
public class EnumMapDemo {
    public static void main(String[] args){
        Map<Color,String> map = new EnumMap<Color, String>(Color.class);//指定操作的枚举类型
        map.put(Color.RED,"红色");
        map.put(Color.GREEN,"绿色");
        map.put(Color.BLACK,"黑色");
        //输出全部key
        for (Color c:
             map.keySet()) {
            System.err.println(c.name());
        }
        //输出全部value
        for (String c:
                map.values()) {
            System.err.println(c);
        }
        //输出所有的key和值
        for(Map.Entry<Color,String> entry : map.entrySet()){
            System.out.println("Key = "+entry.getKey()+",value="+entry.getValue());
        }
    }
}
