package com.strady.proxy.dynamicProxy.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: strady
 * @Date: 2019/1/5
 * @Time: 13:28
 * @Description: JDK动态代理
 */
public class HelloProxyImpl {

    private Object object;

    public HelloProxyImpl(Object object) {
        this.object = object;
    }

//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println("Before");
//        method.invoke(object, args);
//        System.out.println("After");
//        return null;
//    }

    /**
     * newProxyInstance方法参数说明：
     * ClassLoader loader:指定当前目标对象使用的类加载器,获取加载器的方法是固定的
     * Class<?>[] interfaces:指定目标对象实现的接口的类型,使用泛型方式确认类型
     * InvocationHandler:指定动态处理器，执行目标对象的方法时,会触发事件处理器的方法,会把当前执行目标对象的方法作为参数传入
     *
     * @return
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("Before");
                method.invoke(object, args);
                System.out.println("After");
                return null;
            }
        });
    }



}
