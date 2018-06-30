package com.sunx.aop.chain;

/**
 * Created by sunholdIng on 2018/6/14.
 */
public class Client {

    static class HadlerA extends Handler{
        protected void handleProcess() {
            System.out.println("handle by a");
        }
    }

    static class HadlerB extends Handler{
        protected void handleProcess() {
            System.out.println("handle by b");
        }
    }

    static class HadlerC extends Handler{
        protected void handleProcess() {
            System.out.println("handle by c");
        }
    }


}
