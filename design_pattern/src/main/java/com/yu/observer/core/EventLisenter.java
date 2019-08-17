package com.yu.observer.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @className: EventLisenter
 * @author: yu.liu
 * @date: 2019/8/17 18:51
 * @description:
 */
public class EventLisenter {

    protected Map<Enum,Event> events = new HashMap<>();
    public void addListenter(Enum eventType, Object target, Method callback){
        //注册事件
        events.put(eventType,new Event(target, callback));
    }

    protected void trigger(Enum call){
        if(this.events.containsKey(call)){
            trigger(this.events.get(call).setTrigger(call.toString()));
        }
    }

    private void trigger(Event e){
        e.setSource(this);
        e.setTime(System.currentTimeMillis());
        try {
            e.getCallback().invoke(e.getTarget(),e);
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InvocationTargetException ex) {
            ex.printStackTrace();
        }
    }
}
