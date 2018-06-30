package com.sunx.aop.chain;

import java.util.List;

/**
 * Created by sunholdIng on 2018/6/14.
 *
 * 责任链模式
 */
public class Chain {

    private List<ChainHandler> handlers;
    private int index = 0;

    public Chain(List<ChainHandler> handlers){
        this.handlers = handlers;
    }

    public void proceed(){
        if (index>=handlers.size()){
            return;
        }
        handlers.get(index++).excute(this);
    }
}
