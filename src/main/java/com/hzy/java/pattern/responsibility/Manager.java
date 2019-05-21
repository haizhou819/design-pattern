package com.hzy.java.pattern.responsibility;

public class Manager extends Leader {
    public final static String CLASSNAME = Manager.class.getSimpleName();

    public Manager(Leader nextLeader) {
        super(nextLeader);
    }

    @Override
    protected void handler(int money) {
        System.out.println(CLASSNAME+"总经理给你爽快的报了");
    }

    @Override
    protected int limit() {
        return 50000;
    }
}
