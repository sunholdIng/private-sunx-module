package com.sunx.aop.chain;

/**
 * Created by sunholdIng on 2018/6/14.
 */
public abstract class ChainHandler {
    protected abstract void handleProcess();

    public void excute(Chain chain) {
        handleProcess();
        chain.proceed();
    }

}
