package com.yu.singleton.lazy;

/**
 * @className: LazyOne
 * @author: yu.liu
 * @date: 2019/8/13 20:42
 * @description:  同步方法
 */
public class LazyFour {
    private LazyFour(){}
    private  static volatile LazyFour lazy = null;
    public static synchronized LazyFour getInstance(){
        if(lazy == null){
            synchronized (LazyFour.class){
                if(lazy == null){
                    return  new LazyFour();
                }
            }
        }
        return  lazy;
    }
}
