package com.yu.strategy;

/**
 * @className: Payment
 * @author: yu.liu
 * @date: 2019/8/17 08:48
 * @description:
 */
public interface Payment {

   public PayState pay(String uid, Double amount);
}
