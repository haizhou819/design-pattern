package com.hzy.java.pattern.responsibility;

public class GroupLeader extends Leader {
    // 类名，用于日志区分
    public final static String CLASSNAME = GroupLeader.class.getSimpleName();

    public GroupLeader(String name,Leader nextLeader) {
        super(name,nextLeader);
    }

    @Override
    protected void handler(int money) {
        System.out.println(CLASSNAME+"部门经理爽快的给你报了");
    }

    @Override
    protected int limit() {
        return 2000;
    }
}
