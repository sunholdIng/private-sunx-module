package com.sunx.aop.chain;

/**
 * Created by sunholdIng on 2018/6/14.
 *
 * 链式结构
 */
public abstract class Handler {

    private Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    public Handler getSuccessor(){
        return successor;
    }

    public void execute() {
        handleProcess();
        if (successor != null) {
            successor.execute();
        }

    }

    protected abstract void handleProcess();
}
