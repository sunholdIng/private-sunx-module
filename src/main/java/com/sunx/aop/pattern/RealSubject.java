package com.sunx.aop.pattern;

/**
 * Created by sunholdIng on 2018/6/13.
 * 目标代理类
 */
public class RealSubject implements Subject {
    public void request() {
        System.out.println("i'm request");
    }

    public void hello() {
        System.out.println("i'm hello");
    }
}
