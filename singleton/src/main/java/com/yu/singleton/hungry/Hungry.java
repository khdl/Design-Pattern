package com.yu.singleton.hungry;

/**
 * @className: Hungry
 * @author: yu.liu
 * @date: 2019/8/13 20:23
 * @description: 饿汉式
 */
public class Hungry {
    private Hungry(){}

    private static  Hungry HUNGRY = new Hungry();

    public static  Hungry getInstance(){
        return HUNGRY;
    }

}
