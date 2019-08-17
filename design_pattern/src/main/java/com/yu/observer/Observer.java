package com.yu.observer;

import com.yu.observer.core.Event;

/**
 * @className: Observer
 * @author: yu.liu
 * @date: 2019/8/17 18:45
 * @description:
 */
public class Observer {

    public void advice(Event e){
        System.out.println("触发了事件");
        System.out.println(e);
    }
}
