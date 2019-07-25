package com.hzy.java.pattern.responsibility;

public class Manager extends Leader {
    public final static String CLASSNAME = Manager.class.getSimpleName();

    public Manager(String name,Leader nextLeader) {
        super(name,nextLeader);
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
