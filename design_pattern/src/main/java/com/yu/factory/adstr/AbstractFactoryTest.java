package com.yu.factory.adstr;

/**
 * @className: AbstractFactoryTest
 * @author: yu.liu
 * @date: 2019/8/12 22:07
 * @description:
 */
public class AbstractFactoryTest {

    public static void main(String[] args){

        //对用户变得更简单
        MilkFactory factory = new MilkFactory();
        System.out.println(factory.getTenlunsu());

    }
}
