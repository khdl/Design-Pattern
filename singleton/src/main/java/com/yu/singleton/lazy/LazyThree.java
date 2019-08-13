package com.yu.singleton.lazy;

/**
 * @className: LazyOne
 * @author: yu.liu
 * @date: 2019/8/13 20:42
 * @description: 静态内部类
 */
public class LazyThree {
    private LazyThree(){}
    private static class LazyHolder{
        private static  LazyThree lazy = new LazyThree();
    }
    public static LazyThree getInstance(){
        return  LazyHolder.lazy;
    }
}
