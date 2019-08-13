package com.yu.factory.simple;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.yu.factory.Mengniu;
import com.yu.factory.Milk;
import com.yu.factory.Tenlunsu;
import com.yu.factory.Yili;

/**
 * @className: Simplefactory
 * @author: yu.liu
 * @date: 2019/8/12 21:36
 * @description:
 */
public class Simplefactory {

    public Milk getMilk(String name){

        if("特仑苏".equals(name)){
            return new Tenlunsu();
        }else if("伊利".equals(name)){
            return new Yili();
        }else if("蒙牛".equals(name)){
            return new Mengniu();
        }else{
            return null;
        }
    }
}
