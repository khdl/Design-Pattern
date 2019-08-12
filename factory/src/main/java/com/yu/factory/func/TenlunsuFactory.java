package com.yu.factory.func;

import com.yu.factory.Milk;
import com.yu.factory.Tenlunsu;

/**
 * @className: TenlunsuFactory
 * @author: yu.liu
 * @date: 2019/8/12 21:59
 * @description:
 */
public class TenlunsuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Tenlunsu();
    }
}
