package com.gupaoedu.vip.pattern.factory.factorymethod;

import com.gupaoedu.vip.pattern.factory.IPay;

/**
 * 工厂方法
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        IPayFactory factory = new WeiPayFactory();
        IPay pay = factory.create();
        pay.doPay();

        factory = new UnionPayFactory();
        pay = factory.create();
        pay.doPay();

    }

}
