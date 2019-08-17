package com.yu.strategy;

/**
 * @className: Order
 * @author: yu.liu
 * @date: 2019/8/17 08:46
 * @description:
 */
public class Order {
    private String uid;
    private String orderId;
    private Double amount;

    public Order(String uid, String orderId, Double amount){
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }
/*
    public PayState pay(Payment payment){
        return  payment.pay(uid, amount);
    }*/

    /**
     * 解耦
     * 完美解决switch的过程，
     * 也不需要学if    else if
     * @param payType
     * @return
     */
    public PayState pay(PayType payType){
        return payType.get().pay(uid, amount);
    }
}
