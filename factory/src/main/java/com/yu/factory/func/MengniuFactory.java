package com.yu.factory.func;

import com.yu.factory.Mengniu;
import com.yu.factory.Milk;

/**
 * @className: MengniuFactory
 * @author: yu.liu
 * @date: 2019/8/12 22:00
 * @description:
 */
public class MengniuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Mengniu();
    }
}
