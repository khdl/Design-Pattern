package com.yu.proxy.dynamic.cglib;

/**
 * @className: CglibTest
 * @author: yu.liu
 * @date: 2019/8/15 21:43
 * @description:
 */
public class CglibTest {
    
    public static void main(String[] args){

        try {
            PersonTwoCglib obj = (PersonTwoCglib)new PersonTwoProxy().getInstance(PersonTwoCglib.class);
            obj.dosomething();
            System.out.println(obj.getClass());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
