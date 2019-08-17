package com.yu.strategy;

import com.yu.strategy.strategies.AliPay;

/**
 * @className: Test
 * @author: yu.liu
 * @date: 2019/8/17 08:46
 * @description:
 */
public class Test {

    public static void main(String[] args){

        Order order = new Order("1","3234321111", 3241.1);

         //order.pay(new AliPay());
        order.pay(PayType.WECHAT_PAT);

    }

}
