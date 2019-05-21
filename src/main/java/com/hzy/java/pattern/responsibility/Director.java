package com.hzy.java.pattern.responsibility;

public class Director extends Leader {
    public final static String CLASSNAME = Director.class.getSimpleName();

    public Director(Leader nextLeader) {
        super(nextLeader);
    }

    @Override
    protected void handler(int money) {
        System.out.println(CLASSNAME+"总监爽快的报销了");
    }

    @Override
    protected int limit() {
        return 5000;
    }
}
