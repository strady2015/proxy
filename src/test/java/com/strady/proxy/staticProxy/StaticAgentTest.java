package com.strady.proxy.staticProxy;

import com.strady.proxy.staticProxy.impl.HelloImpl;
import com.strady.proxy.staticProxy.impl.HelloProxyImpl;
import org.junit.Test;

/**
 * @Author: strady
 * @Date: 2019/7/15
 * @Time: 19:52
 * @Description:
 */
public class StaticAgentTest {

    @Test
    public void noAgent() {
        Hello hello = new HelloImpl();
        hello.say();
    }

    @Test
    public void staticAgent() {
        Hello hello = new HelloProxyImpl(new HelloImpl());
        hello.say();
    }
}
