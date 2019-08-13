package com.yu.singleton.lazy;

/**
 * @className: LazyOne
 * @author: yu.liu
 * @date: 2019/8/13 20:42
 * @description: 懒汉式
 */
public class LazyOne {
    private LazyOne(){}
    private static LazyOne lazy = null;
    public static LazyOne getInstance(){
        if(lazy == null){
            return  new LazyOne();
        }
        return  lazy;
    }
}
