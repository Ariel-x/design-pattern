package com.gupaoedu.vip.pattern.factory.abstractfactory;

public class UnionPayFactory implements IPayFactory {
    public IRequest getRequest() {
        return new UnionRequset();
    }

    public IRespones doSend() {
        return new UnionReponse();
    }
}
