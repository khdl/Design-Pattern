package com.yu.proxy.staticed;

/**
 * @className: StaticProxyTest
 * @author: yu.liu
 * @date: 2019/8/15 20:51
 * @description:
 */
public class StaticProxyTest {

    public static void main(String[] args){
        Student person = new Student();
        ProxyStudent proxyPerson = new ProxyStudent(person);
        proxyPerson.dosomething();
    }


}
