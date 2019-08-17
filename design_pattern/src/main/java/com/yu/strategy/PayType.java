package com.yu.strategy;

import com.yu.strategy.strategies.AliPay;
import com.yu.strategy.strategies.UnionPay;
import com.yu.strategy.strategies.WechatPay;

/**
 * @className: PayType
 * @author: yu.liu
 * @date: 2019/8/17 09:07
 * @description:
 */
public enum PayType {
    ALI_PAY(new AliPay()),
    UNION_PAY(new UnionPay()),
    WECHAT_PAT(new WechatPay());

    private  Payment payment;
    PayType(Payment payment){
        this.payment = payment;
    }

    public Payment get(){
        return this.payment;
    }
}
