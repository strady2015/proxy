package com.strady.proxy.staticProxy.impl;

import com.strady.proxy.staticProxy.Hello;

/**
 * @Author: strady
 * @Date: 2019/1/5
 * @Time: 13:09
 * @Description:
 */
public class HelloImpl implements Hello {
    public void say() {
        System.out.println("静态代理");
    }
}
