package com.gupaoedu.vip.pattern.factory;

public class WeiPay implements IPay {
    public void doPay() {
        System.out.println("微信支付");
    }
}
