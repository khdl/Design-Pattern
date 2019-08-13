package com.yu.factory.adstr;

import com.yu.factory.Mengniu;
import com.yu.factory.Milk;
import com.yu.factory.Tenlunsu;
import com.yu.factory.Yili;
import com.yu.factory.func.MengniuFactory;
import com.yu.factory.func.TenlunsuFactory;
import com.yu.factory.func.YiliFactory;

/**
 * @className: MilkFactory
 * @author: yu.liu
 * @date: 2019/8/12 22:09
 * @description:
 */
public class MilkFactory extends AbstractFactory {
    @Override
    public Milk getMengniu() {
        return new Mengniu();
    }

    @Override
    public Milk getTenlunsu() {
        return new Tenlunsu();
    }

    @Override
    public Milk getYili() {
        return new Yili();
    }
}
