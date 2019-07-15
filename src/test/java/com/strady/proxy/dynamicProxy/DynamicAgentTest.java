package com.strady.proxy.dynamicProxy;

import com.strady.proxy.dynamicProxy.impl.HelloImpl;
import com.strady.proxy.dynamicProxy.impl.HelloProxyImpl;
import org.junit.Test;

/**
 * @Author: strady
 * @Date: 2019/7/15
 * @Time: 20:10
 * @Description:
 */
public class DynamicAgentTest {
//    @Test
//    public void dynamicAgent_1() {
//        HelloImpl helloImpl = new HelloImpl();
//        HelloProxyImpl helloProxy = new HelloProxyImpl(helloImpl);
//        Hello hello = (Hello) Proxy.newProxyInstance(helloImpl.getClass().getClassLoader(), helloImpl.getClass().getInterfaces(), helloProxy);
//        hello.say();
//    }

    @Test
    public void dynamicAgent_2() {
        Hello helloImpl = new HelloImpl();
        Hello hello = (Hello) new HelloProxyImpl(helloImpl).getProxyInstance();
        hello.say();
    }

}
