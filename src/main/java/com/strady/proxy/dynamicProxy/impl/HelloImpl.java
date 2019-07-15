package com.strady.proxy.dynamicProxy.impl;

import com.strady.proxy.dynamicProxy.Hello;

/**
 * @Author: strady
 * @Date: 2019/1/5
 * @Time: 13:27
 * @Description:
 */
public class HelloImpl implements Hello {
    public void say() {
        System.out.println("动态代理");
    }
}
