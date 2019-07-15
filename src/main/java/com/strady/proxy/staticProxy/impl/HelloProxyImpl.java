package com.strady.proxy.staticProxy.impl;

import com.strady.proxy.staticProxy.Hello;

/**
 * @Author: strady
 * @Date: 2019/1/5
 * @Time: 13:10
 * @Description: 静态代理
 */
public class HelloProxyImpl implements Hello {

    private HelloImpl helloImpl;

    public HelloProxyImpl(HelloImpl helloImpl) {
        this.helloImpl = helloImpl;
    }

    public void say() {
        System.out.println("Before");
        helloImpl.say();
        System.out.println("After");
    }
}
