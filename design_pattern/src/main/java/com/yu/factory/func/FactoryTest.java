package com.yu.factory.func;

/**
 * @className: FactoryTest
 * @author: yu.liu
 * @date: 2019/8/12 21:55
 * @description:
 */
public class FactoryTest {
    public static void main(String[] args){

        Factory factory = new TenlunsuFactory();
        System.out.println(factory.getMilk().getName());

    }
}
