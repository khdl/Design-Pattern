package com.yu.proxy.dynamic.jdk;

import com.yu.proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @className: PersonOneProxy
 * @author: yu.liu
 * @date: 2019/8/15 21:06
 * @description:
 */
public class PersonOneProxyJDK  implements InvocationHandler {

    private Person target;
    public Object getInstance(Person target) throws Exception{
          this.target = target;
          Class<?> clazz = target.getClass();
        //Proxy.newProxyInstance()用来生成一个新的对象（字节码重组实现）

        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("加强");
        method.invoke(this.target, args);
        System.out.println("加强11");
        return null;
    }
}
