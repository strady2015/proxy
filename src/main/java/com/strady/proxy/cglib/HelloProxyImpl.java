package com.strady.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: strady
 * @Date: 2019/1/6
 * @Time: 9:00
 * @Description: cglib动态代理
 */
public class HelloProxyImpl implements MethodInterceptor {

    private Object object;

    public HelloProxyImpl(Object object) {
        this.object = object;
    }

    //为目标对象生成代理对象
    public Object getInstance() {
        //工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(object.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子对象代理
        return enhancer.create();
    }

    /**
     * 拦截所有目标类方法的调用
     *
     * @param o           目标类的实例
     * @param method      目标方法的反射对象
     * @param objects     方法的参数
     * @param methodProxy 代理类的实例
     * @return
     * @throws Throwable
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Before");
        method.invoke(object, objects);
        System.out.println("After");
        return null;
    }
}
