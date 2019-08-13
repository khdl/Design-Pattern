package com.yu.factory.adstr;

import com.yu.factory.Milk;

/**
 * @className: AbstractFactory
 * @author: yu.liu
 * @date: 2019/8/12 22:05
 * @description:
 */
public abstract class AbstractFactory {

    //公共的逻辑
    //统一管理


    /**
     * 获取产品
     * @return
     */
    public abstract Milk getMengniu();

    public abstract Milk getTenlunsu();

    public abstract Milk getYili();
}
