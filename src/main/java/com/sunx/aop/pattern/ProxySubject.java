package com.sunx.aop.pattern;

/**
 * Created by sunholdIng on 2018/6/13.
 * 代理类
 */
public class ProxySubject implements Subject {

    private RealSubject realSubject;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public void request() {
        realSubject.request();
    }

    public void hello() {

    }
}
