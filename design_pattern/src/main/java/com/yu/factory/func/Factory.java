package com.yu.factory.func;

import com.yu.factory.Milk;

/**
 * @className: Factory
 * @author: yu.liu
 * @date: 2019/8/12 21:54
 * @description:
 */
public interface Factory {

    /**
     * 统一生产产品的接口
     * @return
     */
     Milk  getMilk();



}
