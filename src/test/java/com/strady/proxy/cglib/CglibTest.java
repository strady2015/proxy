package com.strady.proxy.cglib;

import org.junit.Test;

/**
 * @Author: strady
 * @Date: 2019/7/15
 * @Time: 20:15
 * @Description:
 */
public class CglibTest {

    @Test
    public void cglib() {
        HelloImpl helloImpl = new HelloImpl();

        HelloImpl hello = (HelloImpl) new HelloProxyImpl(helloImpl).getInstance();

        hello.say();
    }
}
