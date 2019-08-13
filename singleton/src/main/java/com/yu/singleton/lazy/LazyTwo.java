package com.yu.singleton.lazy;

/**
 * @className: LazyOne
 * @author: yu.liu
 * @date: 2019/8/13 20:42
 * @description:  同步方法
 */
public class LazyTwo {
    private LazyTwo(){}
    private static LazyTwo lazy = null;
    public static synchronized LazyTwo getInstance(){
        if(lazy == null){
            return  new LazyTwo();
        }
        return  lazy;
    }
}
