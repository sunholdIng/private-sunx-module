package com.sunx.aop.demo.service;

import org.springframework.stereotype.Service;

/**
 * Created by sunholdIng on 2018/6/29.
 */
@Service
public class ClientDemo {

    public Integer clientBefore(){
        System.out.println("excute client()");
        return 0;
    }

    public String clientBefore1(){
        System.out.println("excute client()1");
        return "ok";
    }

    public void clientBefore2(){
        System.out.println("excute client()2");
    }

}
