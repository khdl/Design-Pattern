package com.yu.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @className: PersonTwoproxy
 * @author: yu.liu
 * @date: 2019/8/15 21:36
 * @description:
 */
public class PersonTwoProxy implements MethodInterceptor {

     public Object getInstance(Class<?> clazz) throws  Exception{

         Enhancer enhancer =  new Enhancer();
         enhancer.setSuperclass(clazz) ;
         enhancer.setCallback(this);

         return  enhancer.create();
     }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("加强");
         methodProxy.invokeSuper(o, objects);
        System.out.println("加强1111");
        return null;
    }
}
