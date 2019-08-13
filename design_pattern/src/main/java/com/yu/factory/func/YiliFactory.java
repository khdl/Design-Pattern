package com.yu.factory.func;

import com.yu.factory.Milk;
import com.yu.factory.Yili;

/**
 * @className: YiliFactory
 * @author: yu.liu
 * @date: 2019/8/12 21:59
 * @description:
 */
public class YiliFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Yili();
    }
}
