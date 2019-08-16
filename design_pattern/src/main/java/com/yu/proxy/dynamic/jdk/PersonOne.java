package com.yu.proxy.dynamic.jdk;

import com.yu.proxy.Person;

/**
 * @className: PersonOne
 * @author: yu.liu
 * @date: 2019/8/15 21:05
 * @description:
 */
public class PersonOne implements Person {

    @Override
    public void dosomething(){

        System.out.println("做的事");

    }
}
