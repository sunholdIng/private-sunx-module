package com.sunx.aop.jdkproxy;

import com.sunx.aop.pattern.RealSubject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by sunholdIng on 2018/6/13.
 */
public class JdkProxySubject implements InvocationHandler {
    private RealSubject realSubject;

    public JdkProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            return method.invoke(realSubject, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
