package com.gupaoedu.vip.pattern.factory.simplefactory;

import com.gupaoedu.vip.pattern.factory.IPay;
import com.gupaoedu.vip.pattern.factory.UnionPay;

/**
 * 简单工厂测试
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

        PayFactory factory = new PayFactory();
        IPay pay = factory.create(UnionPay.class);
        pay.doPay();

    }
}
