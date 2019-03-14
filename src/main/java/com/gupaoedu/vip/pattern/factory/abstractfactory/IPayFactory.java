package com.gupaoedu.vip.pattern.factory.abstractfactory;

public interface IPayFactory {

    IRequest getRequest();

    IRespones doSend();



}
