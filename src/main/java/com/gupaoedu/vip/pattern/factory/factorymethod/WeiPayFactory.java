package com.gupaoedu.vip.pattern.factory.factorymethod;

import com.gupaoedu.vip.pattern.factory.IPay;
import com.gupaoedu.vip.pattern.factory.WeiPay;

public class WeiPayFactory implements IPayFactory {
    public IPay create() {
        return new WeiPay();
    }
}
