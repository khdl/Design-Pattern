package com.yu.factory.simple;

import com.yu.factory.Tenlunsu;

/**
 * @className: SimpleFactoryTest
 * @author: yu.liu
 * @date: 2019/8/12 21:33
 * @description:
 */
public class SimpleFactoryTest {
    public static void main(String[] args){
        //new过程比较麻烦
        System.out.println(new Tenlunsu().getName());

        Simplefactory simplefactory =new Simplefactory();
        //不关心生产的过程，只关心结果
        System.out.println(simplefactory.getMilk("伊利"));
    }
}
