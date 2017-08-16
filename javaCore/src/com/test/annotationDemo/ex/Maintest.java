package com.test.annotationDemo.ex;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2017/8/9 0009.
 */
public class Maintest {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,47,48,49,50);
        trackUseCases(list,PasswordUtils.class);
    }
    public static void trackUseCases(List<Integer> useCases, Class<?> cl) {
        for (Method m:cl.getDeclaredMethods()
             ) {
            UserCase uc = m.getAnnotation(UserCase.class);
            System.out.println(uc);
            if (uc != null) {
                System.out.println("Found Use Case:" + uc.userid() + " "
                        + uc.desc());
                useCases.remove(new Integer(uc.userid()));
            }
        }
        for (int i : useCases) {
            System.out.println("Warning: Missing use case-" + i);
        }
    }
}
