package com.yu.proxy.dynamic.jdk;

import com.yu.proxy.Person;

/**
 * @className: JdkProxyTest
 * @author: yu.liu
 * @date: 2019/8/15 21:32
 * @description:
 */
public class JdkProxyTest {
    public static void main(String[] args){

        try {
            Person person = (Person) new PersonOneProxyJDK().getInstance(new PersonOne());
            person.dosomething();
            System.out.println(person.getClass());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
