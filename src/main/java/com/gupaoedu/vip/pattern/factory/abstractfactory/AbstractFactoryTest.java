package com.gupaoedu.vip.pattern.factory.abstractfactory;

/**
 * 抽象工厂
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        IPayFactory factory = new UnionPayFactory();

        factory.getRequest().request();
        factory.doSend().send();

    }

}
