package com.sunx.aop.jdkproxy;

import com.sunx.aop.pattern.RealSubject;
import com.sunx.aop.pattern.Subject;

import java.lang.reflect.Proxy;

/**
 * Created by sunholdIng on 2018/6/13.
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = (Subject) Proxy.newProxyInstance(Client.class.getClassLoader(),new Class[]{Subject.class},new JdkProxySubject(new RealSubject()));
        subject.request();
        subject.hello();

    }
}
