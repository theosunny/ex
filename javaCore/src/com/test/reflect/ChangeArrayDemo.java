package com.test.reflect;

import java.lang.reflect.Array;

/**
 * Created by Administrator on 2017/8/8 0008.
 * 改变数组的长度
 */
public class ChangeArrayDemo {
    public static void main(String[] args){
        int a[] ={1,2,34};
     int newtemp[] = (int[]) arrayInc(a,5);
     print(newtemp);
    }

   public  static Object arrayInc(Object obj,int len){
        Class<?> c = obj.getClass();  //得到class对象
       Class<?> array= c.getComponentType(); //得到数组的calss对象
        Object a = Array.newInstance(array,len);//重新开辟数组的大小
       int co = Array.getLength(obj);
       System.arraycopy(obj,0,a,0,co);//复制数组内容

       return a;
   }
   public static void print(Object obj){
       Class<?> c = obj.getClass();
       if(!c.isArray()){
           return ;
       }
       Class<?> a = c.getComponentType(); //取得数组的class信息
       System.err.println(a.getName()+" length:"+Array.getLength(obj));
       for (int i = 0; i < Array.getLength(obj); i++) {
            System.err.println(Array.get(obj,i));
       }

   }
}
