package com.gupaoedu.vip.pattern.factory;

public class UnionPay implements IPay {
    public void doPay() {
        System.out.println("广银联支付");
    }
}
