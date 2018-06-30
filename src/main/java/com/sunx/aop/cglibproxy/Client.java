package com.sunx.aop.cglibproxy;

import com.sunx.aop.pattern.RealSubject;
import com.sunx.aop.pattern.Subject;
import org.springframework.cglib.proxy.Enhancer;

/**
 * Created by sunholdIng on 2018/6/13.
 */
public class Client {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        //设置目标代理实现类
        enhancer.setSuperclass(RealSubject.class);
        //设置通过的代理类
        enhancer.setCallback(new CglibDemo());
        Subject subject = (Subject) enhancer.create();
        subject.hello();
    }
}
