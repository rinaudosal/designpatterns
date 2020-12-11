package com.github.rinaudosal.designpatterns.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SecurityProxy implements InvocationHandler {

    private final Object object;

    private SecurityProxy(Object object) {
        this.object = object;
    }

    public static Object newInstance(Object object) {
        return java.lang.reflect.Proxy.newProxyInstance(object.getClass().getClassLoader(), object
                .getClass().getInterfaces(), new SecurityProxy(object));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        Object result;
        try {
            if (method.getName().contains("post")) {
                throw new IllegalAccessException("Posts are currently not allowed");
            } else {
                result = method.invoke(object, args);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }

}
