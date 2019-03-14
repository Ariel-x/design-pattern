package com.gupaoedu.vip.pattern.factory.factorymethod;

import com.gupaoedu.vip.pattern.factory.IPay;
import com.gupaoedu.vip.pattern.factory.UnionPay;

public class UnionPayFactory implements IPayFactory {
    public IPay create() {
        return new UnionPay();
    }
}
