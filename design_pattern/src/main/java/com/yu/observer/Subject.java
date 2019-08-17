package com.yu.observer;

import com.yu.observer.core.EventLisenter;

/**
 * @className: Subject
 * @author: yu.liu
 * @date: 2019/8/17 18:43
 * @description:
 */
public class Subject extends EventLisenter {


    public void add(){
        System.out.println("调用一个添加方法");
        trigger(SubjectEnumType.ON_ADD);
    }

    public void remove(){
        System.out.println("调用一个删除方法");
        trigger(SubjectEnumType.ON_REMOVE);
    }

}
