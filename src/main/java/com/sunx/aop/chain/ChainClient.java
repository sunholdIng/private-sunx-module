package com.sunx.aop.chain;

/**
 * Created by sunholdIng on 2018/6/14.
 */
public class ChainClient {

    static class ChainHandleA extends ChainHandler{
        protected void handleProcess() {
            System.out.println("handle by chain a");
        }
    }

    static class ChainHandleB extends ChainHandler{
        protected void handleProcess() {
            System.out.println("handle by chain b");
        }
    }

    static class ChainHandleC extends ChainHandler{
        protected void handleProcess() {
            System.out.println("handle by chain c");
        }
    }
}
