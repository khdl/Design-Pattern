package com.yu.strategy.strategies;

import com.yu.strategy.PayState;
import com.yu.strategy.Payment;

/**
 * @className: WechatPay
 * @author: yu.liu
 * @date: 2019/8/17 09:01
 * @description:
 */
public class WechatPay implements Payment {
    @Override
    public PayState pay(String uid, Double amount) {
        System.out.println("欢迎使用微信支付");
        System.out.println("查询账户余额，开始扣款");
        return new PayState(200,"支付成功",amount);
    }
}
