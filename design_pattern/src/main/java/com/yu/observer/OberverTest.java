package com.yu.observer;

import com.yu.observer.core.Event;

import java.lang.reflect.Method;

/**
 * @className: OberverTest
 * @author: yu.liu
 * @date: 2019/8/17 19:13
 * @description:
 */
public class OberverTest {

    public static void main(String[] args){


        try {

           Observer observer = new Observer();
           Method advice = Observer.class.getMethod("advice",new Class<?>[]{Event.class});

           Subject subject = new Subject();
           subject.addListenter(SubjectEnumType.ON_ADD, observer, advice);
           subject.addListenter(SubjectEnumType.ON_REMOVE, observer, advice);

           subject.add();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
