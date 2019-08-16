package com.yu.proxy.staticed;

import com.yu.proxy.Person;

/**
 * @className: Student
 * @author: yu.liu
 * @date: 2019/8/15 20:37
 * @description:
 */
public class Student implements Person {

    @Override
    public void dosomething(){
        System.out.println("做的事");
    }
}
