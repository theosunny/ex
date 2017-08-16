package com.test.enumtest;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Administrator on 2017/8/4 0004.
 * Enum类已经实现了Comparable接口。所以枚举本身是可以排序的下面通过treeSet排序
 */
public class ComparableEnum {
public static void main(String[] args){
    Set<Color> set = new TreeSet<Color>();
    set.add(Color.GREEN);
    set.add(Color.BLACK);
    set.add(Color.RED);
    Iterator<Color> iterator =set.iterator();
    while(iterator.hasNext()){
        System.err.print(iterator.next()+"、");
        //发现输出后是RED、GREEN、BLACK、证明已经被Enum排序过了，因为定义的是这个顺序，
    }
}
}
